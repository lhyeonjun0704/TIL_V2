package Solved_1270_Combat;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			for(int j = 0; j < temp; j++) {
				int tmp = sc.nextInt();
				hm.put(tmp, hm.getOrDefault(tmp, 0) + 1);
			}
			boolean flag = true;
			for(int x : hm.keySet()) {
				flag = true;
				if(hm.get(x) >= temp/2 + 1) {
					arr[i] = String.valueOf(x);
					break;
				} else flag = false;
				
			}
			if(!flag) arr[i] = "SYJKGW";
			hm.clear();
		}
		for(String x : arr) System.out.println(x);
		
	}

}
