package question3_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m, int[]arr) {
		int answer = 0;
		HashMap<Integer, Integer> HM = new HashMap<>();
		Arrays.sort(arr);
//		for(int x: arr) System.out.print(x + " ");
		
		for(int i = n-1; i >= 0 ; i--) {
			for(int j = i-1; j >= 0; j--) {
				for(int k = j-1; k >= 0; k--) {
					HM.put(arr[i]+arr[j]+arr[k], arr[i]+arr[j]+arr[k]);
					
				}
			}
		}
		Object[] temp = HM.keySet().toArray();
//		for(int x : HM.keySet()) System.out.print(x + " ");
//		System.out.println(); 
		Arrays.sort(temp);
		
		if(HM.size() < m) answer = -1;
		else answer = HM.get(temp[HM.size() - m]);
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
		
	}

}
