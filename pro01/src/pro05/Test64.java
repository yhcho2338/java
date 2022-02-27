package pro05;

class Book3 {
	private String title;
	private int price;
	
	Book3(){}
	Book3(String title, int price) {
		this.title = title;
		this.price = price;
		
	}
	
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	void printBook() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
	}
	
}



public class Test64 {

	public static void main(String[] args) {
		
		Book3 bk = new Book3("Java의 정석", 30000);
		bk.printBook();
		bk.setPrice(18000);
		bk.setTitle("Java의 정석 2");
		System.out.println("title: " + bk.getTitle());
		System.out.println("price: " + bk.getPrice());
	
	}

}
