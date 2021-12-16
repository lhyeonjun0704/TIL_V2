package question7_2;

import java.util.Scanner;

public class Main {
	static int c, n, answer = 0;
	static int[] ch, arr;
	
	public void DFS(int L, int sum, int []arr) {
		if(sum > c) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}

}
