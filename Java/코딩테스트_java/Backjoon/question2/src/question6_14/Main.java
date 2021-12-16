package question6_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph; // ArrayList�� ArrayList��ü�� ��� �׷���.
	static int [] ch, dis; // ch -> �湮�ߴ��� üũ�ϴ� �迭, dis -> �Ÿ��� üũ�ϴ� �迭�̴�.
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>(); // BFS�� ���� ť�� Ǭ��.
		ch[v] = 1; // ������. n��°���� �� �������� ���� �ּ� �������� ���� ����.
		dis[v] = 0; // �������� ���� 0��. 
		Q.offer(v); // ó�� �������� ť�� �ִ´�.
		while(!Q.isEmpty()) { // ť�� ������� ������ �ݺ��Ѵ�.
			int cv = Q.poll(); // ù ���� ���
			for(int nv : graph.get(cv)) { // ��������Ʈ�� 1: 2, 3 / 2: 3. 4 ������ ���� �Ǿ�����.
				if(ch[nv] == 0) { // ���� �湮���� ���� �����
					ch[nv] = 1; // 1�� üũ���ش�.
					Q.offer(nv); //�׸��� ť�� �߰��Ѵ�.
					dis[nv] = dis[cv] + 1; // ���� nv ��忡 �湮�� �ߴٸ� ������ �Ѱ� �þ� �� ���̱� ������ dis�� 1 �����ش�.
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
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		for(Object a : graph) {
			System.out.println(a);
		}
		T.BFS(1);
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
