package question8_08;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 프림 알고리즘 해결법

class Edge implements Comparable<Edge>{
	public int vex, cost; // 간선 vex와 비용 cost
	Edge(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost; // 비용이 낮은 순으로 정렬한다.
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
		int []ch = new int[n+1]; // 체크 배열로써 정점이 이미 그래프에 포함이 되었는가를 체크한다.
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			// 무방향 그래프이기 때문에 a->b 도 되며 b->c도 된다.
			graph.get(a).add(new Edge(b, c));
			graph.get(b).add(new Edge(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(1, 0));
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll(); // 비용이 제일 작은 간선을 먼저 poll한다..
			int ev = tmp.vex; // 그 지점을 통해서
			if(ch[ev] == 0) { // 만약 0이라면 아직 그래프에 포함이 되지 않았다는 것.
				ch[ev] = 1; // 그리고 이젠 포함이 되었음을 체크해준다.
				answer += tmp.cost; // 그리고 그 간선을 이었을 때에의 비용을 answer에 추가한다.
				for(Edge ob: graph.get(ev)) { 
					if(ch[ob.vex] == 0) pQ.offer(new Edge(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}

}
