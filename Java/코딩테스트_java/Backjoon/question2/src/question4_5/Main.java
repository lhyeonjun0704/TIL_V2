package question4_5;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		char last = ' ';
		for(char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
				last = '(';
			} else if(x == ')') {
				if(last == '(') {
					stack.pop();
					answer += stack.size();
				} else if( last == ')' ) {
					stack.pop();
					answer += 1;
				}
				last = ')';
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}
