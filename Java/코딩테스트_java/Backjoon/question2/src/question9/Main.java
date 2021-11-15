package question9;

import java.util.Scanner;

public class Main {
	
	public int solution(String str) {
		String answer = "";
		int temp = 0;
		
		for(int i = 0; i < str.length(); i++) {
//			System.out.println(Character.isDigit(str.charAt(i)));
			if(Character.isDigit(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		temp = Integer.parseInt(answer);
		
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}

}
