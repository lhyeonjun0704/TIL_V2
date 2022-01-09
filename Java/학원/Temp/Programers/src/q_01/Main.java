package q_01;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int p_s1 = 0, p_s2 = 0,  p_s3 = 0;
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0; i < answers.length; i++){
            if(answer[i] == p1[i % 5]) p_s1++;
            if(answer[i] == p2[i % 8]) p_s2++;
            if(answer[i] == p3[i % 10]) p_s3++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(p_s1);
        list.add(p_s2);
        list.add(p_s3);
        // for(int x: list) System.out.println(x); 
        return answer;
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] arr = {1, 2, 3, 4, 5};
		s.solution(arr);
	}

}
