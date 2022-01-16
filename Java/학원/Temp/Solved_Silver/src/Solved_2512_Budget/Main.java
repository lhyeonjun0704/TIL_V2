package Solved_2512_Budget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		long answer = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long m = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		long left = 0;
		long right = arr[n-1];
		while(left <= right) {
			long mid = (left + right) / 2;
			long sum = 0;
			for(int x : arr) {
				if(x >= mid) sum += mid;
				else sum += x;
			}
			if(sum > m) {
				right = mid - 1;
			} else {
				left = mid + 1;
				answer = Math.max(answer, mid);
			}
			
		}
		
		
		System.out.println(answer);
		
	}

}
