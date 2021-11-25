package question3_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> temp = new HashMap<>();
		for(char x: str.toCharArray()) {
			temp.put(x, temp.getOrDefault(x, 0)+1); // getOrDefault -> �ƹ� ���� ���� �� ����Ʈ ���� �������ش�.
		}
		int max = 0;
		for(char x : temp.keySet()) { // key ���� ���� �� ���� ��.
//			System.out.println(x + " " + temp.get(x));
			if(temp.get(x) > max ) {
				max = temp.get(x);
				answer = x;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(T.solution(n, str));
	}

}
