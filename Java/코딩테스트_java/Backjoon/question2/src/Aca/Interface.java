package Aca;

interface Restaurant{
	public void pojang(); // ����o, ���� x, child���� �ݵ������
}

class Chef{
	public void yori() {
		System.out.println("�丮");
	}
}

class server extends Chef implements Restaurant{

	@Override
	public void pojang() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
