/*
// type define
// 형을 정의

#include <stdio.h>

int main() {

	typedef int Int32; //자료형입니다.
	Int32 n = 20; 

	printf("%d \n", n);
	printf("%d \n", sizeof(Int32));

	
	typedef int Pair[2]; // 2짜리의 배열 선언
	Pair point = { 3, 4 }; // int point[2] = {3 , 4}; 이다.


	typedef const char* String;
	String name = "LHJ";

	printf("%s \n", name);

}

*/