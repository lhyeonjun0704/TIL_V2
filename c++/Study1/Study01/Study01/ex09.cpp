/*
#include <stdio.h>

// 매크로라고 부른다.
#define PI 3.14159 // 상수 선언

#define PRINT_HELLO printf("Hello\n");

#define SQUARE(X) X * X

// 삼항 연산자도 매크로로 쓸 수 있음
#define MAX(A, B) (((A) > (B)) ? (A) : (B))

#define FOR(I, S, E) for (int I = S; I <= E; I ++)

// 무한루프
#define LOOP while(true)

// enum
enum EGameState {
	GAMESTATE_MAINMENU, // 자동으로 순서 번호 매겨줌
	GAMESTATE_PLAYING,
	GAMESTATE_PAUSED,
	GAMESTATE_GAMEOVER
};

int max(int a, int b) {
	return (a > b) ? a : b;
}


int main() {

	//const float pi = 3.14159; // pi를 상수로 선언하겠다. 변경이 불가능하다.

	float a = PI;
	//pi = pi * 2; 변경 불가능

	printf("pi = %.2f \n", PI);
	//printf("&pi = %p\n", &PI);
	
	PRINT_HELLO;

	printf("%d \n", SQUARE(5));

	printf("%d \n", max(5, 6));
	printf("%d \n", MAX(6, 5));

	//enum part
	int currentState = GAMESTATE_MAINMENU;
	
	while (true) {
		switch (currentState) {
		case GAMESTATE_MAINMENU:
			currentState = 1;
			break;
		case GAMESTATE_PLAYING:
			
			break;
		case GAMESTATE_PAUSED:

			break;
		case GAMESTATE_GAMEOVER:

			break;
		}
	}

}

*/