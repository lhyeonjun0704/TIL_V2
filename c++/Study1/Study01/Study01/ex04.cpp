/*
#include <stdio.h>

// 전역변수
int itemCnt = 0;
int money = 100;

int cost;

void buyItem(int cost) {

	//아이템을 산다
	itemCnt++;
	money -= cost;

	printf("아이템을 구매했습니다. \n");
	printf("아이템 개수 : %d \n", itemCnt);
	printf("잔액 : %d \n", money);

}

void swap(int* x, int* y) {
	int tmp = *x;
	*x = *y;
	*y = tmp;
}


int main() {
	
	int a, b;

	scanf("%d%d \n", &a, &b);

	swap(&a, &b);
	printf("a = %d, b= %d \n", a, b);

	//buyItem(30);

	//buyItem(50);

	


}

*/