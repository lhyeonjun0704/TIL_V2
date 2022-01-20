package Solved_5545_Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		Integer[] topping = new Integer[n+1];
		for(int i = 1; i <= n; i++) {
			topping[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(topping, 1, topping.length, Collections.reverseOrder());
//		for(int x: topping) System.out.println(x);
		
		int sum = c;
		int cal = sum / (a + (b * 0));
//		System.out.println(cal);
		int max = 0;
		for(int i = 1; i <= n; i++) {
			sum += topping[i];
			
			cal = Math.max(cal, sum / (a + (b * i)));
//			System.out.println(cal);
		}
		
		System.out.println(cal);
		
	}

}
