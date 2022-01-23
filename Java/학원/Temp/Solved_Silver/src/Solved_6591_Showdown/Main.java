package Solved_6591_Showdown;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static long n, k;
	static long answer = 0;
	static long [] arr;
	static boolean[] visited;
	
	public static void combination(long[] arr, boolean[] visited, long start, long n, long r) {
		if(r == 0) {
			answer++;
			return;
		}
		
		for(long i = start; i < n; i++) {
			visited[(int)i] = true;
			combination(arr, visited, i+1, n, r-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> ans = new ArrayList<>();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Long.parseLong(st.nextToken());
			k = Long.parseLong(st.nextToken());
			if(n == 0 && k == 0) break;
			arr = new long[(int)n];
			visited = new boolean[(int)n];
			combination(arr, visited, 0, n, k);
			ans.add(answer);
		}
		
		for(long x : ans) System.out.println(x);
		
	}

}
