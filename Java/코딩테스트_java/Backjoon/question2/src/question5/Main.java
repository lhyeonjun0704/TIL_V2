package question5;

import java.util.Scanner;

public class Main {

	public String solution(String str){
		String answer = "NO";
		String temp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(temp)) {
			answer = "YES";
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
