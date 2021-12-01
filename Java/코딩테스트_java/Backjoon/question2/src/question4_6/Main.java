package question4_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public int solution(int n, int m) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i < n+1; i++) {
			queue.offer(i);
		}
		while(queue.size() != 1) {
			for(int i = 0; i < m-1; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();
			
		}
		answer = queue.poll();
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(T.solution(n, m));
	}

}
