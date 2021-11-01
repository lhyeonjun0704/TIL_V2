package question4;

import question4.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        
//        for(String x : str) {
//        	String tmp = new StringBuilder(x).reverse().toString(); //StringBuilder는 바뀔 수 있는 변수이고 String보다 빠르고 가벼움.
//        	answer.add(tmp);
//        }
        
        for(String x : str) {
        	char[] s = x.toCharArray();
        	int lt = 0, rt = x.length()-1;
        	while(lt < rt) {
        		char tmp = s[lt];
        		s[lt] = s[rt];
        		s[rt] = tmp;
        		lt++;
        		rt--;
        	}
        	String tmp = String.valueOf(s); // valueof는 어떤 객체든 String으로 형변환 할 수 있는 메소드이다. 
        	answer.add(tmp);
        }
        


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
        	str[i] = sc.next();
        }
        
        for(String x : T.solution(n, str)) {
        	System.out.println(x);
        }

    }
}