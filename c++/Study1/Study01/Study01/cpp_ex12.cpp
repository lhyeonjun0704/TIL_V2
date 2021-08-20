/*
#include <iostream>

using namespace std;

class String {
public:
	String() {
		cout << "String() ������ ȣ��" << endl;
		strData = NULL;
		len = 0;
	}

	String(const char* str) {
		cout << "String(const char*) ������ ȣ��" << endl;
		len = strlen(str);
		strData = new char[len + 1];
		cout << "strData �Ҵ� : " << (void*)strData << endl; // (void*)strData
		strcpy(strData, str); // ���� ����

	}

	String(String &rhs) {
		strData = new char[rhs.len + 1];
		strcpy(strData, rhs.strData);
		len = rhs.len; // ���� ����
	}

	~String() {
		cout << "~String() �Ҹ��� ȣ��" << endl;
		delete[] strData;
		cout << "strData  ������ : " << (void*)strData << endl;
		strData = NULL;
	}

	String &operator=(const String &rhs) {
		delete[] strData;
		strData = new char[rhs.len + 1];
		strcpy(strData, rhs.strData);
		len = rhs.len; // ���� ����

		return *this;
	}

	char* GetStrData() const { // ��ȯ������ char �����ͷ� �ȴٴ°Ŵ�.
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

	String s1("�ȳ�");
	String s2(s1);
	String s3;
	s3 = s1;

	int a = 5;
	int b;
	int c = b = a;

	cout << s1.GetStrData() << endl;



	int* a = new int(5);
	int* b = new int(3);

	a = b; //���� ����(������ ����)
	*a = *b;

	delete a;
	delete b;

	// char *str = "Hello";

}

*/