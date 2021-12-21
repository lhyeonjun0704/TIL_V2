package question7_4;

import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] pm; // 출력할 배열
	
	public void DFS(int L) { // L은 항상 레벨이다.
		if(L == m) { // 레벨이 m만큼 찼다면 이제 배열을 출력할 것.
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) { // DFS(0) -> pm[0] = 1 -> DFS(1) / pm[0] = 2 -> DFS(1) / pm[0] = 3 -> DFS(1) 이런식으로 3번 호출이된다.
				pm[L] = i; 
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		T.DFS(0);
	}

}
