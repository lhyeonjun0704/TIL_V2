/*

// ������ : ��ü�� ������ �� �ڵ����� ȣ��Ǵ� �Լ�
// �Ҹ��� : ��ü�� �Ҹ�� �� �ڵ����� ȣ��Ǵ� �Լ�

#include <iostream>

using namespace std;

class MyClass {
public:
	MyClass() { // ������
		cout << "�����ڰ� ȣ��Ǿ����ϴ�." << endl;
	}

	~MyClass() // �Ҹ���
	{
		cout << "�Ҹ��ڰ� ȣ��Ǿ����ϴ�." << endl;
	}
};

class Complex {
public:
	/* default���� �����ν� ������ ����������. 
	Complex() : real(0), imag(0) {	}
	*/

	// �ʱ�ȭ ���

/*
	Complex(double real_ = 0, double imag_ = 0) : real(real_), imag(imag_) { } // �̷������� �� ª�� �� �� �� �ִ�. (�ʱ�ȭ ���)

	double GetReal() {
		return real;
	}

	void SetReal(double real_) {
		real = real_;
	}

	double GetImag() {
		return imag;
	}

	void SetImag(double imag_) {
		imag = imag_;
	}

private:
	double real;
	double imag;
};


//MyClass globalObj;

void testLocalObj() {
	cout << "test Local Obj �Լ� ����" << endl;
	MyClass localObj;
	cout << "test Local Obj �Լ� ����" << endl;
}

int main() {

	int a(5);

	Complex c1;
	Complex c2 = Complex(2, 3); // Complex c3(2, 3); ���� ǥ��
	Complex c4 = { 2, 3 };
	Complex c5 = Complex{ 2, 3 };
	Complex c6{ 2, 3 };


	cout << "c1 = " << c1.GetReal() << ", " << c1.GetImag() << endl;
	cout << "c2 = " << c2.GetReal() << ", " << c2.GetImag() << endl;
	cout << "c4 = " << c4.GetReal() << ", " << c4.GetImag() << endl;
	cout << "c1 = " << c5.GetReal() << ", " << c5.GetImag() << endl;

	cout << "main �Լ� ����" << endl;
	testLocalObj();
	cout << "main �Լ� ����" << endl;

}

*/