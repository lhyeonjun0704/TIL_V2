import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char [] q = {'a', 'p', 'p', 'l', 'e'};
		char [] ui = {'_', '_', '_', '_', '_'};
		
		for(int i = 1; i <= 13; i++) {
			
			answer(ui);
			
			
			System.out.println("글자 입력 : ");
			char temp = sc.next().charAt(0);
			for(int j = 0; j < q.length; j++) {
				if(temp == q[j]) {
					ui[j] = temp;
				
				}
			}
			
		
			if(Arrays.equals(q, ui)) {
				answer(ui);
				System.out.print("\n");
				System.out.println("참 잘했어요");
				break;
			}
			else if(i == 13) {
				System.out.println("다음 기회에");
			}
	}
}

	private static void answer(char [] ans) {
		// TODO Auto-generated method stub
		for(int k = 0; k < ans.length; k++) {
			System.out.print(ans[k]);
		}
	}
}