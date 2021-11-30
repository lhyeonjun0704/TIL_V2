package question3_4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public int solution(String str, String str2) {
		
		HashMap<Character, Integer> temp = new HashMap<>();
		HashMap<Character, Integer> temp2 = new HashMap<>();
		int answer = 0, lt = 0;
		int n = str2.length();
		for(char x : str2.toCharArray()) temp.put(x, 1);
		
		for(int i = 0; i < n-1; i++) {
			temp2.put(str.charAt(i), 1);
		}
		
		for(int i = n-1; i < str.length(); i++) {
			temp2.put(str.charAt(i), temp2.getOrDefault(str.charAt(i), 0) + 1);
			if(temp.equals(temp2)) answer++;
			temp2.put(str.charAt(lt), temp2.get(str.charAt(lt)) - 1);
			if(temp2.get(str.charAt(lt)) == 0) temp2.remove(str.charAt(lt));
			lt++;
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		
		System.out.print(T.solution(str, str2));
	
	}

}
