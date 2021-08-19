/*
// namepspace�� ��ø

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
		int n; // ������ �ڿ� �ֱ� ������ google::n�� ��ȭ�� ���� 0�� �ȴ�. ���� n�� ã�Եȴ�.
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

/* �̷����ϴ� �� ����� ����.
void lhj::set() {
	n = 20;
}

void lhj::google::set() {
	n = 30;
}
*/