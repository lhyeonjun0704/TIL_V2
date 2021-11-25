package question3_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public String solution(String str1, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> temp1 = new HashMap<>();
		HashMap<Character, Integer> temp2 = new HashMap<>();
		
		for(char x : str1.toCharArray()) {
			temp1.put(x, temp1.getOrDefault(x, 0) + 1);
		}
		for(char x : str2.toCharArray()) {
			temp2.put(x, temp2.getOrDefault(x, 0) + 1);
		}
		for(char x: temp1.keySet()) {
//			System.out.println(x + " " + temp1.get(x));
			if(temp1.get(x) != temp2.get(x)) answer = "NO";
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(T.solution(str1, str2));
	}

}
