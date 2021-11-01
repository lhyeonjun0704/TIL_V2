package question4;

abstract class Fruit{
	public void good() {
		System.out.println("과일");
	}
	
	public abstract void eat();
}

public class Abstract extends Fruit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat Apple");
	}

}

// abstract
// 추상 클래스 : 가독성, 다형성(polymorphism)
// 구현 x, 선언 o 구현은 자녀쪽에서 한다.
// interface와 asbtract는 비슷함