package question2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public ArrayList<Integer> solution(int n, int [] arr1, int m, int [] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			answer.add(arr1[i]);
		}
		for(int i = 0; i < m; i++) {
			answer.add(arr2[i]);
		}
		
		Collections.sort(answer);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr1 = new int [n];
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int [] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x: T.solution(n, arr1, m, arr2)) {
			System.out.print(x + " ");
		}		
		
	}

}
