package question8_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Object implements Comparable<Object>{
	int w, h;
	Object(int h, int w){
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Object o) {
		if(this.h == o.h) return o.w - this.w;
		else return o.h -this.h;
	}
}

public class Main {
	
	static ArrayList<Object> list = new ArrayList<>();
	static int n;

	public int solution(ArrayList<Object> list) {
		int max = Integer.MIN_VALUE, answer = 0;
		
		Collections.sort(list);		
//		for(Object x : list) System.out.println(x.w + " " + x.h);
		for(Object x : list) {
			if(x.w < max) answer++;
			else max = x.w;
		}
		
		return n - answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(new Object(a, b));
		}
		System.out.println(T.solution(list));
	}

}
