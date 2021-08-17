// 배열 포인터 : 배열을 가리키는 포인터
// 포인터 배열 : 포인터들이 배열

/*
#include <stdio.h>

int main() {
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;

	int* ptr[4]; // 4개짜리 배열이 생기고 그 원소로는 포인터가 들어간다.

	ptr[0] = &a;
	ptr[1] = &c;
	ptr[2] = &d;
	ptr[3] = &b;

	printf("%d %d %d %d \n", *ptr[0], *ptr[1], *ptr[2], * ptr[3]);
	

	char strings[3][10] = { "Hello", "World", "Doodle" };
	char* p_str[3];

	for (int i = 0; i < 3; i++) {
		p_str[i] = &strings[i][0];
	}

	for (int i = 0; i < 3; i++) {
		printf("%s \n", p_str[i]);
	}


	for (int i = 0; i < 3; i++) {
		printf("%s \n", &strings[i]);
	}
	
	int arr[3][3] = { 1, {0}, {0} };

	printf("%d \n", &arr[0][0]);

	printf("%d\n", arr[0]);
	printf("%d \n", &arr[0] + 1);
	printf("%d \n", arr + 1);
	printf("%d \n", &arr + 1);

}

*/
