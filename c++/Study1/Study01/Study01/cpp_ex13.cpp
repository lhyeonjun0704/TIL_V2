// 임시 객체는 r-value다!

#include <iostream>
#include <string>

using namespace std;

class Item {
public:
	Item(int num) :num(num) { // 변환 생성자
		cout << "Item(int)" << endl;
	}

	Item(string name) : name(name) {
		cout << "Item(string)" << endl;
	}

	Item(int num, string name) : num(num), name(name) {
		cout << "Item(int, string)" << endl;
	}

private:
	int num;
	string name;
};

int main() {

	Item i1 = Item(1);
	Item i2(2);
	Item i3 = 3;
	i3 = 3; // 묵시적 형변환
	Item i4 = (Item)4; // 명시적 형변환

}