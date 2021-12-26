package question8_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Salary implements Comparable<Salary>{
	int m, d;
	public Salary(int m, int d) {
		this.m = m;
		this.d = d;
	}
	@Override
	public int compareTo(Salary o) {
		return o.d - this.d;
	}
}

public class Main {

	static int n, max = 0;
	static ArrayList<Salary> list = new ArrayList<>();
	
	public int solution(ArrayList<Salary> list) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(list);
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for( ; j < n; j++) {
				if(list.get(j).d < i) break;
				pQ.offer(list.get(j).m);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		
//		for(Salary x : list) System.out.println(x.m + " " + x.d);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(new Salary(a, b));
			if(max < b) max = b;
		}
		System.out.println(T.solution(list));
		
	}

}
