/*
// ����Ʈ(shift) ����

#include <stdio.h>

int main() {

	//char a = 22;

	//printf("%d \n", a << 1);
	//printf("%d \n", a << 3);
	//printf("%d \n", a << 6);


	//input�� output

	FILE* in, *out; //stream
	int n;

	in = fopen("input.txt", "r");
	out = fopen("output.txt", "a");

	// �̷��� ������ ���� ���� ����� �� �ִ�.
	if (in != nullptr) {
		

		fscanf(in, "%d", &n);
		fprintf(out, "%d \n", n);

		fclose(in);
		fclose(out);
	}
	

}

*/