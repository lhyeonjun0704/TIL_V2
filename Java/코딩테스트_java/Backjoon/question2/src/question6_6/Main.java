package question6_6;

public class Main {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L == n+1) {
			
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}

}
