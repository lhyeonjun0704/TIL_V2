package question6_11_plus_12;

import java.util.Scanner;

// 무방향 그래프
// 그래프와 인접행렬 G(V, E) 그래프(간선, 엣지) 로 이루어진 집합이다.
// 인접행렬을 표기할 땐 2차원 배열로 0,1로 n번 노드가 m번의 노드와 연결이 되어있음을 표기한다.

// 방향 그래프
// 방향 그래프 또한 2차배열로 표기를 하지만 n,n을 기준으로 대칭이 되지 않는다. 

// 가중치 방향그래프
// 1 2 2 (시작노드 - 도착노드 - 가중치) => graph[a][b] = c; 로 표기된다.

public class Main {
	
	static int n, m, answer = 0; // n번까지, m개의 간선이 존재 함.
	static int [][] graph; // 인접행렬으로 그래프를 표현한다.
	static int [] ch; // check로써 이미 방문한 노드는 1, 방문하지 않은 노드는 0이다.
	
	public void DFS(int v) {
		if(v == n) answer++; // 만약 노드가 n까지 도달 했을 때 answer++
		else {
			for(int i = 1; i <= n; i++) { // 총 5가지의 길이 있다고 보면 됨.
				if(graph[v][i] == 1 && ch[i] == 0) { // graph[v][i] == 1은 간선의 방향이나 유무를 확인하는 것이며, ch[i]는 그 노드를 방문했는지 확인함.
					ch[i] = 1; // 방문하지 않았으므로 1로 방문 표시 해줌.
					DFS(i); 
					ch[i] = 0; // 다시 DFSi로 돌아 오기 때문에 방문 표시를 해제한다.
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
