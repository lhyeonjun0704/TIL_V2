package Solved_1072_Game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long z = 100 * m / n;
		
		if(z >= 99) {
			System.out.println(-1);
		} else {
			long start = 0;
			long end = 2000000000;
			
			while(start < end) {
				long mid = (start + end) / 2;
				long ret = 100 * (m + mid) / (n + mid);
				
				if(ret > z) {
					end = mid;
				} else {
					start = mid+1;
				}
			}
			System.out.println(end);
		}
		
	}

}

