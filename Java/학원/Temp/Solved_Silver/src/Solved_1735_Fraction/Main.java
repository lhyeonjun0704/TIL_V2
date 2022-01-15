package Solved_1735_Fraction;

import java.util.Scanner;

public class Main {

	static int gcd(int a, int b) {
		if(b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int gcd = gcd(y1, y2);
		int boonmo = y1 * y2 / gcd;
		int boonza = (x1 * (boonmo / y1)) + (x2 * (boonmo / y2));
		gcd = gcd(boonmo, boonza);
		System.out.println(boonza / gcd + " " + boonmo / gcd);
		
	}

}
