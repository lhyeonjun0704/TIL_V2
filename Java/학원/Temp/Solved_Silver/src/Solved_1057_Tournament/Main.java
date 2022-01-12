package Solved_1057_Tournament;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int cnt = 1;
		if(m2 > m1) {
			int temp = m2;
			m2 = m1;
			m1 = temp;
		}
		while(m1 % 2 != 0 || m1-m2 != 1) {
			if(m1 % 2 != 0) {
				m1 = (m1 + 1) / 2;
			} else m1 /= 2;
			if(m2 % 2 != 0) {
				m2 = (m2 + 1) / 2;
			} else m2 /= 2;
			cnt++;
		}
		if(m1 - m2 > 1) cnt = -1;
		System.out.println(cnt);
	}

}
