package Solved_2346_Balloon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


class Node{
	int order, next;
	Node(int order, int next){
		this.order = order;
		this.next = next;
	}
}

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Node> que = new ArrayDeque<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int next = Integer.parseInt(st.nextToken());
			que.add(new Node(i, next));
		}
		
		while(!que.isEmpty()) {
			sb.append(que.getFirst().order + " ");
			int next = que.poll().next;
			if(que.isEmpty()) break;
			
			if(next > 0) {
				next -= 1;
				for(int i = 0; i < next; i++) {
					que.addLast(que.pollFirst());
				}
			} else {
				for(int i = 0; i < Math.abs(next); i++) {
					que.addFirst(que.pollLast());
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
