package question3_3_sol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
		public ArrayList<Integer> solution(int n, int k, int[] arr){
			ArrayList<Integer> answer = new ArrayList<>();
			HashMap<Integer, Integer> HM = new HashMap<>();
			// HashMap에 k-1개 만큼의 개수를 먼저 집어 넣는다.
			for(int i = 0; i < k-1; i++) {
				HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
			}
			// 이제 K개부터 슬라이딩 윈도우를 실행한다.
			int lt = 0; // lt를 0으로 초기화 시켜준다.
			for(int rt = k-1; rt < n; rt++) {
				HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1); //K번째의 값을 넣는다. 없으면 1로 넣는다.
				answer.add(HM.size()); // answer에 HM 사이즈를 넣어주면 일수 간에 매출 개수를 얻을 수 있음.
				HM.put(arr[lt], HM.get(arr[lt]) -1); // 그리고 슬라이딩 윈도우의 개념으로 첫번째의 숫자lt번째의 값을 한개 낮춘다.
				if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]); // 1을 낮추었을 때 만약 값이 0이라면 그 키값 자체를 삭제해준다.
				lt++; // 그리고 lt를 하나씩 증가하면 된다.
			}
			
			
			return answer;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}

}
