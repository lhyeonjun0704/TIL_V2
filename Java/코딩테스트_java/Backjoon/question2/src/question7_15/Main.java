package question7_15;

import java.util.ArrayList;
import java.util.Scanner;

class Point{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int n, m, len, answer = Integer.MAX_VALUE; // len�� ������ ������ �ɰ��̰�
	static int[] combi; // ������ ���� �迭
	static ArrayList<Point> pz, hs; // pz => ������ / hs => ��(�ΰ�)
	
	public void DFS(int L, int s) {
		if(L == m) {
//			for(int x : combi) System.out.print( x + " ");
//			System.out.println();
			int sum = 0; // sum�� �� �������� �ִ� �Ÿ��� �ȴ�.
			for(Point h : hs) { // �� ������ ���տ� ���� �Ÿ��� ���Ѵ�.
				int dis = Integer.MAX_VALUE;
				for(int i : combi) { // combi => [0,1,2,3] , [0,2,3,1] ��� �������� �ε����� ���� ���̴�.
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y)); // pz�� arraylist�� get���� ���� �� point��ü���� x, y�� ������ ���� ��������.
				}
				sum += dis; // 1���� ������ �� ���������� �Ÿ��� ���Ѵ�.
			}
			answer = Math.min(answer, sum); // �� ���� �� ������ ����� ������ �� �� ���� ���� ���� ���Ѵ�.
		} else {
			for(int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1) hs.add(new Point(i, j));
				else if(tmp == 2) pz.add(new Point(i, j));
			}
		}
		len = pz.size();
		combi = new int [m];
		T.DFS(0, 0);
		System.out.println(answer);
	}

}
