package IPMainClass;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPMainClass {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		//InetAddress Ŭ������ �ڹ�Ŭ������ IP�ּ�ǥ�� ���� ���
//		InetAddress inet1 = InetAddress.getLocalHost();
//		
//		//ip �ּ�
//		System.out.println(inet1.getHostAddress());
//		
//		System.out.println(inet1.getHostName()); // String��ȯ. ȣ��Ʈ �̸� ���ڿ���. ex)DESKTOP-?????
//		
//		InetAddress inet2 = InetAddress.getByName("www.naver.com");
//		InetAddress [] inet3 = InetAddress.getAllByName("www.naver.com");
//		
//		System.out.println(inet2);
//
//		for(Object x: inet3) System.out.println(x);
//		
//		byte [] byte4 = inet1.getAddress();
//		
//		for(int i = 0; i < byte4.length; i++) {
//			System.out.print((int)byte4[i] + "\t");
//		}
//		System.out.println();
//		
//		System.out.println("���� �ּ� �ذ�");
//		String change1 = "";
//		for(int i = 0; i < byte4.length; i++) {
//			if(byte4[i] < 0) change1 = change1+("" + (byte4[i] + 256));
//			else change1 = change1 + ("" + byte4[i]);
//			if(i != 3) // 
//				change1 = change1 + ".";
//		}
//		System.out.println(change1);
		
		String irum = "�´�";
		
		byte[] byteBae = new byte[1024];
		byteBae = irum.getBytes(); // string -> ����Ʈ �迭
		
		String irum2 = new String(byteBae);
		
		System.out.println(irum2);
		
	}

}
