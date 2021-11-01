package question5;

import java.util.Date;

public class Dateutil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
//		d5.setDate(d5.getDate()+99);
//		
//		System.out.println(d5);
//		System.out.println(d5.getDate());
		
		Date bir = new Date(1994-1900, 7 -1 , 4);
		
		long cha = today.getTime() - bir.getTime();
		
		System.out.println(cha / 1000 / 3600 / 24);
	}

}
