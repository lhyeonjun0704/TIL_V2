package Solved_1004_YoungPrince;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// T�� �׽�Ʈ ����(�༺�� ����), x1, y1�� ������, x2, y2�� ������
		// cx, cy �� �༺�� ���� r�� ������ cnt�� �༺�� ������ Ƚ��.
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
				// ������� �༺�� �Ȱ� �������� �༺�� �ۿ� ���� ��쿡�� �༺�� ��ǥ�� ������� �Ÿ��� �༺�� ���������� �۴�. -> Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2)
				// ������� �༺�� �۰� �������� �༺�� �ȿ� ���� ��쿡�� �������� �༺���� ��ǥ�� �Ÿ��� �༺�� ���� ���� �۴�. -> Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)
				// ������� �������� �༺�� �ȿ� ���� ��� ���� ��ģ��.
				// ������� ������ ��� �༺���� �ۿ� ���� ���� ���� ó������ �ʾƵ� �����ϴ�.
				if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2) && Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) { // ������� �������� �� �༺���� �ȿ� �ִٸ� cnt�� ������ �ʿ䰡����.
					continue;
				} else if(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2) || Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) { // ���� �� �� ���ǿ� ������ �ʴٸ� �� �� �ϳ��� �༺�� �ۿ� �ִٴ� ���̱� ������ cnt�� �����ش�.
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
