package question2;

import question2.Main;

import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
				
		
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//			else answer += Character.toLowerCase(x);
//		}
		
		for(char x : str.toCharArray()) {
			if(x >= 65 & x <= 90) answer += Character.toLowerCase(x);
			else answer += Character.toUpperCase(x);
			
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		
		System.out.print(T.solution(str));		
		
	}
}