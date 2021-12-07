   package question5_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			} else sum += x;
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); //max�� �ص� internal max(int)�� ��ȯ�Ǳ� ������ getAsint();�� �޾ƾߵȴ�.
		int rt = Arrays.stream(arr).sum(); // ������ sum�� int�� ��ȯ�ϱ� ������ getAsInt�� �ٿ� �� �ʿ䰡 ����.
		while(lt <= rt) {
			int mid = (lt+rt) / 2;
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid -1;
			} else lt = mid + 1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}

}
