package Solved_2792_gem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] arr = new int[m];
		long sum = 0;
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int x : arr) sum += x;
		
		System.out.println(sum / n + 1);
		
	}

}
