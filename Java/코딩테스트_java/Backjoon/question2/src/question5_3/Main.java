package question5_3;

import java.util.Scanner;

public class Main {
	
	public int []solution(int n, int []arr){
		
		for(int i = 1; i < n; i++) {
			int temp = arr[i], j;
			for(j = i-1; j >= 0 ; j--) {
				if(arr[j] > temp) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = temp;
		}
		
		
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		
	}

}
