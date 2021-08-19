/*

// struct
// class = �ڷ����� + �ڷ�ó�� = ���� + �Լ� / Ư���� �뵵�� �����ϱ� ���� ������ �Լ��� ��� �� Ʋ(�ڷ���) / ��ü(������Ʈ)<����, �޸� ���� ����>
// this = ��ü �ڽ��� ����Ű�� �������̴�.

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
		cout << "TV�� �׽��ϴ�." << endl;
	}

	void off() {
		powerOn = false;
		cout << "TV�� �����ϴ�." << endl;
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
		cout << "���� �ּҴ� : " << this << endl;
	}
};

int main() {

	Myclass a, b;
	cout << "a�� �ּҴ� : " << &a << endl;
	cout << "b�� �ּҴ� : " << &b << endl;

	a.PrintThis();
	b.PrintThis();

	TV lg;
	lg.setChannel(5);
	lg.on();
	lg.off();
	lg.setVolume(10);


}

*/