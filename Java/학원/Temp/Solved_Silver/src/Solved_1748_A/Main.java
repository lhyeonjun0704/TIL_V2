package Solved_1748_A;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int len = n.length();
		int[] soo = new int [len+1];
		int j = 1;
		for(int i = 1; j <= len; i *= 10) {
			soo[j] = i * 9;
			j++;
		}
		int sum = 0;
		for(int i = 1; i < len; i++) {
			sum += i * soo[i];
		}
		if(len > 1) {
			sum += (len * (Integer.parseInt(n.substring(1))+1) );
		} else sum += Integer.parseInt(n);
		System.out.println(sum);
		
	}

}
