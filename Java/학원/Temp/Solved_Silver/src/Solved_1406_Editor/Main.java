package Solved_1406_Editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String answer = "";
//		String conts = br.readLine();
//		LinkedList<Character> list = new LinkedList<>();
//		for(int i = 0; i < conts.length(); i++) list.add(conts.charAt(i));
//		int n = Integer.parseInt(br.readLine());
//		int cur = list.size();
////		System.out.println(conts.substring(0, cur+1) + " " + conts.substring(cur+1, conts.length()));
//		for(int i = 0; i < n; i++) {
//			String next = br.readLine();
//			if(next.contains("P")) {
//				char[] arr = next.toCharArray();
////				System.out.println(arr[2]);
//				if(cur > list.size()) list.add(arr[2]);
//				else list.add(cur, arr[2]);
//				cur += 1;
//			} else if(next.equals("L")) {
//				if(cur > 0) cur -= 1;
//			} else if(next.equals("D")) {
//				if(cur <= conts.length()-1) cur += 1;
//			} else if(next.equals("B")) {
//				if(cur > 0) {
//					list.remove(cur-1);
//					cur -= 1;
//				}
//			}
//		}
//
//		for(char x: list) System.out.print(x);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 입력 문자열 
        String str = bf.readLine(); // 명령 행 개수 
        int n = Integer.parseInt(bf.readLine()); 
        List<Character> list = new LinkedList<>(); 
        for (int i = 0; i < str.length(); i++) { 
            list.add(str.charAt(i)); 
        } 
        int size = list.size(); 
        int index = list.size(); 
        while (n-- > 0) { 
            String[] line = bf.readLine().split(" "); // 커서 왼쪽 한칸 이동 
            if (line[0].equals("L")) { 
                if(index >= size){ index -= 1; 
                 }} // 커서 오른쪽 한칸 이동 
            else if (line[0].equals("D")) { 
                index += 1; } // 커서 왼쪽 문자 삭제 
            else if (line[0].equals("B")) { 
                list.remove(index); } // P 다음 문자 왼쪽 추가 
            else if (line[0].equals("P")) { 
                if(index >= size){ 
                    list.add(index, line[1].charAt(0)); 
                }else{ 
                    list.add(index+1, line[1].charAt(0)); 
                } } } 
        System.out.println(list.toString());
	}

}


