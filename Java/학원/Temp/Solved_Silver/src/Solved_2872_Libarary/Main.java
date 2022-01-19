package Solved_2872_Libarary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int result = 0;
		Collections.reverse(list);

		int target = n;

		for(int i=0; i<n; i++){
			if(list.get(i) == target)
				target--;
			else
				result++;
		}

		System.out.println(result);
		
	}

}
