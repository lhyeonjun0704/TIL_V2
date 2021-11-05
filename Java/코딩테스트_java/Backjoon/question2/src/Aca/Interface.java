package Aca;

interface Restaurant{
	public void pojang(); // 선언o, 구현 x, child에서 반드시해줌
}

class Chef{
	public void yori() {
		System.out.println("요리");
	}
}

class server extends Chef implements Restaurant{

	@Override
	public void pojang() {
		// TODO Auto-generated method stub
		System.out.println("포장");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
