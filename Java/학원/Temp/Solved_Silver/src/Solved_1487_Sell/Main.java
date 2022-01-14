package Solved_1487_Sell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Thing implements Comparable<Thing>{
	int cost, del;
	Thing(int cost, int del){
		this.cost = cost;
		this.del = del;
	}
	
	@Override
	public int compareTo(Thing o) {
		return o.cost - this.cost;
	}
	
}

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = 0, max = 0, answer = 0;
		ArrayList<Thing> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String []temp = br.readLine().split(" ");
			arr.add(new Thing(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
		}
		Collections.sort(arr);
//		for(Thing x: arr) {
//			System.out.println(x.cost + " " + x.del);
//		}
		for(int i = 0; i < arr.size(); i++) {
			sum = 0;
			for(int j = 0; j <= i; j++) {
				if(arr.get(i).cost < arr.get(j).del) continue;
				sum += arr.get(i).cost - arr.get(j).del;
			}
//			System.out.println(sum);
			if(sum == 0) answer = 0;
			else if(sum >= max) {
				max = sum;
				answer = arr.get(i).cost;
			}
		}
		System.out.println(answer);
	}

}
