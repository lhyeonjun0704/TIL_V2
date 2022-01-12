package Solved_1124_UnderPrime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		int [] arr = new int[100001];
		int [] ch = new int [100001];
		ch[0] = -1;
		ch[1] = -1;
		for(int i = 2; i <= b; i++) {
			if(ch[i] == 0) {
				for(int j = i*2; j <= b; j+= i) {
					ch[j] = -1;
					int curNum = j;
					while(curNum % i == 0) {
						curNum /= i;
						arr[j]++;
					}
				}
			}
		}
		for(int i = a; i <= b; i++) {
			if(ch[arr[i]] != -1) answer++;
		}
		
				
		System.out.println(answer);
	}

}
