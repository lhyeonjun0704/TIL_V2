/*
#include <iostream>

using namespace std;

class String {
public:
	String() {
		cout << "String() 생성자 호출" << endl;
		strData = NULL;
		len = 0;
	}

	String(const char* str) {
		cout << "String(const char*) 생성자 호출" << endl;
		len = strlen(str);
		strData = new char[len + 1];
		cout << "strData 할당 : " << (void*)strData << endl; // (void*)strData
		strcpy(strData, str); // 깊은 복사

	}

	String(String &rhs) {
		strData = new char[rhs.len + 1];
		strcpy(strData, rhs.strData);
		len = rhs.len; // 깊은 복사
	}

	~String() {
		cout << "~String() 소멸자 호출" << endl;
		delete[] strData;
		cout << "strData  해제됨 : " << (void*)strData << endl;
		strData = NULL;
	}

	String &operator=(const String &rhs) {
		delete[] strData;
		strData = new char[rhs.len + 1];
		strcpy(strData, rhs.strData);
		len = rhs.len; // 깊은 복사

		return *this;
	}

	char* GetStrData() const { // 반환형식이 char 포인터로 된다는거다.
		return strData;
	}

	int GetLen() const {
		return len;
	}

private:
	char* strData;
	int len;
};

int main() {

	String s1("안녕");
	String s2(s1);
	String s3;
	s3 = s1;

	int a = 5;
	int b;
	int c = b = a;

	cout << s1.GetStrData() << endl;



	int* a = new int(5);
	int* b = new int(3);

	a = b; //얕은 복사(참조만 복사)
	*a = *b;

	delete a;
	delete b;

	// char *str = "Hello";

}

*/