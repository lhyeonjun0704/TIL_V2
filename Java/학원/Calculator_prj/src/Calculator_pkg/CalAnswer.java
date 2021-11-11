package Calculator_pkg;

import java.util.ArrayList;
import java.util.Stack;

public class CalAnswer {

//	-----------------------------------------------------------------------------------------

	public static ArrayList answerSolver(ArrayList list, int isBracket) {

		String temp;

		int i = 0;
		int j = list.size();

		while (i < j && isBracket == 0) {

			temp = list.get(i).toString();

			if (i + 1 < j && ("sin".equals(temp) || "cos".equals(temp) || "tan".equals(temp))) {

				if ("sin".equals(temp)) {
					list.set(i, Math.sin((Double) list.get(i + 1)));
				} else if ("cos".equals(temp)) {
					list.set(i, Math.cos((Double) list.get(i + 1)));
				} else if ("tan".equals(temp)) {
					list.set(i, Math.tan((Double) list.get(i + 1)));
				}

				list.remove(i + 1);
				i = 0;
				j = j - 1;

			} else
				i++;

		}

		i = 0;
		j = list.size();
		while (i < j) {

			temp = list.get(i).toString();

			if ("+".equals(temp) || "-".equals(temp) || "*".equals(temp) || "/".equals(temp)) {

				if ("+".equals(temp))
					list.set(i - 2, ((Double) list.get(i - 2) + (Double) list.get(i - 1)));
				else if ("-".equals(temp))
					list.set(i - 2, ((Double) list.get(i - 2) - (Double) list.get(i - 1)));
				else if ("*".equals(temp))
					list.set(i - 2, ((Double) list.get(i - 2) * (Double) list.get(i - 1)));
				else if ("/".equals(temp))
					list.set(i - 2, ((Double) list.get(i - 2) / (Double) list.get(i - 1)));

				list.remove(i);
				list.remove(i - 1);
				i = 0;
				j = j - 2;

			} else
				i++;

		}

		return list;
	}

//	-----------------------------------------------------------------------------------------

	public static Double answerMain(String expression) {

		ArrayList list = new ArrayList();
		Stack<String> stack = new Stack<String>();

		int sign = 1;
		int isBracket = 0;

		for (int i = 0; i < expression.length(); i++) {

			char curr = expression.charAt(i);

			if (curr == '(') { // Case of '('
				
				answerSolver(list, isBracket).get(0).toString();

				if (i != 0 && (expression.charAt(i - 1) >= 48 && expression.charAt(i - 1) <= 57)) {
					while (!stack.isEmpty() && ("*".equals(stack.peek()) || "/".equals(stack.peek()))) {
						list.add(stack.pop());
					}
					stack.push("*");
				} else if (i != 0 && expression.charAt(i - 1) != '+' && expression.charAt(i - 1) != '-'
						&& expression.charAt(i - 1) != '*' && expression.charAt(i - 1) != '/'
						&& expression.charAt(i - 1) != '(') {
					isBracket = 1;
				}
				stack.push(curr + "");

			} else if (curr == ')') { // Case of ')'

				while (!stack.isEmpty() && !"(".equals(stack.peek())) {
					list.add(stack.pop());
				}
				stack.pop();
				list = answerSolver(list, isBracket);
				isBracket = 0;

			} else if (curr == '*' || curr == '/') { // Case of '*' or '/'

				if (stack.isEmpty() || "(".equals(stack.peek())) {
					stack.push(curr + "");
				} else {
					while (!stack.isEmpty() && ("*".equals(stack.peek()) || "/".equals(stack.peek()))) {
						list.add(stack.pop());
					}
					stack.push(curr + "");
				}

			} else if (curr == '+' || curr == '-') { // Case of '+' or '-'

				if (i == 0 && (curr == '-' || curr == '+')) {
					sign = curr == '-' ? -1 : 1;
				} else if (expression.charAt(i - 1) == '(' || expression.charAt(i - 1) == '*'
						|| expression.charAt(i - 1) == '/' || expression.charAt(i - 1) == '+'
						|| expression.charAt(i - 1) == '-') {
					sign = sign == 1 ? -1 : 1;
				} else if (stack.isEmpty() || "(".equals(stack.peek())) {
					stack.push(curr + "");
				} else {
					while (!stack.isEmpty() && ("*".equals(stack.peek()) || "/".equals(stack.peek())
							|| "+".equals(stack.peek()) || "-".equals(stack.peek()))) {
						list.add(stack.pop());
					}
					stack.push(curr + "");
				}

			} else if (curr >= 48 && curr <= 57) { // Case of '0' ~ '9' or '.'

				String temp = "";
				int j = i;
				while (j < expression.length() && ((expression.charAt(j) >= 48 && expression.charAt(j) <= 57)
						|| expression.charAt(j) == '.')) {
					temp = temp + expression.charAt(j);
					j++;
				}
				i = j - 1;
				list.add(sign == 1 ? Double.parseDouble(temp) : -Double.parseDouble(temp));
				sign = 1;

			} else { // Other mathematical expression

				if (i + 2 < expression.length() && "sin".equals(expression.substring(i, i + 3))) {
					list.add("sin");
					i = i + 2;
				} else if (i + 2 < expression.length() && "cos".equals(expression.substring(i, i + 3))) {
					list.add("cos");
					i = i + 2;
				} else if (i + 2 < expression.length() && "tan".equals(expression.substring(i, i + 3))) {
					list.add("tan");
				}

			}

		}

		while (!stack.isEmpty())
			list.add(stack.pop());


		return Double.parseDouble(answerSolver(list, isBracket).get(0).toString());

	}

//	-----------------------------------------------------------------------------------------

	public static void main(String[] args) {

		String expression = "3+4(-6 * tan(21-7))*sin42/3+3(cos(2*3))";

		System.out.println(answerMain(expression));

	}

}
