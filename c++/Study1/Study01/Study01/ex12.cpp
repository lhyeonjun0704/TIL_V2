/*

// getchar / putchar
// gets / puts
// exit(0);

#include <stdio.h>

// ���� ����
#include <stdlib.h>

//�ð� 
#include <time.h>



int main() {
	
	// seed�� ���� ���� ���� �޶�����.
	srand(time(NULL));


	time(NULL); // 1970.01.01 00:00:00���κ��� ���� �ð��� �� ������ ��Ÿ�� ��.
	printf("%d \n", time(NULL));

	for (int i = 1; i <= 10; i++) {
		printf("%d\n", rand() % 10 + 1);
	}

	char str1[] = "450";
	int n;

	sscanf(str1, "%d", &n);
	printf("%d \n", n);

	int k = 450;
	char str2[100];

	sprintf(str2, "%d \n", k);
	printf("%s \n", k);

	// ����
	char str[100];

	gets_s(str);
	puts(str);

	// �ѱ���
	char ch;
	
	ch = getchar();
	putchar(ch);

}

*/