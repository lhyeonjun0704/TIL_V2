package question4;

class Janyu extends Example{
	public void car() {
		dia = 3;
		System.out.println("3, success");
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p77 = null;
		switch(sel) {
		case 1:
			p77 = new Parent();
			p77.car();
			break;
		case 2:
			p77 = new Child();
			p77.car();
			break;
		default:
			System.out.println();
			break;
		}
	}

}

// short s1 = 100;
// int aa = s1; // ������,  �Ͻ��� ����ȯ

// short s2 = (short)bb; // ����� ����ȯ
// (short) : ����ȯ ������

// ��ü�� ����ȯ

// Parent p2 = c1; ����
// Parent p2 = new Child(); ����

// Child c2 = p1; �Ұ���
// Child c2 = new Parent(); �Ұ���

// Child c3 = (Child)p2; //����
// Child c3 = new(Child()); //����

// Child c5 = (Child)p1; �Ұ���
// Child c5 = new Parent(); // �Ұ���

// interface? �� �ذ�

// class AAA{} ==> interface AAA {} ���� ���� ���
// ==> �߰��� �Լ��� ����, ����, (�޼ҵ�� ����, ��α���)