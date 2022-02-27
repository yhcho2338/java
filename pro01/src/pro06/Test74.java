package pro06;


class Parent4 {
	
	void print () {
		System.out.println("Hey");
	}
}


class Child4 extends Parent4 {
	
	void print() {
		super.print();
	}
	
	
}



public class Test74 {

	public static void main(String[] args) {
		Child4 c = new Child4();
		c.print();

	}

}
