package question6_11_plus_12;

import java.util.Scanner;

// ������ �׷���
// �׷����� ������� G(V, E) �׷���(����, ����) �� �̷���� �����̴�.
// ��������� ǥ���� �� 2���� �迭�� 0,1�� n�� ��尡 m���� ���� ������ �Ǿ������� ǥ���Ѵ�.

// ���� �׷���
// ���� �׷��� ���� 2���迭�� ǥ�⸦ ������ n,n�� �������� ��Ī�� ���� �ʴ´�. 

// ����ġ ����׷���
// 1 2 2 (���۳�� - ������� - ����ġ) => graph[a][b] = c; �� ǥ��ȴ�.

public class Main {
	
	static int n, m, answer = 0; // n������, m���� ������ ���� ��.
	static int [][] graph; // ����������� �׷����� ǥ���Ѵ�.
	static int [] ch; // check�ν� �̹� �湮�� ���� 1, �湮���� ���� ���� 0�̴�.
	
	public void DFS(int v) {
		if(v == n) answer++; // ���� ��尡 n���� ���� ���� �� answer++
		else {
			for(int i = 1; i <= n; i++) { // �� 5������ ���� �ִٰ� ���� ��.
				if(graph[v][i] == 1 && ch[i] == 0) { // graph[v][i] == 1�� ������ �����̳� ������ Ȯ���ϴ� ���̸�, ch[i]�� �� ��带 �湮�ߴ��� Ȯ����.
					ch[i] = 1; // �湮���� �ʾ����Ƿ� 1�� �湮 ǥ�� ����.
					DFS(i); 
					ch[i] = 0; // �ٽ� DFSi�� ���� ���� ������ �湮 ǥ�ø� �����Ѵ�.
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}

}
