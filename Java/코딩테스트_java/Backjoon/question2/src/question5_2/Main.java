package question5_2;

import java.util.Scanner;

public class Main {
	
	public int[] solution(int n, int[] arr) {
		int [] answer = new int[n];
		
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			answer[i] = arr[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}

}
