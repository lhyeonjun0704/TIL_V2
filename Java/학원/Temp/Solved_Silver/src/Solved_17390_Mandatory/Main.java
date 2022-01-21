package Solved_17390_Mandatory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int L, R;
	static int [] answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int [] arr = new int[A+1];
		answer = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 1; i <= A; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr);
//		for(int x : arr) System.out.println(x);
		for(int i = 1; i <= A; i++) {
			arr[i] += arr[i-1];
		}
//		for(int x : arr) System.out.println(x);
		for(int i = 0; i < N; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st3.nextToken());
			R = Integer.parseInt(st3.nextToken());
			
			answer[i] = arr[R] - arr[L-1];
			
		}
		
		for(int x : answer) System.out.println(x);
	}

}
