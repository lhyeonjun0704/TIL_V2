package Solved_1560_Bishop;

//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class Main {
//
////	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////		BigInteger n = new BigInteger("0");
////		n = sc.nextBigInteger();
////		long[] dp = new long[n+1];
////		dp[0] = dp[1] = 0;
////		dp[2] = 2;
////		for(int i = 3; i <= n; i++) {
////			dp[i] = dp[i-1] + 2;
////		}
////		System.out.println(dp[n]);
////	}
//	
//
//}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
                BigInteger c = new BigInteger("0");
         
                Scanner sc = new Scanner(System.in);
                
                c = sc.nextBigInteger();
                
                if(c.compareTo(BigInteger.ONE) == 0)
                    System.out.println(1);
                
                else if(c.compareTo(BigInteger.valueOf(2)) == 0)
                    System.out.println(2);
                
                else
                     System.out.println(c.add(c.subtract(BigInteger.valueOf(2))));
    }
    
}