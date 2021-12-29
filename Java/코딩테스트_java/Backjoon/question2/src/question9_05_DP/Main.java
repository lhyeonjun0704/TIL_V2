package question9_05_DP;

import java.util.Arrays;
import java.util.Scanner;

// DFS ��� Dynamic Programming ���� �˰���
// dy[i] = i �ݾ��� ����µ� ��� �ּ� ���� ����
// dy[j - coin[i]] + 1

public class Main {

	static int n, m;
	static int [] coin, dy;
	
	public int solution(int [] coin) {
		
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = coin[i]; j <= m; j++) {
				dy[j] = Math.min(dy[j], dy[j-coin[i]] + 1);
			}
		}
		
		return dy[m];
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		coin = new int[n];
		for(int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		m = sc.nextInt();
		dy = new int[m+1];
		System.out.println(T.solution(coin));
	}

}
