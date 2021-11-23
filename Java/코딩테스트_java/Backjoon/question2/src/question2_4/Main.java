package question2_4;

import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int [] arr) {
		int answer = 0, temp = 0, cnt = 0, temp2 = 0;
		for(int i = 0; i < n; i++) {
			temp += arr[i];
			if(temp == m) {
				cnt++;
				temp -= arr[temp2];
				temp2++;
			} else if( temp > m) {
				while(temp > m) {
					temp -= arr[temp2];
					temp2++;
					if(temp == m) {
						cnt++;
						temp -= arr[temp2];
						temp2++;
						break;
					}
				}
			}
		}
		answer = cnt;
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}

}
