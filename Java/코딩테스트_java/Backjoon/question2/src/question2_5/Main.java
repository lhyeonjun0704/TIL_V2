package question2_5;

import java.util.Scanner;

public class Main {
	
	public int solution(int n) {
		int answer = 0, temp = 0, lt = 1;
		
		for(int i = 1; i < n; i++) {
			temp += i;
			if(temp == n) {
				answer++;
				temp -= lt;
				lt++;
			} else if(temp > n) {
				while(temp >n) {
					temp -= lt;
					lt++;
					if(temp == n) {
						answer++;
						temp -= lt;
						lt++;
						break;
					}
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(T.solution(n));
	}

}
