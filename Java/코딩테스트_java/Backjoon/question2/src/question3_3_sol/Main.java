package question3_3_sol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
		public ArrayList<Integer> solution(int n, int k, int[] arr){
			ArrayList<Integer> answer = new ArrayList<>();
			HashMap<Integer, Integer> HM = new HashMap<>();
			// HashMap�� k-1�� ��ŭ�� ������ ���� ���� �ִ´�.
			for(int i = 0; i < k-1; i++) {
				HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
			}
			// ���� K������ �����̵� �����츦 �����Ѵ�.
			int lt = 0; // lt�� 0���� �ʱ�ȭ �����ش�.
			for(int rt = k-1; rt < n; rt++) {
				HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1); //K��°�� ���� �ִ´�. ������ 1�� �ִ´�.
				answer.add(HM.size()); // answer�� HM ����� �־��ָ� �ϼ� ���� ���� ������ ���� �� ����.
				HM.put(arr[lt], HM.get(arr[lt]) -1); // �׸��� �����̵� �������� �������� ù��°�� ����lt��°�� ���� �Ѱ� �����.
				if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]); // 1�� ���߾��� �� ���� ���� 0�̶�� �� Ű�� ��ü�� �������ش�.
				lt++; // �׸��� lt�� �ϳ��� �����ϸ� �ȴ�.
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
