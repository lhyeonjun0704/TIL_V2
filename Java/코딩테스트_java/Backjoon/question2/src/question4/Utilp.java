package question4;

import java.util.Date;

public class Utilp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println(d1);
		
		System.out.println(d1.toString());
		System.out.println(d1.toLocaleString()); //deprecated 사용하는 것을 권장하지 않는다.
		System.out.println(d1.getYear());
		System.out.println(d1.getDate());
		System.out.println(d1.getDay());
		System.out.println(d1.toGMTString());
	}

}

// 클래스
// 1) 사용자정의 클래스(user defined class)
// 설계(정의) - 제작(new, 생성) - 사용의 3단계

// 2) 내장클래스
// scanner, system date 

// util