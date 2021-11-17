package question10;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		int n = 1000;
		
		String [] temp = str.split(" ");
//		System.out.println(temp[0]);
		char [] s = temp[0].toCharArray();
		char [] t = temp[1].toCharArray();
		int [] answer_re = new int[100];
//		System.out.println(s.length);
//		System.out.println("e" == temp[1]);
		for(int i = 0; i < s.length; i++) {
			if(s[i] == t[0]) {
				n = 0;
				answer_re[i] = n;
			} else {
				n++;
				answer_re[i] = n;
			}
		}
		n = 1000;
		
		for(int i = s.length-1; i >= 0; i--) {
			if(s[i] == t[0]) {
				n = 0;
				answer_re[i] = n;
			} else {
				n++;
				if(answer_re[i] > n) {
					answer_re[i] = n;
				}
			}
		}
		
		for(int i = 0; i < s.length; i++) {
//			System.out.println(answer_re[i]);
			answer += answer_re[i] + " ";
		}
		
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
