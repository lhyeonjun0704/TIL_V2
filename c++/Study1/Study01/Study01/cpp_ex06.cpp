/*

// struct
// class = 자료저장 + 자료처리 = 변수 + 함수 / 특정한 용도를 수행하기 위한 변수와 함수를 모아 둔 틀(자료형) / 객체(오브젝트)<변수, 메모리 상의 공간>
// this = 객체 자신을 가르키는 포인터이다.

#include <iostream>

using namespace std;

// private, protected, public

struct TV {
	
private:
	bool powerOn;
	int channel;
	int volume;

public:
	void on() {
		powerOn = true;
		cout << "TV를 켰습니다." << endl;
	}

	void off() {
		powerOn = false;
		cout << "TV를 껐습니다." << endl;
	}

	void setChannel(int chn) {
		if (chn >= 0 && chn <= 999) {
			channel = chn;
		}
	}

	void setVolume(int vol) {
		if (vol >= 0 && vol <= 100) {
			volume = vol;
		}
	}
};

class Myclass {
public:
	void PrintThis() {
		cout << "나의 주소는 : " << this << endl;
	}
};

int main() {

	Myclass a, b;
	cout << "a의 주소는 : " << &a << endl;
	cout << "b의 주소는 : " << &b << endl;

	a.PrintThis();
	b.PrintThis();

	TV lg;
	lg.setChannel(5);
	lg.on();
	lg.off();
	lg.setVolume(10);


}

*/