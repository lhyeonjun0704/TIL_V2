/*
// namepspace의 중첩

#include <iostream>

using namespace std;

int n;

void set() {
	n = 10;
}

namespace lhj {
	int n;
	void set() {
		n = 20;
	}

	namespace google {
		
		void set() {
			n = 30;
		}
		int n; // 선언이 뒤에 있기 때문에 google::n은 변화가 없이 0이 된다. 밖의 n을 찾게된다.
	}
	
}

int main() {
	::set();
	lhj::set();
	lhj::google::set();

	cout << ::n << endl; // 10
	cout << lhj::n << endl; // 20
	cout << lhj::google::n << endl; // 0

}
*/

/* 이렇게하는 건 상관이 없다.
void lhj::set() {
	n = 20;
}

void lhj::google::set() {
	n = 30;
}
*/