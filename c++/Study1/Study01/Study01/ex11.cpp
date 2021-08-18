/*
#include <stdio.h>

int main() {
	FILE* in = fopen("ex03.cpp", "r");
	char ch;

	/*
	while(fscanf(in, "%c", &ch) != EOF){
		fscanf(in, "%c", &ch);
		printf("%c", ch);
	} // 이런식으로도 가능하다
	*/
/*
	while (!feof(in)) { // end of file의 약자인데 파일의 끝에 도착했을 때 ture가 반환되는 것이다.
		fscanf(in, "%c", &ch);
		printf("%c", ch);
	}
	

	fclose(in);
}

*/