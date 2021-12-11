package question6_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8. �۾��� ã�� 1(BFS : ����Ʈ��Ž��)
//�۾����� �������� �ʰ� ���ڸ��� �ִ�.
//������ ��ī�� ������ Ÿ�� ���µ� �� ���� ������ ������ 1, �ڷ� 1, ������ 5�� �̵��� �� �ִ�.
//�ּ� �� ���� ������ ������ �۾����� ��ġ���� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
//ù ��° �ٿ� ������ ��ġ S�� �۾����� ��ġ E�� �־�����. ������ ��ǥ ���� 1���� 10,000�����̴�.
//������ �ּ�Ƚ���� ���Ѵ�. ���� 1�̻��̸� �ݵ�� �����մϴ�.


public class Main {
	
	int answer = 0; // Level(����� ���� ����.)
	int[] dis= {1, -1, 5}; // ������ ������ �� �ִ� ��� 3������ �̸� �迭�� ������ �д�.
	int[] ch; // ������ �̹� �湮�ߴ� �������� üũ�ϱ� ���� �迭.
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		ch = new int[10001]; // ��ǥ�� 1������ �ִ�.
		ch[s] = 1; // �켱 ù ��° �������ڸ�(��Ʈ ���)�� �湮�� �ɷ� ġ�� ������ 1�� ���� �ִ´�.
		Q.offer(s); //
		int L = 0; // level�� ���Ѵ�.
		while(!Q.isEmpty()) {
			int len = Q.size(); // ť�� ������ŭ�� ����.
			for(int i = 0; i < len; i++) { // ť�� ������ŭ �ݺ��� ������.
				int x = Q.poll(); // ù��°�� �������� -> 5�� ��������
//				if(x == e) return L;
				for(int j = 0; j < 3; j++) { // �� ���⼭ 3���� ������� �� �� �ִ� ���� üũ�Ѵ�.
					int nx = x + dis[j]; 
					if(nx == e) return L+1; // ���� ������ ��� �߿� �۾����� ��ġ�� �����ϰ� �� ��� �׳� �ٷ� �����Ѵ�.
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) { // nx�� 1�̻��̸� 1�� ���Ͽ����ϰ� �湮���θ� Ȯ���Ѵ�.
						ch[nx] = 1; // �湮�� ���� �ʾ��� ��� 1�� �ִ´�.
						Q.offer(nx); // �׸��� ť�� �ִ´�.
					}
				}
			}
			L++; //for���� �� ���� ����(��)�� �ϳ� �����Ѵ�.
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
