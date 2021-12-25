package question7_9;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int [] pm;
	
	public void DFS(int L, int s) {
		if(L == m) {
			for(int x : pm)	System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = s; i <= n; i++) {
				pm[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int [m];
		T.DFS(0, 1);
	}

}

