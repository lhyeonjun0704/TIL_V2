/*
// cpp에서는 헤더 파일을 다른 걸 씁니다.

#include <iostream>
using namespace std; // 이렇게 선언해주면 std를 쓰지 않아도 된다.

namespace a
{
	int n;
}

namespace b
{
	int n;
}

int main() {

	// 별개의 n으로 취급
	a::n = 10;
	b::n = 20;

	// std = namespace
	cout << "Hello, World!" << 10 << endl; //printf랑 같다. endl == endline(줄바꿈이랑 같다)

	int n, k;

	cin >> n >> k;
	cout << n << "+" << k << "=" << n + k << endl;

}


*/