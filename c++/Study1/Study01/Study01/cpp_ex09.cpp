/*

// 1. �Ű������� ���ȭ ( ��� �Լ� )
// 2. �޼����� ���ȭ ( ��� �޼���)

#include <iostream>

using namespace std;

class Account {
public:
	Account(): money(0) { }
	Account(int money): money(money){ }

	void Deposit(const int d) { // const�� ���ؼ� �Ű������� ���ȭ ��Ų��.
		money += d;
		cout << d << "���� �����߽��ϴ�." << endl;
	}

	void Draw(const int d) {
		if (money >= d) {
			money -= d;
			cout << d << "���� �����߽��ϴ�." << endl;
		}
		else {
			cout << "�ܾ��� �ʰ��߽��ϴ�." << endl;
		}
		
	}

	int ViewMoney() const { // const�� ��������� �ٲ� �� ���� �����.(�޼����� ���ȭ)
		return money;
	}

private:
	int money;
};

int main() {

	Account lhj(100);

	lhj.Deposit(100);
	lhj.Draw(20);
	cout << lhj.ViewMoney() << "���� �����ֽ��ϴ�." << endl;

}

*/