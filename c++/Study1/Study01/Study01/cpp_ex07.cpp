/*

// 생성자 : 객체가 생성될 때 자동으로 호출되는 함수
// 소멸자 : 객체가 소멸될 때 자동으로 호출되는 함수

#include <iostream>

using namespace std;

class MyClass {
public:
	MyClass() { // 생성자
		cout << "생성자가 호출되었습니다." << endl;
	}

	~MyClass() // 소멸자
	{
		cout << "소멸자가 호출되었습니다." << endl;
	}
};

class Complex {
public:
	/* default값을 줌으로써 생략이 가능해진다. 
	Complex() : real(0), imag(0) {	}
	*/

	// 초기화 목록

/*
	Complex(double real_ = 0, double imag_ = 0) : real(real_), imag(imag_) { } // 이런식으로 더 짧게 쓸 수 도 있다. (초기화 목록)

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
	cout << "test Local Obj 함수 시작" << endl;
	MyClass localObj;
	cout << "test Local Obj 함수 시작" << endl;
}

int main() {

	int a(5);

	Complex c1;
	Complex c2 = Complex(2, 3); // Complex c3(2, 3); 같은 표현
	Complex c4 = { 2, 3 };
	Complex c5 = Complex{ 2, 3 };
	Complex c6{ 2, 3 };


	cout << "c1 = " << c1.GetReal() << ", " << c1.GetImag() << endl;
	cout << "c2 = " << c2.GetReal() << ", " << c2.GetImag() << endl;
	cout << "c4 = " << c4.GetReal() << ", " << c4.GetImag() << endl;
	cout << "c1 = " << c5.GetReal() << ", " << c5.GetImag() << endl;

	cout << "main 함수 시작" << endl;
	testLocalObj();
	cout << "main 함수 종료" << endl;

}

*/