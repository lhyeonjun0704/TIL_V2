package question1_7;

import java.util.Scanner;

public class Main {
	
	public int solution(int n, String str) {
		int answer = 0;
		String [] temp = str.split(" ");
		int k = 0;
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i].equals("0")) {
				
				k = 0;
//				System.out.println(answer);
			} else {
				k++;
				answer += k;
			}
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
