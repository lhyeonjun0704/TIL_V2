package question7_3;

import java.util.Scanner;

public class Main {
	
	static int n, m, answer = 0;
	
	public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
		if(time > m) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
			DFS(L+1, sum, time, ps, pt);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}

}
