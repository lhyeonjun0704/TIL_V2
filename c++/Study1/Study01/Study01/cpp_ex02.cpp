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

	cout << "이름을 입려해주세요 : ";
	cin >> name;

	string message = "안녕하세요, " + name + "님.";
	cout << message << endl;

	// 범위 기반 for 문

	int arr[10] = { 3, 1, 4, 1, 5, 9, 2, 6, 5,3 };

	for (int &n : arr) {
		int& n = arr[2];
		cout << n << endl;
		n++;
	}

}

*/