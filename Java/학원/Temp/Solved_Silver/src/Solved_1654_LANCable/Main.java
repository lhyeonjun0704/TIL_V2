package Solved_1654_LANCable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int sum = 0;
		for(int i = 0; i < k; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println((sum / n / 100) *100);
	}

}
