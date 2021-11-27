package question3_3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public int[] solution(int n, int m, int[]arr) {
		int [] answer = new int [n - m + 1];
		HashMap<Integer, Integer> temp = new HashMap<>();
		for(int j = 0; j < n - m + 1; j++) {
			for(int i = j; i < j+m; i++) {
				temp.put(arr[i], temp.getOrDefault(arr[i], 0) + 1);
			}
			answer[j] = temp.size();
			temp.clear();
		}
		
//		for(int x : answer) {
//			System.out.println(x);
//		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x: T.solution(n, m, arr)) {
			System.out.print(x + " ");
		}
		
	}

}
