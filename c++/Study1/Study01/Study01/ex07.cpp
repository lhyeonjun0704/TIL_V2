/*
// type define
// ���� ����

#include <stdio.h>

int main() {

	typedef int Int32; //�ڷ����Դϴ�.
	Int32 n = 20; 

	printf("%d \n", n);
	printf("%d \n", sizeof(Int32));

	
	typedef int Pair[2]; // 2¥���� �迭 ����
	Pair point = { 3, 4 }; // int point[2] = {3 , 4}; �̴�.


	typedef const char* String;
	String name = "LHJ";

	printf("%s \n", name);

}

*/