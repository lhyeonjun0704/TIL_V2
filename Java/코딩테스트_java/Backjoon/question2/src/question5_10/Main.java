package question5_10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int endposition = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - endposition >= dist) {
				cnt++;
				endposition = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		while(lt <= rt) {
			int mid = (lt+rt) / 2;
			if(count(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else rt = mid - 1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, c, arr));
	}

}
