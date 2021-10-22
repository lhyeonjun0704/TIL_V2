package q10718;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		//System.out.println(str+ " " + t);
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == t) {
//				answer++;
//			}
//		}
		
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.print(T.solution(str, c));		
		
	}
}