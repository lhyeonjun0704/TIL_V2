package Solved_2548_;

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
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		for(int x : arr) System.out.println(x);
		Arrays.sort(arr);
		if(arr.length == 1) System.out.println(arr[0]);
		else if(arr.length % 2 == 0) System.out.println(arr[arr.length / 2 - 1]);
		else System.out.println(arr[arr.length / 2 + 1]);
	}

}
