package question6_1;

import java.util.Scanner;

public class Main {
	
	// 스택프레임 
	public void DFS(int n) {
		if(n==0) return; // 함수 종료의 의미인 return
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.DFS(n);
	}

}
