package Aca;

import java.util.ArrayList;

// array : �迭, ��������
// collection : �÷���, �������� �迭, multi data type

class SMarket{
	String sangpum;
	int price;
	
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "SMarket [���ĸ�=" + sangpum + ", ����=" + price + "]";
	}
	
	public SMarket() {
		
	}
	
	public SMarket(String sangpum, int price) {
		super();
		this.sangpum = sangpum;
		this.price = price;
	}
	
	
	
}

public class Collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//List
//		ArrayList arr1 = new ArrayList();
//		
//		//array(�迭) ���̴� i < 10 ==> k.length
//		System.out.println(arr1.size());
//		
//		arr1.add(new Integer(300));
//		arr1.add(new Double(100.7));
//		arr1.add(new Character('A'));
//		arr1.add(new String("ondal"));
//		
//		System.out.println(arr1);
		
		SMarket milk = new SMarket();
		milk.setSangpum("milk1");
		milk.setPrice(1000);
		
		ArrayList<SMarket> arrex = new ArrayList<SMarket>();
		
		arrex.add(milk);
		arrex.add(new SMarket("Bread", 2000));
		
		System.out.println(arrex.get(0).getSangpum());
		
		for(SMarket x: arrex) {
			System.out.println(x);
		}
//		System.out.println(arrex.get(0));
		
	}

}

//sangpum, price�Ӽ��� �ִ�  SMarket Ŭ������ Ȱ���Ͽ� 
//main()���� 8������ ��ü�� ����� ArrayList �÷��ǿ� ��������
// 1) toString() ��� ���� �ʰ� ��ǰ�̸� ��� ����ϰ� 
//2) toString() ��� ���� �ʰ� 2000�� ������ ��ǰ��� ��ǰ������ ��� ����Ͻÿ�
//3) ����  for-colon�� ����Ͽ� ��ü ��ǰ��� ��ǰ������ ����Ͻÿ�
       //(  for-colon �� toString() �ڵ� ����) 



/*(��°�� ����)

<8�� ��ǰ ���>  
����
��
����
īī��
�ﰢ���
���ö�
Ŀ��
�Ƿ�������

<2000���� ��ǰ��� ���� ��� ��� �� �������>


����,1000
��,2000
�ﰢ���,1200

���ǿ� �´� ��ǰ������ �α��α�~~~~3 �� 

<for-�ݷ�(foreach)�� ����Ͽ� ��ü ��ǰ�̸�, ���� ��� ����ϱ�> 

��ǰ�̸���  ���� �̰�  ��ǰ������ 1000 �Դϴ�
��ǰ�̸���  �� �̰�  ��ǰ������ 2000 �Դϴ�
��ǰ�̸���  ���� �̰�  ��ǰ������ 5000 �Դϴ�
��ǰ�̸���  īī�� �̰�  ��ǰ������ 3000 �Դϴ�
��ǰ�̸���  �ﰢ��� �̰�  ��ǰ������ 1200 �Դϴ�
��ǰ�̸���  ���ö� �̰�  ��ǰ������ 4500 �Դϴ�
��ǰ�̸���  Ŀ�� �̰�  ��ǰ������ 2500 �Դϴ�
��ǰ�̸���  �Ƿ������� �̰�  ��ǰ������ 2000000 �Դϴ�

*/
