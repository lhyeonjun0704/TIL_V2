package question1_3;

import java.util.Scanner;

public class Main {
	
//	public String[] solution(int n, String str, String str2) {
//		
//		
//		return answer;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		
		String [] answer = new String [n];
		String [] temp = str.split(" ");
		String [] temp2 = str2.split(" ");
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(temp[i]) == Integer.parseInt(temp2[i])) {
				answer[i] = "D";
			} else if(Integer.parseInt(temp[i]) == 1) {
				if(Integer.parseInt(temp2[i]) == 2) answer[i] = "B";
				else answer[i] = "A";
			} else if(Integer.parseInt(temp[i]) == 2) {
				if(Integer.parseInt(temp2[i]) == 1) answer[i] = "A";
				else answer[i] = "B";
			} else if(Integer.parseInt(temp[i]) == 3) {
				if(Integer.parseInt(temp2[i]) == 1) answer[i] = "B";
				else answer[i] = "A";
			}
				
		}
		for(String x: answer) { System.out.println(x);}
		
//		System.out.println(T.solution(n, str, str2));
//		for(char x: T.solution(n, a, b).toCharArray()) System.out.println(x); // ln으로 출력 할 땐 이런 식으로 하자 이젠!
		
	}

}
