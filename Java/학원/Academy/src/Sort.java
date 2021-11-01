import java.util.Arrays;
import java.util.Scanner;

public class Sort{
	public static void main(String[] args) {
		int [] array = {60, 90, 100, 80, 70};
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 이진검색
		int [] arr = {11, 84, 45, 78, 34, 9, 2};
		
		Arrays.sort(arr);
		
		System.out.println("78은" + Arrays.binarySearch(arr, 78) + "번째에 있다");
		
		String s1 = "LOVE";
		System.out.println(s1.substring(1, 2));
	}
}