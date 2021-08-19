/*
// static : 정적(틀) <-> 동적(재료obj)

#include<iostream>

using namespace std;


// 0 ~ 1 float로 할 color save RGB
class Color {

public:
	Color(): r(0), g(0), b(0), id(idCounter++){	}
	Color(float r, float g, float b) : r(r), g(g), b(b), id(idCounter++) {}

	float GetR() { return r;}
	float GetG() { return g; }
	float GetB() { return b; }

	int GetId() { return id; }

	static Color MixColors(Color a, Color b) { // 정적인 메소드가 된다.
		return Color((a.r + b.r) / 2, (a.g + b.g) / 2, (a.b + b.b) / 2);
	}

	static int idCounter; // 정적으로 선언하는 경우에는 default값을 넣어줄 수 없다.

private:
	float r;
	float g;
	float b;

	int id;

};

int Color::idCounter = 1; // namespace의 선언 분리.

class Time {

public:
	Time(): h(0), m(0), s(0) {	}
	
	// 생성자 위임? - 자기 클래스 내에 다른 생성자를 호출을 할 수 있는 생성자

	Time(int s_) : Time() {
		s = s_;
	}

	Time(int m_, int s_) : Time(s_) {
		m = m_;
	}

	Time(int h_, int m_, int s_) : Time(m_, s_) { // 호출 순서가 :뒤의 Time()부터 실행이된다.
		h = h_;
	}

	int h;
	int m;
	int s;

private:
	
};

int main() {

	Color blue(0, 0, 1);
	Color red(1, 0, 0);

	Color purple = Color::MixColors(blue, red);

	cout << "r = " << purple.GetR() << ", g = " << purple.GetG() << ", b = " << purple.GetB() << endl;

	cout << "blue.GetId() = " << blue.GetId() << endl;
	cout << "red.GetId() = " << red.GetId() << endl;
	cout << "purple.GetId() = " << purple.GetId() << endl;

	Time t1;
	Time t2(5);
	Time t3(3, 16);
	Time t4(2, 42, 15);

	cout << "t1 : " << t1.h << ":" << t1.m << ":" << t1.s << endl;
	cout << "t2 : " << t2.h << ":" << t2.m << ":" << t2.s << endl;
	cout << "t3 : " << t3.h << ":" << t3.m << ":" << t3.s << endl;
	cout << "t4 : " << t4.h << ":" << t4.m << ":" << t4.s << endl;
}

*/