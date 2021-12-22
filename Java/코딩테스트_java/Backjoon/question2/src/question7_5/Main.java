package question7_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int n, m, answer = 0;
	static int[] dis;
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int n, int m) {
		ch = new int[1000];
		ch[n] = 1;
		Q.offer(n);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				int x = Q.poll();
				for(int j = 0; j < dis.length; j++) {
					int nx = x + dis[j];
					if(nx == m) return L+1;
					if(nx >= 1 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dis = new int[n];
		for(int i = 0; i < n; i++) {
			dis[i] = sc.nextInt();
		}
		m = sc.nextInt();
		System.out.println(T.BFS(0, m));
	}
}
