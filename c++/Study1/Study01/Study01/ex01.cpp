/*
#include <stdio.h>
#include <string.h>
#pragma warning(disable: 4996)

int main() { // main�Լ��� ������Ʈ ������ ���� ���� ����Ǵ� �Լ��� ���Ѵ�.
	int a, b;

	scanf("%d %d", &a, &b);
	printf("���� %d�Դϴ�. \n\n", a + b);


	int c = 20;
	int d = 40;
	int* ptr_c;
	ptr_c = &c;

	printf("c : %d \n", c);
	printf("c�� �ּ� : %d \n", &c);
	printf("ptr_c�� ����� �� : %d \n", ptr_c);
	printf("ptr_c�� ����Ű�� ������ �� : %d \n", *ptr_c);

	ptr_c = &a;
	printf("ptr_c�� ����Ű�� ������ �� : %d \n\n", *ptr_c);

	// �����͸� ����Ű�� �����͸� �����ϴ� ���

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

	// �̷��Ե� �� �� ������ ���� ����(������ X)
	// arr[i] === *(arr + i) === *(ptr + i) === *(i + ptr) === i[ptr]
	//printf("%d \n", i[ptr]);

	// �迭�� ������
	int arr[3] = { 1, 2, 3 };

	printf("arr = %d \n", arr);
	printf("arr + 1 = %d \n", arr + 1);
	
	printf("&arr = %d \n", &arr);
	printf("&arr + 1 = %d \n", &arr + 1);

	int(*ptr_arr)[3]; // ���� 3�� int�� �迭�� ����Ű�� ������ ����
	ptr_arr = &arr;

	for (int i = 0; i < 3; i++) {
		printf("%d \n", (*ptr_arr)[i]);
	}


	//int cmp = strcmp(str1, str2); // ù��° ���ڿ��� �ι�°���� ���ʿ� ������	-1, ���ʿ� ������ 1�� ��ȯ, ������ 0�� ��ȯ�Ѵ�.)

	//printf("%d", strlen("a"));

	//printf("Hello, World! \n");

	//printf("%g\n", 3.141592);
	//printf("%.3g\n", 8723984712.12837468723);

	//printf("%s\n", "�ȳ�"); 
} 

*/