package Solved_3216_Download;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			if(hm.get(D) == null || hm.get(D) > V) {
				hm.put(D, V);
			}
		}
		int answer = 0;
		for(int x : hm.values()) answer += x;
		System.out.println(answer);
	}

}
