package Solved_11140_LOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] arr = new String[t];
		for(int i = 0; i < t; i++) {
			arr[i] = br.readLine();
		}
		int [] arr2 = new int[t];
//		for(String x : arr) System.out.println(x);

		for(int i = 0; i < t; i++) {
			if(arr[i].contains("lol")) arr2[i] = 0;
			else if(arr[i].contains("lo") || arr[i].contains("ol") || arr[i].contains("ll") || arr[i].matches(".*l(.*)l.*")) arr2[i] = 1;
			else if(arr[i].contains("l") || arr[i].contains("o")) arr2[i] = 2;
			else arr2[i] = 3;
		}
		for(int x : arr2) System.out.println(x);
	}

}
