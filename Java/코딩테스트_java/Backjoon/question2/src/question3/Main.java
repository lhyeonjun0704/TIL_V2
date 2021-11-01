package question3;

import question3.Main;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; // int의 최저 숫자 -21억으로 초기화 해줌.
//        String[] s = str.split(" "); // split으로 각 글자를 공백을 기준으로 나눈다.
//        for(String x : s){
//            int len = x.length();
//            if(len>m) {
//            	m = len;
//            	answer = x;
//            }
//        }
        
        while((pos = str.indexOf(' ')) != -1 ) {
        	String tmp = str.substring(0, pos);
        	int len = tmp.length();
        	if(len > m) {
        		m = len;
        		answer = tmp;
        	}
        	str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(T.solution(str));

    }
}