package Solved_1932_Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);

			}
		}

		if(n == 1) {
			System.out.println(arr[0][0]);
			return;
		}
		
		int max = 0;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				if(j > 0 && j <= i-1 ) {
					arr[i][j] = Math.max(arr[i-1][j] + arr[i][j], arr[i-1][j-1] + arr[i][j]);
					max = Math.max(max, arr[i][j]);
				} else if(j == 0) {
					arr[i][j] = arr[i-1][j] + arr[i][j];
					max = Math.max(max, arr[i][j]);
				} else if(j == i) {
					arr[i][j] = arr[i-1][j-1] + arr[i][j];
					max = Math.max(max, arr[i][j]);
				}
			}
		}
		System.out.println(max);
	}

}
