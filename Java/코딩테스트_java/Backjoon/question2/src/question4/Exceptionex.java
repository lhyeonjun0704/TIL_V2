package question4;

import java.util.Scanner;

public class Exceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner  sc1=new Scanner(System.in);

        System.out.print("ù��°���� : ");
        String one1=sc1.nextLine();//���ڿ��� �޴� �� 
        //��ĭ���� ���� �� �Է�   //i love you ���� �� ���� 
        // ����(But)  next()�� i�� �Է�~~~ 
        
        int soo1=Integer.parseInt(one1);
     
        System.out.print("�ι�°���� : ");
        String two1=sc1.nextLine();
        int soo2=Integer.parseInt(two1);
		 
        System.out.println(soo1/soo2);
		}catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("�Է� ����");
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}finally {
        System.out.println("gooooooooooooood");
		}
		
		try {
		 Scanner  sc1=new Scanner(System.in);
		 System.out.print("ù��°���� : ");
		 String one1=sc1.nextLine();
		 int soo1=Integer.parseInt(one1);
		                      
		 System.out.print("�ι�°���� : ");
		 String two1=sc1.nextLine();
		 int soo2=Integer.parseInt(two1);
		 
		 //------------------------------
		 int bada = kaja(soo1, soo2); // �޼ҵ�  2,3����
		 System.out.println(bada);
		 //------------------------------
		}catch(Exception e) {
			System.out.println("���⼭ ���� ó��");
		}
	}

	private static int kaja(int soo1, int soo2) {
		// TODO Auto-generated method stub
		throws ArithmeticException{
			
		}
//		if(soo2 == 0) {
//			System.out.println("0���� ���� �� ����");
//			throw new ArithmeticException();
//		}
//		else
		return soo1/soo2;
	}

}

// Exception(���� / ����)
// �ܼ� ȭ�鿡�� �� ó�� �� ����, �ڼ��� ����.

// ���� : exception(����Ŭ����, ����Ŭ����)
// try {}
// catch{} : ���ܽ� ó��
// finally {} : ������ ó��
// ���ܹ߻� �� JVM���� ����.
// ex) java -- JVM