#include <stdio.h>

// ��������
int itemCnt = 0;
int money = 100;

void buyItem() {

	//�������� ���
	itemCnt++;
	money -= 10;

	printf("�������� �����߽��ϴ�. \n");
	printf("������ ���� : %d \n", itemCnt);
	printf("�ܾ� : %d \n", money);

}


int main() {

	

	buyItem();



}