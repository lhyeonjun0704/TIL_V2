package question4;

abstract class Fruit{
	public void good() {
		System.out.println("����");
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
// �߻� Ŭ���� : ������, ������(polymorphism)
// ���� x, ���� o ������ �ڳ��ʿ��� �Ѵ�.
// interface�� asbtract�� �����