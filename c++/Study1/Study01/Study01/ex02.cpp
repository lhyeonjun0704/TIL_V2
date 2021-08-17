/*
#include <stdio.h>

int main() {
	int arr[2][3] = { {1, 2, 3}, {4, 5, 6} };

	printf("%d\n", sizeof(arr)); // 24
	printf("%d \n", sizeof(arr[0])); // 12
	printf("%d \n", sizeof(arr[0][0])); // 4


	printf("%d\n", &arr); 
	printf("%d \n", &arr[0]); 
	printf("%d \n\n", &arr[0][0]);


	int(*ptr)[3] = arr;


	// 1. ptr[i] === arr[i]
	// 2 . ptr[i][j] === arr[i][j]
	// ptr === arr


	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {
			printf("%d", ptr[i][j]);
		}
		printf("\n");
	}

	
	for (int(*row)[3] = arr; row < arr + 2; row++) {
		for (int* col = *row; col < *row + 3; col++) {
			printf("%d", *col);
		}
		printf("\n");
	}

}

*/