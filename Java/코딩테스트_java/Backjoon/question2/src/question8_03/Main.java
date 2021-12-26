package question8_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Object implements Comparable<Object>{
	int time;
	char spell;
	
	public Object(int time, char spell) {
		this.time = time;
		this.spell = spell;
	}
	
	@Override
	public int compareTo(Object o) {
		if(this.time == o.time) return this.spell - o.spell;
		else return this.time - o.time;
	}
	
}

public class Main {
	
	static int n, answer;
	static ArrayList<Object> list = new ArrayList<>();
	
	public int solution(ArrayList<Object> list) {
		answer = 0;
		int sum = 0;
		
		Collections.sort(list);
//		for(Object li : list) System.out.println(li.time + " " + li.spell);
		for(Object x : list) {
			if(x.spell == 's') {
				sum++;
			} else {
				sum--;
			}
			answer = Math.max(sum, answer);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n*2; i++) {
			int a = sc.nextInt();
			if(i % 2 == 0)	list.add(new Object(a, 's'));
			else list.add(new Object(a, 'e'));
		}
		System.out.println(T.solution(list));
	}

}
