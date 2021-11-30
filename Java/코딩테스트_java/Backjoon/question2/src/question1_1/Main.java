package question1_1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public int solution(int n, int m, int [][]arr, int []arr2) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[j][arr2[i]-1] == 0) continue;
				else {
					stack.push(arr[j][arr2[i]-1]);
					if(stack.size() > 1 ) {
						while(stack.get(stack.size()-1) == stack.get(stack.size()-2)) {
							stack.remove(stack.size()-1);
							stack.remove(stack.size()-2);
							answer += 2;
						}
					}
					break;
				}
			}
		}
		
		for(int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n , m, arr, arr2));
		
	}

}
