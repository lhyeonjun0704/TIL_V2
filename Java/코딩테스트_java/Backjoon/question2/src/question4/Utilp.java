package question4;

import java.util.Date;

public class Utilp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println(d1);
		
		System.out.println(d1.toString());
		System.out.println(d1.toLocaleString()); //deprecated ����ϴ� ���� �������� �ʴ´�.
		System.out.println(d1.getYear());
		System.out.println(d1.getDate());
		System.out.println(d1.getDay());
		System.out.println(d1.toGMTString());
	}

}

// Ŭ����
// 1) ��������� Ŭ����(user defined class)
// ����(����) - ����(new, ����) - ����� 3�ܰ�

// 2) ����Ŭ����
// scanner, system date 

// util