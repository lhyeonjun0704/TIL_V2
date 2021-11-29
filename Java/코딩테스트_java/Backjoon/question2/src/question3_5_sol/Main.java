package question3_5_sol;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public int solution(int[]arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // Treeset인데 내림차순 정렬로 지정하는 것.
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int l = j+1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			} 
		}
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}

}
