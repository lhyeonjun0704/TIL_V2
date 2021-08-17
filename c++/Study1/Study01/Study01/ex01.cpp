/*
#include <stdio.h>
#include <string.h>
#pragma warning(disable: 4996)

int main() { // main함수는 프로젝트 내에서 제일 먼저 실행되는 함수를 뜻한다.
	int a, b;

	scanf("%d %d", &a, &b);
	printf("합은 %d입니다. \n\n", a + b);


	int c = 20;
	int d = 40;
	int* ptr_c;
	ptr_c = &c;

	printf("c : %d \n", c);
	printf("c의 주소 : %d \n", &c);
	printf("ptr_c에 저장된 값 : %d \n", ptr_c);
	printf("ptr_c가 가리키는 변수의 값 : %d \n", *ptr_c);

	ptr_c = &a;
	printf("ptr_c가 가리키는 변수의 값 : %d \n\n", *ptr_c);

	// 포인터를 가르키는 포인터를 선언하는 방법

	int** ptr_c_ptr;
	ptr_c_ptr = &ptr_c;

	printf("c = %d \n", c);
	printf("&c = %d \n", &c);

	printf("ptr_c : %d \n", ptr_c);
	printf("&ptr_c : %d \n", &ptr_c);

	printf("**ptr_c_ptr : %d \n", **ptr_c_ptr);
	printf("ptr_c : %d \n", ptr_c_ptr);
	printf("&ptr_c_ptr: %d \n", &ptr_c_ptr);


	int e = 10;
	int* ptr_e = &e;

	printf("ptr_e : %d \n", ptr_e);
	printf("ptr_e + 1 : %d \n\n", ptr_e + 1);

	// 이렇게도 쓸 수 있지만 쓰지 말자(직관성 X)
	// arr[i] === *(arr + i) === *(ptr + i) === *(i + ptr) === i[ptr]
	//printf("%d \n", i[ptr]);

	// 배열의 포인터
	int arr[3] = { 1, 2, 3 };

	printf("arr = %d \n", arr);
	printf("arr + 1 = %d \n", arr + 1);
	
	printf("&arr = %d \n", &arr);
	printf("&arr + 1 = %d \n", &arr + 1);

	int(*ptr_arr)[3]; // 길이 3인 int형 배열을 가리키는 포인터 선언
	ptr_arr = &arr;

	for (int i = 0; i < 3; i++) {
		printf("%d \n", (*ptr_arr)[i]);
	}


	//int cmp = strcmp(str1, str2); // 첫번째 문자열이 두번째보다 앞쪽에 있으면	-1, 뒤쪽에 있으면 1을 반환, 같으면 0을 반환한다.)

	//printf("%d", strlen("a"));

	//printf("Hello, World! \n");

	//printf("%g\n", 3.141592);
	//printf("%.3g\n", 8723984712.12837468723);

	//printf("%s\n", "안녕"); 
} 

*/