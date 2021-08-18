/*

// getchar / putchar
// gets / puts
// exit(0);

#include <stdio.h>

// 난수 생성
#include <stdlib.h>

//시간 
#include <time.h>



int main() {
	
	// seed에 따라서 난수 값이 달라진다.
	srand(time(NULL));


	time(NULL); // 1970.01.01 00:00:00으로부터 지난 시간을 초 단위로 나타낸 것.
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

	// 한줄
	char str[100];

	gets_s(str);
	puts(str);

	// 한글자
	char ch;
	
	ch = getchar();
	putchar(ch);

}

*/