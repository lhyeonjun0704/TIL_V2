package question4;

class Sangpoom{
	String irum;
	int soo;
	int dan;
	
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getSoo() {
		return soo;
		} 
		this.soo = soo;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public String toString() {
		return irum + " " + soo + " " + dan;
	}
	
	public Sangpoom() {}
	
	public Sangpoom(String irum, int soo, int dan) {
		super();
		this.irum = irum;
		this.soo = soo;
		this.dan = dan;
	}
	
	
}

public class SooDanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sangpoom milk = new Sangpoom();
		milk.setIrum("¿ìÀ¯");
		milk.setSoo(20);
		milk.setDan(1000);
		System.out.print(milk.getIrum() + " ");
		System.out.print(milk.getSoo() + " ");
		System.out.println(milk.getDan());
//		System.out.println(milk);
		
		Sangpoom bread = new Sangpoom();
		bread.setIrum("»§");
		bread.setSoo(100);
		bread.setDan(500);
		System.out.print(bread.getIrum() + " ");
		System.out.print(bread.getSoo() + " ");
		System.out.println(bread.getDan());
//		System.out.println(bread);
		
		Sangpoom snack = new Sangpoom("°úÀÚ", 200, 700);
		System.out.print(snack.getIrum() + " ");
		System.out.print(snack.getSoo() + " ");
		System.out.println(snack.getDan());
//		System.out.println(snack);
		
		System.out.println("ÃÑÆÇ¸Å¾× = " + ((bread.dan*bread.soo) + (milk.dan*milk.soo) + (snack.dan*snack.soo)));
		
	}

}
