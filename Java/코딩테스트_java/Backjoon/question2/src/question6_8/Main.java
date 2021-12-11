package question6_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8. 송아지 찾기 1(BFS : 상태트리탐색)
//송아지는 움직이지 않고 제자리에 있다.
//현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
//최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
//첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
//점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.


public class Main {
	
	int answer = 0; // Level(노드의 행을 뜻함.)
	int[] dis= {1, -1, 5}; // 현수가 움직일 수 있는 방법 3가지를 미리 배열에 저장해 둔다.
	int[] ch; // 현수가 이미 방문했던 지점인지 체크하기 위한 배열.
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		ch = new int[10001]; // 좌표는 1만까지 있다.
		ch[s] = 1; // 우선 첫 번째 현수의자리(루트 노드)는 방문한 걸로 치기 때문에 1을 먼저 넣는다.
		Q.offer(s); //
		int L = 0; // level을 뜻한다.
		while(!Q.isEmpty()) {
			int len = Q.size(); // 큐에 개수만큼을 저장.
			for(int i = 0; i < len; i++) { // 큐에 개수만큼 반복문 돌린다.
				int x = Q.poll(); // 첫번째거 꺼내보자 -> 5가 나오겠지
//				if(x == e) return L;
				for(int j = 0; j < 3; j++) { // 자 여기서 3가지 방법으로 갈 수 있는 것을 체크한다.
					int nx = x + dis[j]; 
					if(nx == e) return L+1; // 만약 움직인 방법 중에 송아지의 위치에 도달하게 될 경우 그냥 바로 리턴한다.
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) { // nx는 1이상이며 1만 이하여야하고 방문여부를 확인한다.
						ch[nx] = 1; // 방문을 하지 않았을 경우 1을 넣는다.
						Q.offer(nx); // 그리고 큐에 넣는다.
					}
				}
			}
			L++; //for문이 다 돌면 레벨(행)이 하나 증가한다.
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(T.BFS(s, e));
	}

}
