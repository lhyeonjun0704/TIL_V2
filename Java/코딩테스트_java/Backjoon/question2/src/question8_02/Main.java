package question8_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.y == o.y) return this.x - o.x;
		else return this.y -o.y;
	}
}

public class Main {

	static int n, answer, end = 0, start = 0;
	static ArrayList<Point> list = new ArrayList<>();
	
	public int solution(ArrayList<Point> list) {
		answer = 0;
		
		Collections.sort(list);
//		for(Point k : list) System.out.println(k.x + " " + k.y);
		for(Point l : list) {
			if(start <= l.x && end <= l.y) {
				answer++;
				start = l.y;
				end = l.y;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(new Point(a, b));
		}
		System.out.println(T.solution(list));
	}

}
