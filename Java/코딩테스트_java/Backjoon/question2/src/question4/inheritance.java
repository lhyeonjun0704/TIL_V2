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
// int aa = s1; // 묵시적,  암시적 형변환

// short s2 = (short)bb; // 명시적 형변환
// (short) : 형변환 연산자

// 객체의 형변환

// Parent p2 = c1; 가능
// Parent p2 = new Child(); 가능

// Child c2 = p1; 불가능
// Child c2 = new Parent(); 불가능

// Child c3 = (Child)p2; //가능
// Child c3 = new(Child()); //가능

// Child c5 = (Child)p1; 불가능
// Child c5 = new Parent(); // 불가능

// interface? 로 해결

// class AAA{} ==> interface AAA {} 가장 위에 사용
// ==> 추가로 함수의 원형, 협업, (메소드는 선언만, 상부구조)