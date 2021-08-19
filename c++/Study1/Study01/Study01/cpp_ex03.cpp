/*
#include <iostream>

using namespace std;



void swap(int& a, int& b) {

	int tmp = a;
	a = b;
	b = tmp;

}

void swap(double& a, double& b) {
	double tmp = a;
	a = b;
	b = tmp;
}

void swap(int* (&a), int* (&b)) {
	int* tmp = a;
	a = b;
	b = tmp;
}

int inventory[64] = { 0 };
int score = 0;

/*
void getItem(int itemID) {
	inventory[itemID]++;
}

void getItem(int itemID, int cnt) {
	inventory[itemID] += cnt;
}
*/

/*

void getItem(int itemID, int cnt = 1, int sc = 0) { // default 값을 정해줌으로써 함수를 여러개 만들 필요가 없다. default값은 오른쪽부터 값을 주는걸로 약속이 되어있다.
	inventory[itemID] += cnt;
	score += sc;
}

int main() {

	getItem(6, 5);
	getItem(3, 2);
	getItem(3);
	getItem(11, 34, 7000);

	cout << score << endl;
	for (int i = 0; i < 16; i++) {
		cout << inventory[i] << ' ';
	}
	cout << endl;


	int a = 20, b = 30;
	double da = 2.222, db = 3.333;

	int* pa = &a, * pb = &b;

	swap(a, b);
	swap(da, db);
	swap(pa, pb);

	cout << "a: " << a << endl;
	cout << "b: " << b << endl;

	cout << "da: " << da << endl;
	cout << "db: " << db << endl;

	cout << "*pa: " << *pa << endl;
	cout << "*pb: " << *pb << endl;

	int arr[2][3] = { {1, 2, 3 }, {4, 5, 6} };

	for (int(&ln)[3] : arr) {
		for (int& col : ln) {
			cout << col << ' ';
		}
		cout << endl;
	}

}

*/