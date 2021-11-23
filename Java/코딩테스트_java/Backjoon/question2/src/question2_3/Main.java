package question2_3;

// 슬라이딩 윈도우?

import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int [] arr) {
		int answer = 0;
		int temp = 0;
		
		for(int i = 0; i < m; i++) temp += arr[i];
		answer = temp;
		for(int i = 1; i < n-m+1; i++) {
			temp += arr[i + m - 1];
			temp -= arr[i-1];
			if(answer < temp) answer = temp;
//			System.out.println(answer);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}

}
