package question6_1;

import java.util.Scanner;

public class Main {
	
	// ���������� 
	public void DFS(int n) {
		if(n==0) return; // �Լ� ������ �ǹ��� return
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
