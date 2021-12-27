package question8_06_unionfind;

import java.util.Scanner;

public class Main {
	static int n, m;
	static int []unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int k = Find(a);
		int j = Find(b);
		if(k != j) unf[k] = j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		unf = new int[n+1];
		for(int i = 1; i <= n; i++) unf[i] = i;
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Union(a, b);
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) System.out.println("NO");
		else System.out.println("YES");
	}

}
