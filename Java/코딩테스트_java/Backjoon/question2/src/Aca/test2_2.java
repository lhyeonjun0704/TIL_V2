package Aca;

import java.util.ArrayList;

class Books{
	private String book_name;
	private String boook_genre;
	private int book_price;
	
	public Books(){}
	
	public Books(String book_name, String boook_genre, int book_price) {
		super();
		this.book_name = book_name;
		this.boook_genre = boook_genre;
		this.book_price = book_price;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBoook_genre() {
		return boook_genre;
	}
	public void setBoook_genre(String boook_genre) {
		this.boook_genre = boook_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	@Override
	public String toString() {
		return "[å�̸� ]" + book_name + "\t" + "[�帣]" + boook_genre + "\t" + "[å����]" + book_price + "��";
	}
	
	
}

public class test2_2 {

	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		ArrayList<Books> arr1 = new ArrayList<Books>();
		int n = 0;
		
		arr1.add(new Books("�츮�� �س� �� �ִ�", "�ڱⰳ��", 12000));
		arr1.add(new Books("���̺����� �㿡", "�Ҽ�", 10000));
		arr1.add(new Books("�����ͽ�", "�ڱⰳ��", 5000));
		arr1.add(new Books("���ǿ����λ�", "�ڼ���", 5000));
		arr1.add(new Books("���ڴ°���", "��Ÿ��", 3000));
		
		System.out.println("<toString ���� ��� ���� >");
		for(int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i).toString());
		}
		
		System.out.print("\n");
		System.out.println("<toString ���� ��� ���� >");
		
		for(Books x : arr1) {
			if(x.getBook_price() >= 7000) {
				System.out.println(x.getBook_name() + "\t" + x.getBoook_genre() + "\t" + x.getBook_price());
				n++;
			}
		}
		
		System.out.println("");
		System.out.println("<å�Ǽ� ��� ����>");
		System.out.println(n + "��");
		
		
	}

}
