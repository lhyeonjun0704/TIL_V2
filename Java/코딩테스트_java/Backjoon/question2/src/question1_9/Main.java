package question1_9;

import java.util.Scanner;

public class Main {
	
	public int solution(int n, int [][] arr) {
		int answer = 0;
		int temp = 0, temp2 = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				temp += arr[i][j];
				temp2 += arr[j][i];
			}
			answer = Math.max(answer, temp);
			answer = Math.max(answer, temp2);
			temp = 0;
			temp2 = 0;
		}
		for(int i = 0; i < n; i++) {
			temp += arr[i][i];
			temp2 += arr[i][n-i-1];
			answer = Math.max(answer, temp);
			answer = Math.max(answer, temp2);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		System.out.println(T.solution(n, arr));
	}

}
