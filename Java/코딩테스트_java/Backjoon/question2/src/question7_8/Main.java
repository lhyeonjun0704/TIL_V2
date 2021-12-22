package question7_8;

import java.util.Scanner;

public class Main {
	
	static int[] b, p, ch; // b -> combination , p -> 순열, ch -> 체크
	static int n, f; 
	boolean flag = false; // 재귀 멈추기위한 false
	int[][] dy = new int[35][35]; // 메모이제이션
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(n == r || r == 0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}
	
	public void DFS(int L, int sum) {
		if(flag) return;
		if(L == n) {
			if(sum == f) {
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
			
		} else {
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					DFS(L+1, sum+(p[L] * b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f = sc.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1]; // 체크 -> 숫자를 1부터 사용해야되기 때문에 n+1로 만들어준다.
		for(int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i); // 미리 콤비네이션 값 구한다. n-1 C 0 ~ n-1;
		}
		T.DFS(0, 0);
	}

}
