package Solved_2003_SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [] list = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		int answer = 0;
		for(int i = 0; i < list.length; i++) {
			int sum = list[i];
			if(sum == m) answer++;
			else if(sum > m) continue;
			else {
				for(int j = i+1; j < list.length; j++) {
					sum += list[j];
					if(sum == m) {
						answer++;
						break;
					} else if(sum > m) break;
				}
			}
			
		}
		System.out.println(answer);
	}

}
