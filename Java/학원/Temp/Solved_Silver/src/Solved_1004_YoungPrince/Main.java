package Solved_1004_YoungPrince;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// T는 테스트 개수(행성의 개수), x1, y1은 시작점, x2, y2는 도착점
		// cx, cy 는 행성의 중점 r은 반지름 cnt는 행성을 지나갈 횟수.
		int T, n, x1, y1, x2, y2, cx, cy, r, cnt;
		T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			n = sc.nextInt();
			cnt = 0;
			for(int j = 0; j < n; j++) {
				cx = sc.nextInt();
				cy = sc.nextInt();
				r = sc.nextInt();
				// 출발점이 행성계 안과 도착점이 행성계 밖에 있을 경우에는 행성의 좌표와 출발점의 거리는 행성의 반지름보다 작다. -> Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2)
				// 출발점이 행성계 밖과 도착점이 행성계 안에 있을 경우에는 도착점과 행성계의 좌표의 거리는 행성의 넓이 보다 작다. -> Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)
				// 출발점과 도착점이 행성계 안에 있을 경우 둘을 합친다.
				// 출발점과 도착점 모두 행성계의 밖에 있을 경우는 따로 처리하지 않아도 무방하다.
				if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2) && Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) { // 출발점과 도착점이 한 행성계의 안에 있다면 cnt를 더해줄 필요가없다.
					continue;
				} else if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2) || Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) { // 만약 이 두 조건에 속하지 않다면 둘 중 하나는 행성의 밖에 있다는 것이기 때문에 cnt를 더해준다.
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
