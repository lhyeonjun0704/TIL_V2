/*
//  ����ü

#include <stdio.h>

struct ProductInfo {
	
	int num;
	char name[100];
	int cost;

};

void productSale(ProductInfo* p, int percent) {
	p->cost -= p->cost * percent / 100;
}

struct Point2 {
	int x, y;

	void moveRight() { x++; }
	void moveLeft() { x--; }
	void moveUp() { y++; }
	void moveDown() { y--; }
};


int main() {

	struct Point { int x, y; }; //typedef struct { int x, y; } Point; ���� ǥ���̴�.
	 
	Point2 p2 = { 2, 5 };

	p2.moveRight();
	p2.moveDown();
	p2.moveLeft();
	p2.moveUp();

	printf("(%d, %d) \n", p2.x, p2.y);

	Point p;
	p.x = 3;
	p.y = 4;

	printf("(%d, %d) \n", p.x, p.y);


	ProductInfo myProduct = { 3.14 , "pie", 100 };

	// ����ü�� ������
	ProductInfo* ptr_product = &myProduct;

	productSale(&myProduct, 10);

	printf("��ȣ : %d \n", ptr_product -> num); // (*ptr_product).num �� ���� ǥ���̴�.
	printf("�̸� : %s \n", ptr_product -> name);
	printf("���� : %d \n", ptr_product -> cost);


	

}

*/