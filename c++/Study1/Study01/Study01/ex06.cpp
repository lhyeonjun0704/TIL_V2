/*
// 재귀함수(recursion)

#include <stdio.h>


int factorial(int n) {
	if (n == 1) return 1;
 	return n * factorial(n - 1);
}

// call-by-reference :참조가 된다.
void printArr(int* arr) {
	for (int i = 0; i < 4; i++) {
		arr[i] *= 2;
	}
}

void print_noSpace(char str[]) {
	for (int i = 0; str[i] != '\0'; i++) {
		printf("%c", str[i]);
	}

}


int main() {

	int arr[4] = { 1, 2, 3, 4 };

	printArr(arr);

	for (int i = 0; i < 4; i++) {
		printf("%d \n", arr[i]);
	}

	printf("%d \n", factorial(5));

	print_noSpace("Hello, World!\n");
	print_noSpace("My name is HJ\n");

}

*/