package Solved_1051_Rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] list = new int [n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		
		int ans = 1;
		for(int i = 2; i <= ((m > n)? n: m); i++) {
			for(int j = 0; j < n-i+1; j++) {
				for(int k = 0; k < m-i+1; k++) {
					if(list[j][k] == list[j+i-1][k] && list[j][k] == list[j][k+i-1] && list[j][k] == list[j+i-1][k+i-1]) {
						if(ans < k) ans = k;
					}
				}
			}
		}
		System.out.println(ans * ans);
	}

}
