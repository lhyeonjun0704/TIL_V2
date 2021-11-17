package question12;

import java.util.Scanner;

public class Main {
	
	public String solution(int nums, String str) {
		String answer = "";
		str = str.replace("#", "1");
		str = str.replace("*", "0");
		String temp = "";
		int temp1 = 0;
		
//		System.out.println(str);
//		System.out.println(Integer.parseInt("1000011", 2));
		for(int i = 0; i < str.length(); i++) {
			if(i % 7 == 6 & i >0) {
				temp += String.valueOf(str.charAt(i));
				temp1 = Integer.parseInt(temp, 2);
				answer += (char)temp1;
				temp = "";
//				System.out.println(temp1);
			} else {
				temp += String.valueOf(str.charAt(i));
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int nums = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(nums, str));
	}

}
