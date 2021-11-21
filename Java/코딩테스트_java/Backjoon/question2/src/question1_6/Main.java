package question1_6;

//import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public boolean isPrime(int num) {
		if( num == 1 ) return false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public String solution(int n, String str) {
		String answer = "";
		
		String [] temp = str.split(" ");
		for(int i = 0; i < temp.length; i++) {
			temp[i] = new StringBuilder(temp[i]).reverse().toString();
		}
		
		for(String x: temp) {
			if(isPrime(Integer.parseInt(x))) answer += String.valueOf(Integer.parseInt(x)) + " ";
		}
		
		
		return answer;
	}
	
	
//	public ArrayList<Integer> solution(int n, int[] arr){
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		
//		
////		for(int i = 0; i < n; i++) {
////			int tmp = arr[i];
////			int res= 0;
////			while(tmp > 0) {
////				int t = tmp % 10;
////				res = res * 10 + t;
////				tmp = tmp/ 10;
////			}
////			if(isPrime(res)) answer.add(res);
////		}
//		
//		
//		return answer;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
//		int [] arr = new int[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		System.out.println(T.solution(n, str));
		
//		for(int x: T.solution(n, arr)) {
//			System.out.print(x + " ");
//		}
		
	}

}
