/*
#include <stdio.h>

// ��ũ�ζ�� �θ���.
#define PI 3.14159 // ��� ����

#define PRINT_HELLO printf("Hello\n");

#define SQUARE(X) X * X

// ���� �����ڵ� ��ũ�η� �� �� ����
#define MAX(A, B) (((A) > (B)) ? (A) : (B))

#define FOR(I, S, E) for (int I = S; I <= E; I ++)

// ���ѷ���
#define LOOP while(true)

// enum
enum EGameState {
	GAMESTATE_MAINMENU, // �ڵ����� ���� ��ȣ �Ű���
	GAMESTATE_PLAYING,
	GAMESTATE_PAUSED,
	GAMESTATE_GAMEOVER
};

int max(int a, int b) {
	return (a > b) ? a : b;
}


int main() {

	//const float pi = 3.14159; // pi�� ����� �����ϰڴ�. ������ �Ұ����ϴ�.

	float a = PI;
	//pi = pi * 2; ���� �Ұ���

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