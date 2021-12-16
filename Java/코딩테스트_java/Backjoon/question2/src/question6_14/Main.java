package question6_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph; // ArrayList에 ArrayList객체를 담는 그래프.
	static int [] ch, dis; // ch -> 방문했는지 체크하는 배열, dis -> 거리를 체크하는 배열이다.
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>(); // BFS는 역시 큐로 푼다.
		ch[v] = 1; // 시작점. n번째에서 각 정점으로 가는 최소 간선수를 구할 것임.
		dis[v] = 0; // 시작점은 간선 0개. 
		Q.offer(v); // 처음 시작점을 큐에 넣는다.
		while(!Q.isEmpty()) { // 큐가 비어있을 때까지 반복한다.
			int cv = Q.poll(); // 첫 시작 노드
			for(int nv : graph.get(cv)) { // 인접리스트로 1: 2, 3 / 2: 3. 4 등으로 저장 되어있음.
				if(ch[nv] == 0) { // 만약 방문하지 않은 노드라면
					ch[nv] = 1; // 1로 체크해준다.
					Q.offer(nv); //그리고 큐에 추가한다.
					dis[nv] = dis[cv] + 1; // 이제 nv 노드에 방문을 했다면 간선이 한개 늘어 난 것이기 때문에 dis는 1 더해준다.
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
