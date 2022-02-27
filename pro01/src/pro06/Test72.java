package pro06;


class Parent2 {
	private int dataA;
	
	
Parent2 (){}
Parent2 (int dataA){
	this.dataA = dataA;
}
	
void printA() {
	System.out.println("dataA: " + dataA);
}
	
	
}


class Child2 extends Parent2 {
	private int dataB;
	
	Child2() {}
	Child2(int dataA, int dataB) {
		super(dataA);
		this.dataB = dataB;
	}
	
	void printB() {
		System.out.println("dataB: " + dataB);
	}
	
	
}


public class Test72 {

	public static void main(String[] args) {
		
		Child2 c = new Child2(10, 20);
		
		c.printA();
		c.printB();

	}

}
