package pro06;



class Parent8 {
	void print() {
		System.out.println("히히");
	}
	
	void test() {
		System.out.println("헤헤");
	}
		
}

class Child8 extends Parent8 {
	void print() {
		System.out.println("하하");
		
	}
	
	void check() {
		System.out.println("호호");
	}
		
}


public class Test78 {

	public static void main(String[] args) {
		
		Parent8 p = new Parent8();
		p.print();
		p.test();
		//P.check();  // 자식클래스에만 정의된 것은 가져올순 없다
		
		Child8 c = new Child8();
		c.print();
		c.test();
		c.check();
		
		Parent8 x = new Parent8();
		x.print();
		x.test();
		
		
		
		

	}

}
