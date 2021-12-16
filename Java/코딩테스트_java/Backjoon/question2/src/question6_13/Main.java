package question6_13;

import java.util.ArrayList;
import java.util.Scanner;

// n개의 리스트 객체 생성
// 1 -> 2 - 3 - 4
// 2 -> 1 - 3 - 5
// 3 -> 4
// 4 -> 2 - 5
// 5 -> 

public class Main {

	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int [] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i< n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
	}

}
