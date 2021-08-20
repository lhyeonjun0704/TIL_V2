/*

// ��� �޼����� ����, ���� �и��ϱ�

#include <iostream>

using namespace std;

class Vector2 {
public:
	Vector2();
	Vector2(float x, float y);

	float GetX() const;
	float GetY() const;

	/*
	// ����
	static Vector2 operator*(const float a, const Vector2 b) {
		return Vector2(a * b.x, a * b.y);
	}
	*/
	
	/*
	// ����
	Vector2 Add(Vector2 rhs) {
		return Vector2(x + rhs.x, y + rhs.y);
	}*/

/*
	// ������ �����ε�
	Vector2 operator+(const Vector2 rhs) const;
	Vector2 operator-(const Vector2 rhs) const;
	Vector2 operator*(const float rhs) const;
	Vector2 operator/(const float rhs) const;
	float operator*(const Vector2 rhs) const;

private:
	float x;
	float y;
};

Vector2 operator*(const float a, const Vector2 b) {
	return Vector2(a * b.GetX(), a * b.GetY());
}


int main() {

	Vector2 a(2, 3);
	Vector2 b(-1, 4);
	//Vector2 c = a + b; <- �Ұ���
	Vector2 c1 = 1.6 * a;
	Vector2 c2 = a * 1.6; // 1.6 * a ���� �Ǽ� ���ϱ� ���ʹ� ������ ����. 1.6 ���� ���ڵ��� ��ü�� �ƴϴ�.
	Vector2 c3 = a / 2;
	float c4 = a * b;


	cout << a.GetX() << ", " << a.GetY() << endl;
	cout << b.GetX() << ", " << b.GetY() << endl;
	cout << c1.GetX() << ", " << c1.GetY() << endl;
	cout << c2.GetX() << ", " << c2.GetY() << endl;
	cout << c3.GetX() << ", " << c3.GetY() << endl;
	cout << c4 << endl;

}

Vector2::Vector2() : x(0), y(0){ }
Vector2::Vector2(float x, float y) : x(x), y(y){ }
float Vector2::GetX() const { return x; }
float Vector2::GetY() const { return y; }

Vector2 Vector2::operator+(const Vector2 rhs) const {
	return Vector2(x + rhs.x, y + rhs.y);
}

Vector2 Vector2::operator-(const Vector2 rhs) const {
	return Vector2(x - rhs.x, y - rhs.y);
}

float Vector2::operator*(const Vector2 rhs) const {
	return x * rhs.x + y * rhs.y; 
}

 Vector2 Vector2::operator*(const float rhs) const {
	return Vector2(x * rhs, y * rhs);
}

Vector2 Vector2::operator/(const float rhs) const {
	return Vector2(x / rhs, y / rhs);
}

*/