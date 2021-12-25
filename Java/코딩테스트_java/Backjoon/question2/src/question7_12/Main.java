package question7_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static Queue<Point> Q = new LinkedList<>();
	static int[][] board, dis;

	public void BFS() {
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < m && ny >= 0 && ny < n && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
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
		board = new int[m][n];
		dis = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1) Q.offer(new Point(i,j));
			}
		}
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 0) flag = false;
			}
		}
		if(flag) {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		} else System.out.println(-1);
		
	}

}
