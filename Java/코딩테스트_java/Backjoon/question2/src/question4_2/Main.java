package question4_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		Stack<String> stack = new Stack<>();
		char [] arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(String.valueOf(arr[i]).equals("(")){
				stack.push(String.valueOf(arr[i]));
				for(int j = i; j < str.length(); j++) {
					if(String.valueOf(arr[i]).equals(")")) {
						stack.push(String.valueOf(arr[i]));
						i = j;
						break;
					} else {
						stack.push(String.valueOf(arr[i]));
					}
				}
			} else answer += String.valueOf(arr[i]);
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
