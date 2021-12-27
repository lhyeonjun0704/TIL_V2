package question8_08;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// ���� �˰��� �ذ��

class Edge implements Comparable<Edge>{
	public int vex, cost; // ���� vex�� ��� cost
	Edge(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost; // ����� ���� ������ �����Ѵ�.
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		int []ch = new int[n+1]; // üũ �迭�ν� ������ �̹� �׷����� ������ �Ǿ��°��� üũ�Ѵ�.
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			// ������ �׷����̱� ������ a->b �� �Ǹ� b->c�� �ȴ�.
			graph.get(a).add(new Edge(b, c));
			graph.get(b).add(new Edge(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(1, 0));
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll(); // ����� ���� ���� ������ ���� poll�Ѵ�..
			int ev = tmp.vex; // �� ������ ���ؼ�
			if(ch[ev] == 0) { // ���� 0�̶�� ���� �׷����� ������ ���� �ʾҴٴ� ��.
				ch[ev] = 1; // �׸��� ���� ������ �Ǿ����� üũ���ش�.
				answer += tmp.cost; // �׸��� �� ������ �̾��� ������ ����� answer�� �߰��Ѵ�.
				for(Edge ob: graph.get(ev)) { 
					if(ch[ob.vex] == 0) pQ.offer(new Edge(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}

}
