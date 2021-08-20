/*

// 1. 매개변수의 상수화 ( 모든 함수 )
// 2. 메서드의 상수화 ( 멤버 메서드)

#include <iostream>

using namespace std;

class Account {
public:
	Account(): money(0) { }
	Account(int money): money(money){ }

	void Deposit(const int d) { // const를 통해서 매개변수를 상수화 시킨다.
		money += d;
		cout << d << "원을 예금했습니다." << endl;
	}

	void Draw(const int d) {
		if (money >= d) {
			money -= d;
			cout << d << "원을 인출했습니다." << endl;
		}
		else {
			cout << "잔액을 초과했습니다." << endl;
		}
		
	}

	int ViewMoney() const { // const로 멤버변수를 바꿀 수 없게 만든다.(메서드의 상수화)
		return money;
	}

private:
	int money;
};

int main() {

	Account lhj(100);

	lhj.Deposit(100);
	lhj.Draw(20);
	cout << lhj.ViewMoney() << "원이 남아있습니다." << endl;

}

*/