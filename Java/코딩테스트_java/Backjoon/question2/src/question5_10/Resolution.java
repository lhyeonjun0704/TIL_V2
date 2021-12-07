package question5_10;

import java.util.Arrays;
import java.util.Scanner;

public class Resolution {
	
	public int count(int []arr, int dist) {
		int cnt = 1; // 첫번재 말을 배치함으로써 cnt는 1
		int endposition = arr[0]; // 첫번째 말의 배치는 무조건 배열의 0번째에 놓는다. 그래야 최대값을 구할 수 있다. 
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - endposition >= dist) { // mid로 넘어온 거리보다 크거나 같다면 말을 배치 할 수 있다.
				cnt++; // 말 한마리를 더 배치함.
				arr[i] = endposition; // 그리고 배치한 다음의 말을 위해 endpoint를 바꿔준다.
			}
		}
		
		return cnt;
	}

	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); // 결정 알고리즘을 위해서 먼저 배열을 오름차순으로 정렬한다.
		int lt = arr[0], rt = arr[n-1]; // lt와 rt를 선언, lt는 배열의 첫 번째 숫자, rt는 마지막(최대 값) 숫자로 초기화한다.
		while(lt <= rt) { // lt가 rt보다 커질 때까지 반복한다.
			int mid = (lt+rt) / 2; // mid(중간값)는 lt+rt / 2
			if(count(arr, mid) >= c) {
				answer = mid; // answer은 mid의 값이 사용 될 수 있는지만 판별하는 것이므로 다른 더 좋은 값을 찾기 위해 for문은 계속 돈다.
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
