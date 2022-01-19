package Solved_2992_num;

import java.util.Scanner;

public class Main {
	static String x;
	static int min;
	static boolean f;
	public static void DFS(int[] arr, int[] output, boolean[] ch, int depth, int r) {
		if(depth == x.length()) {
			String tmp = "";
			for(int x : output) tmp += String.valueOf(x);
			if(Integer.parseInt(tmp) > Integer.parseInt(x)) {
				min = Math.min(min, Integer.parseInt(tmp));

			} 
			
		} else {
			for(int i = 0; i < arr.length; i++) {
				if(!ch[i]) {
					ch[i] = true;
					output[depth] = arr[i];
					DFS(arr, output, ch, depth+1, x.length());
					ch[i] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		min = Integer.MAX_VALUE;
		int [] arr = new int[x.length()];
		int [] output = new int [arr.length];
		boolean[] ch = new boolean[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(x.charAt(i));
		}
		
		
		DFS(arr, output, ch, 0, x.length());
		if(min == Integer.MAX_VALUE) {
			System.out.println(0);
		}else {
			System.out.println(min);
		}
		
	}

}
