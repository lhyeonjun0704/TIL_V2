package question4;

import java.util.Scanner;

public class Exceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner  sc1=new Scanner(System.in);

        System.out.print("첫번째수는 : ");
        String one1=sc1.nextLine();//문자열을 받는 것 
        //빈칸포함 한줄 다 입력   //i love you 한줄 다 읽음 
        // 벗뜨(But)  next()는 i만 입력~~~ 
        
        int soo1=Integer.parseInt(one1);
     
        System.out.print("두번째수는 : ");
        String two1=sc1.nextLine();
        int soo2=Integer.parseInt(two1);
		 
        System.out.println(soo1/soo2);
		}catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("입력 오류");
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}finally {
        System.out.println("gooooooooooooood");
		}
		
		try {
		 Scanner  sc1=new Scanner(System.in);
		 System.out.print("첫번째수는 : ");
		 String one1=sc1.nextLine();
		 int soo1=Integer.parseInt(one1);
		                      
		 System.out.print("두번째수는 : ");
		 String two1=sc1.nextLine();
		 int soo2=Integer.parseInt(two1);
		 
		 //------------------------------
		 int bada = kaja(soo1, soo2); // 메소드  2,3형식
		 System.out.println(bada);
		 //------------------------------
		}catch(Exception e) {
			System.out.println("여기서 에러 처리");
		}
	}

	private static int kaja(int soo1, int soo2) {
		// TODO Auto-generated method stub
		throws ArithmeticException{
			
		}
//		if(soo2 == 0) {
//			System.out.println("0으로 나눌 수 없다");
//			throw new ArithmeticException();
//		}
//		else
		return soo1/soo2;
	}

}

// Exception(예외 / 에러)
// 콘솔 화면에서 맨 처음 난 에러, 자셍히 본다.

// 예외 : exception(내장클래스, 예외클래스)
// try {}
// catch{} : 예외시 처리
// finally {} : 무조건 처리
// 예외발생 시 JVM에게 전달.
// ex) java -- JVM