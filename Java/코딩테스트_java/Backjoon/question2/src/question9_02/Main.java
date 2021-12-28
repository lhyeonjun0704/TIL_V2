package question9_02;

import java.util.Scanner;

public class Main {

	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 2;
		dy[2] = 3;
		for(int i = 3; i <= n; i++) {
			dy[i] = dy[i-1] + dy[i -2];
		}
		return dy[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}

}
