/*
// cpp������ ��� ������ �ٸ� �� ���ϴ�.

#include <iostream>
using namespace std; // �̷��� �������ָ� std�� ���� �ʾƵ� �ȴ�.

namespace a
{
	int n;
}

namespace b
{
	int n;
}

int main() {

	// ������ n���� ���
	a::n = 10;
	b::n = 20;

	// std = namespace
	cout << "Hello, World!" << 10 << endl; //printf�� ����. endl == endline(�ٹٲ��̶� ����)

	int n, k;

	cin >> n >> k;
	cout << n << "+" << k << "=" << n + k << endl;

}


*/