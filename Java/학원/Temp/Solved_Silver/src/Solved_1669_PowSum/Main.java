package Solved_1669_PowSum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while(n != 0) {
			if(Math.sqrt(n) <= 1) {
				n -= 1;
				cnt++;
			} else {
				n -= Math.pow(Math.floor(Math.sqrt(n)), 2);
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
