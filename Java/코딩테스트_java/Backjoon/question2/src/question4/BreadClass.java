package question4;

class Bread{
	String ty;
	int price;
	public String getTy() {
		return ty;
	}
	public void setTy(String ty) {
		this.ty = ty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Bread(String ty, int price) {
		super();
		this.ty = ty;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Bread [ty=" + ty + ", price=" + price + "]";
	}
	
}

class Example{
	protected int dia;
	public void ex() {
		System.out.println("success");
	}
}


public class BreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread bd = new Bread("tiramisu", 4);
		
		System.out.println(bd);
	}

}
