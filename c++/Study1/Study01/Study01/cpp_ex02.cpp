/*

#include<iostream>
#include<string>

using namespace std;

int main() {

	string str;
	string name;

	int a(10); //int a = 10;
	int b(a);

	cout << "a = " << a << endl;
	cout << "b = " << b << endl;

	str = "Hello";
	cout << str << endl;

	cout << "�̸��� �Է����ּ��� : ";
	cin >> name;

	string message = "�ȳ��ϼ���, " + name + "��.";
	cout << message << endl;

	// ���� ��� for ��

	int arr[10] = { 3, 1, 4, 1, 5, 9, 2, 6, 5,3 };

	for (int &n : arr) {
		int& n = arr[2];
		cout << n << endl;
		n++;
	}

}

*/