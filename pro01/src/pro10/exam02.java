package pro10;

class Thing02 {
	
	private String name;
	private int price;
	
	Thing02 (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString2() {
		
	return "name: " + name + ", price: " + price;
		
	}
	
	
}


public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thing02 t2 = new Thing02 ("Book", 15000);
		String s2 = t2.toString2();
		
		System.out.println(s2);
		System.out.println(t2);

	}

}
