/*
// 시프트(shift) 연산

#include <stdio.h>

int main() {

	//char a = 22;

	//printf("%d \n", a << 1);
	//printf("%d \n", a << 3);
	//printf("%d \n", a << 6);


	//input과 output

	FILE* in, *out; //stream
	int n;

	in = fopen("input.txt", "r");
	out = fopen("output.txt", "a");

	// 이렇게 파일이 없을 때를 대비할 수 있다.
	if (in != nullptr) {
		

		fscanf(in, "%d", &n);
		fprintf(out, "%d \n", n);

		fclose(in);
		fclose(out);
	}
	

}

*/