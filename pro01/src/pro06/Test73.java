package pro06;

class Parent3 {
	int data2 = 10;
	
}


class Child3 extends Parent3 {
	int data = 20;
	
	void printData() {
		System.out.println("부모의 데이터는: " + super.data2);
		System.out.println("아이의 데이터는: " + this.data);
		System.out.println("아이의 데이터는: " + data);
		
	}
	
}




public class Test73 {

	public static void main(String[] args) {
		
		Child3 c = new Child3();
		
		c.printData();
		
		
	}

}
