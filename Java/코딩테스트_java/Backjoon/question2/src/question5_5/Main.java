package question5_5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public String solution(int n, int[] arr) {
		String answer = "U";
		
		HashMap<Integer, Integer> HM = new HashMap<>();
		
		for(int x: arr) {
			HM.put(x, HM.getOrDefault(x, 0) + 1);
			if(HM.get(x) > 1) return "D";
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, arr));
	}

}
