package question9_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Question implements Comparable<Question>{
	int q, s;
	Question(int q, int s){
		this.q = q;
		this.s = s;
	}
	@Override
	public int compareTo(Question o) {
		return o.s - this.s;
	}
	
}

public class Main {

	static int n, m;
	static ArrayList<Question> list = new ArrayList<>();
	
	public int solution(ArrayList<Question> list) {
		Collections.sort(list);
		int [] dy = new int[m+1];
		
//		for(Question x : list) System.out.println(x.q + " " + x.s);
		for(int i = 0; i < list.size(); i++) {
			for(int j = m; j >= list.get(i).s; j--) {
				dy[j] = Math.max(dy[j], dy[j - list.get(i).s] + list.get(i).q);
			}
		}
		
		return dy[m];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(new Question(a ,b));
		}
		System.out.println(T.solution(list));
	}

}
