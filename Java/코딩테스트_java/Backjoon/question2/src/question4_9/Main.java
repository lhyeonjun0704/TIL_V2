package question4_9;

import java.util.Scanner;

public class Main {
	
	public int []solution(int n, int [] arr){
		int [] answer = new int[n];
		int idx = 0, temp = 0;
		for(int i = 0; i < n-1; i++) {
			idx = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
			
			
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
		for(int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for( int x : T.solution(n, arr) ) {
			System.out.print(x + " ");
		}
		
	}

}
