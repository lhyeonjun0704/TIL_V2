package question3_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> temp = new HashMap<>();
		for(char x: str.toCharArray()) {
			temp.put(x, temp.getOrDefault(x, 0)+1); // getOrDefault -> 아무 값이 없을 때 디폴트 값을 지정해준다.
		}
		int max = 0;
		for(char x : temp.keySet()) { // key 값을 정할 떄 쓰는 것.
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
