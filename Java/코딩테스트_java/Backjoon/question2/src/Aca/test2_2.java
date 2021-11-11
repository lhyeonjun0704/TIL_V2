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
		return "[책이름 ]" + book_name + "\t" + "[장르]" + boook_genre + "\t" + "[책가격]" + book_price + "원";
	}
	
	
}

public class test2_2 {

	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		ArrayList<Books> arr1 = new ArrayList<Books>();
		int n = 0;
		
		arr1.add(new Books("우리는 해낼 수 있다", "자기개발", 12000));
		arr1.add(new Books("별이빛나는 밤에", "소설", 10000));
		arr1.add(new Books("나무와숲", "자기개발", 5000));
		arr1.add(new Books("나의연극인생", "자서전", 5000));
		arr1.add(new Books("잠자는공주", "판타지", 3000));
		
		System.out.println("<toString 으로 출력 예시 >");
		for(int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i).toString());
		}
		
		System.out.print("\n");
		System.out.println("<toString 없이 출력 예시 >");
		
		for(Books x : arr1) {
			if(x.getBook_price() >= 7000) {
				System.out.println(x.getBook_name() + "\t" + x.getBoook_genre() + "\t" + x.getBook_price());
				n++;
			}
		}
		
		System.out.println("");
		System.out.println("<책권수 출력 예시>");
		System.out.println(n + "권");
		
		
	}

}
