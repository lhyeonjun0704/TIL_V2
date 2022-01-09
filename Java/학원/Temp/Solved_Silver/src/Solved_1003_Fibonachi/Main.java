package Solved_1003_Fibonachi;

import java.util.Scanner;

public class Main {
	static int cntOne;
	static int cntZero;
	public static int fibonacci(int n) {
		if(n == 0) {
			cntZero++;
			return 0;
		} else if(n == 1) {
			cntOne++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		cntOne = 0;
		cntZero = 0;
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		int[] arr2 = new int[t];
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			fibonacci(n);
			arr[i] = cntZero;
			arr2[i] = cntOne;
			cntZero = 0;
			cntOne = 0;
		}
		for(int i = 0; i < t; i++) {
			System.out.println(arr[i] + " " + arr2[i]);
		}
		
		
	}

}
