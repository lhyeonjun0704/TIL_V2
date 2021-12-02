package question4_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public String solution(String str, String str2) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for(Character x : str.toCharArray()) queue.offer(x);
		for(Character x: str2.toCharArray()) {
			if(queue.contains(x))
				if(x != queue.poll()) return "NO";
		}
		
		if(!queue.isEmpty()) return "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		
		System.out.println(T.solution(str, str2));
	}

}
