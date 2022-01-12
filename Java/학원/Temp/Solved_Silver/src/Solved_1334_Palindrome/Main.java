package Solved_1334_Palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		for(long i = Long.parseLong(n)+1 ; i < Long.MAX_VALUE; i++) {
			String pal = new StringBuilder(String.valueOf(i)).reverse().toString();
			if(pal.equals(String.valueOf(i))) {
				System.out.println(String.valueOf(i));
				System.exit(0);
			}
		}
	}

}
