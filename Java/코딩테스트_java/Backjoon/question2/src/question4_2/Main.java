package question4_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		Stack<String> stack = new Stack<>();
		char [] arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(String.valueOf(arr[i]).equals(")")) {
				while(stack.pop().equals("(") == false) {
				}
			} else stack.push(String.valueOf(arr[i]));
		}
		for(int i = 0; i < stack.size(); i++) answer += stack.get(i);
		
		
		
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
