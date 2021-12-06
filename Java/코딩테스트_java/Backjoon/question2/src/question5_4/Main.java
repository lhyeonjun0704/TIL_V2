package question5_4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	public int []solution(int n, int m, int[]arr){
		int []answer = new int[n];
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i = 0; i < m; i++) {
			HM.put(arr[i], i);
		}
		
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(HM.entrySet());
		
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>(){
			
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
			
		});
		
//		for(Entry<Integer, Integer> entry : list_entries) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
		
		
//		List<Integer> valueList = new ArrayList<>(HM.values());
//		
//		Collections.sort(valueList, Collections.reverseOrder());
//		
//		for(int x : valueList) System.out.print(x + " ");
		
		int temp = 0;
		for(Entry<Integer, Integer> entry : list_entries) {
			System.out.print(entry.getKey() + " ");
			if(temp == n-1) break;
			temp++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []arr = new int[m];
		for(int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.solution(n, m, arr);
	}

}
