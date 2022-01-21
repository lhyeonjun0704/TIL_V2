package Solved_23814_frieddumpling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger D = new BigInteger(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger(st.nextToken());
		BigInteger K = new BigInteger(st.nextToken());
		if(K.remainder(D) == new BigInteger("0")) {
			System.out.println(D);
		} else {
			if(K.remainder(D).compareTo(D.subtract(M.remainder(D)).add(D.subtract(N.remainder(D)))) == 1
					|| K.remainder(D).compareTo(D.subtract(M.remainder(D)).add(D.subtract(N.remainder(D)))) == 0) {
				System.out.println(D.subtract(N.remainder(D).add(M.remainder(D))));
			} else {
				if(D.subtract(N.remainder(D)).compareTo(D.subtract(K.remainder(D))) == -1 && 
						D.subtract(N.remainder(D)).compareTo(D.subtract(M.remainder(D))) == -1) {
					System.out.println(K.subtract(D.subtract(N.remainder(D))));
				}
				else if(D.subtract(N.remainder(D)).compareTo(D.subtract(K.remainder(D))) == -1 && 
						D.subtract(N.remainder(D)).compareTo(D.subtract(M.remainder(D))) == 1) {
					System.out.println(K.subtract(D.subtract(M.remainder(D))));
				}
				else if(D.subtract(M.remainder(D)).compareTo(D.subtract(K.remainder(D))) == -1 &&
						D.subtract(N.remainder(D)).compareTo(D.subtract(M.remainder(D))) == 1) {
					System.out.println(K.subtract(D.subtract(M.remainder(D))));
				} 
				else if(D.subtract(M.remainder(D)).compareTo(D.subtract(K.remainder(D))) == -1 &&
						D.subtract(N.remainder(D)).compareTo(D.subtract(M.remainder(D))) == -1) {
					System.out.println(K.subtract(D.subtract(N.remainder(D))));
				} else System.out.println(K);0
						
			}
		}
	}

}
