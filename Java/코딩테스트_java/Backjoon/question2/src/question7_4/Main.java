package question7_4;

import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] pm; // ����� �迭
	
	public void DFS(int L) { // L�� �׻� �����̴�.
		if(L == m) { // ������ m��ŭ á�ٸ� ���� �迭�� ����� ��.
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= n; i++) { // DFS(0) -> pm[0] = 1 -> DFS(1) / pm[0] = 2 -> DFS(1) / pm[0] = 3 -> DFS(1) �̷������� 3�� ȣ���̵ȴ�.
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
