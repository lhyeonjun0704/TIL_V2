package question5_10;

import java.util.Arrays;
import java.util.Scanner;

public class Resolution {
	
	public int count(int []arr, int dist) {
		int cnt = 1; // ù���� ���� ��ġ�����ν� cnt�� 1
		int endposition = arr[0]; // ù��° ���� ��ġ�� ������ �迭�� 0��°�� ���´�. �׷��� �ִ밪�� ���� �� �ִ�. 
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - endposition >= dist) { // mid�� �Ѿ�� �Ÿ����� ũ�ų� ���ٸ� ���� ��ġ �� �� �ִ�.
				cnt++; // �� �Ѹ����� �� ��ġ��.
				arr[i] = endposition; // �׸��� ��ġ�� ������ ���� ���� endpoint�� �ٲ��ش�.
			}
		}
		
		return cnt;
	}

	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); // ���� �˰����� ���ؼ� ���� �迭�� ������������ �����Ѵ�.
		int lt = arr[0], rt = arr[n-1]; // lt�� rt�� ����, lt�� �迭�� ù ��° ����, rt�� ������(�ִ� ��) ���ڷ� �ʱ�ȭ�Ѵ�.
		while(lt <= rt) { // lt�� rt���� Ŀ�� ������ �ݺ��Ѵ�.
			int mid = (lt+rt) / 2; // mid(�߰���)�� lt+rt / 2
			if(count(arr, mid) >= c) {
				answer = mid; // answer�� mid�� ���� ��� �� �� �ִ����� �Ǻ��ϴ� ���̹Ƿ� �ٸ� �� ���� ���� ã�� ���� for���� ��� ����.
				lt = mid + 1;
			} else rt = mid - 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, c, arr));
	}

}
