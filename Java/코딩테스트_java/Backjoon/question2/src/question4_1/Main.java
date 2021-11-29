package question4_1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public String solution(String str) {
		String answer = "YES";
		char [] arr = str.toCharArray();
		Stack<String> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			if(String.valueOf(arr[i]).equals("(")) stack.push(String.valueOf(arr[i]));
			else {
				if(stack.isEmpty() == false) stack.pop();
				else return "NO";
			}
		}
		if(stack.isEmpty() == false) return "NO";
		
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
