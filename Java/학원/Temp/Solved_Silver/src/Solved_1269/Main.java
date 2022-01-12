package Solved_1269;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int temp = sc.nextInt();
			hm.put(temp, hm.getOrDefault(temp, 0) + 1);
		}
		
		for(int i = 0; i < b; i++) {
			int temp = sc.nextInt();
			hm.put(temp, hm.getOrDefault(temp, 0) + 1);
		}
		
		for(int x : hm.keySet()) {
			if(hm.get(x) == 1) answer++;
		}
		System.out.println(answer);
	}

}
