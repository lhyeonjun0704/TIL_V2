package Solved_17212_MoonRabit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		int[] k = {1, 2, 5, 7};
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[5] = 1;
		dp[7] = 1;
		for(int i = 3; i <= n; i++) {
			for(int j = 0; j < 4; j++) {
				if(i < k[j]) break;
				dp[i] = Math.min(dp[i], dp[i - k[j]] + 1);
			}
		}
		System.out.println(dp[n]);
	}

}
