package question5_6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		int temp = 0;
		for(int i = n; i >= 0 ; i--) {
			if(arr[i] < arr[i-1]) {
				stack.push(i);
				temp = arr[i];
				break;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(temp < arr[i]) {
				stack.push(i);
				break;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			answer.add(stack.pop());
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n+1];
		arr[0] = 0;
		for(int i = 1; i < n+1; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}

}
