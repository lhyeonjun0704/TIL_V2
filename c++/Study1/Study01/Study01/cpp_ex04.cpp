/*
#include <iostream>

using namespace std;

int n;

void set();
//{

//	n = 10; // 명시적 전역변수 선언

//}

namespace lhj {
	int n;
	void set();
}

namespace google {
	int n;
	void set();
	
}

int main() {
	::set();
	lhj::set();
	google::set();

	cout << ::n << endl;
	cout << lhj::n << endl;
	cout << google::n << endl;
}

void set() {
	n = 10;
}

void lhj::set(){
		n = 20;
}

void google::set() {
	n = 30;
}

*/