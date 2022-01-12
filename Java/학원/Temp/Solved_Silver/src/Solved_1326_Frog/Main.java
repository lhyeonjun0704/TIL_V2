package Solved_1326_Frog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		boolean[] ch = new boolean[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<n+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); //Ãâ¹ß µ¹ 
		int b = Integer.parseInt(st.nextToken());
		Queue<Pair> q = new LinkedList<>();
		ch[a] = true;
		q.offer(new Pair(a, 0));
		
		while(!q.isEmpty()) {
			Pair pair = q.poll();
			int x = pair.x;
			int cnt = pair.cnt;
			
			if(x == b) {
				System.out.println(cnt);
				System.exit(0);
			}
			
			for(int i = 1; x + (arr[x] * i) <= n; i++) {
				int next = x + arr[x] * i;
				if(!ch[next]) {
					ch[next] = true;
					q.offer(new Pair(next, cnt+1));
				}
			}
			
			for(int i = 1; x - (arr[x] * i) >= 1; i++) {
				int next = x - arr[x] * i;
				if(!ch[next]) {
					ch[next] = true;
					q.offer(new Pair(next, cnt+1));
				}
			}
		}
		System.out.println(-1);
		
	}
	
	static class Pair{
		int x, cnt;
		public Pair(int x, int cnt) {
			this.x = x;
			this.cnt = cnt;
		}
	}

}
