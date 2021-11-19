package question1_2;

import java.util.Scanner;

public class Main {
	
	public int solution(int n, String str) {
		int answer = 0;
		int high = 0;
		String [] temp = str.split(" ");
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(temp[i]) > high) {
				high = Integer.parseInt(temp[i]);
				answer++;
			} else continue;
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println(T.solution(n, str));
	}

}
