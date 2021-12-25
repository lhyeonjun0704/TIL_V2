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
	static int n, m, len, answer = Integer.MAX_VALUE; // len은 피자집 개수가 될것이고
	static int[] combi; // 조합을 위한 배열
	static ArrayList<Point> pz, hs; // pz => 피자집 / hs => 집(민가)
	
	public void DFS(int L, int s) {
		if(L == m) {
//			for(int x : combi) System.out.print( x + " ");
//			System.out.println();
			int sum = 0; // sum은 각 집에서의 최단 거리가 된다.
			for(Point h : hs) { // 각 집에서 조합에 맞춰 거리를 구한다.
				int dis = Integer.MAX_VALUE;
				for(int i : combi) { // combi => [0,1,2,3] , [0,2,3,1] 등등 피자집의 인덱스를 위한 것이다.
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y)); // pz는 arraylist로 get으로 꺼낸 뒤 point객체에서 x, y를 꺼내는 것을 잊지말자.
				}
				sum += dis; // 1개의 집에서 각 피자집간의 거리를 더한다.
			}
			answer = Math.min(answer, sum); // 그 이후 각 조합의 경우의 수들의 합 중 가장 작은 값을 구한다.
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
