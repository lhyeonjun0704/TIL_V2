package question8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "NO";
//		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String match = "[^a-zA-Z]";
		str = str.replaceAll(match, "");
//		System.out.println(str);
//		System.out.println(str);
//		String[] temp = str.split(" ");
		String temp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(temp)) return "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.solution(str));
		
	}

}
