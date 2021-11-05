package Aca;

import java.util.ArrayList;

// array : 배열, 고정길이
// collection : 컬렉션, 가변길이 배열, multi data type

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
		return "SMarket [상픔명=" + sangpum + ", 가격=" + price + "]";
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
//		//array(배열) 길이는 i < 10 ==> k.length
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

//sangpum, price속성이 있는  SMarket 클래스를 활용하여 
//main()에서 8개정도 객체를 만들어 ArrayList 컬렉션에 넣은다음
// 1) toString() 사용 하지 않고 상품이름 모두 출력하고 
//2) toString() 사용 하지 않고 2000원 이하인 상품명과 상품가격을 모두 출력하시오
//3) 또한  for-colon을 사용하여 전체 상품명과 상품가격을 출력하시오
       //(  for-colon 시 toString() 자동 사용됨) 



/*(출력결과 예시)

<8개 상품 출력>  
우유
빵
버터
카카오
삼각김밥
도시락
커피
의류건조기

<2000이하 상품명및 가격 모두 출력 및 갯수출력>


우유,1000
빵,2000
삼각김밥,1200

조건에 맞는 상품갯수는 두구두구~~~~3 개 

<for-콜론(foreach)를 사용하여 전체 상품이름, 가격 모두 출력하기> 

상품이름은  우유 이고  상품가격은 1000 입니다
상품이름은  빵 이고  상품가격은 2000 입니다
상품이름은  버터 이고  상품가격은 5000 입니다
상품이름은  카카오 이고  상품가격은 3000 입니다
상품이름은  삼각김밥 이고  상품가격은 1200 입니다
상품이름은  도시락 이고  상품가격은 4500 입니다
상품이름은  커피 이고  상품가격은 2500 입니다
상품이름은  의류건조기 이고  상품가격은 2000000 입니다

*/
