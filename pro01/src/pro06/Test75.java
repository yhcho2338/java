package pro06;


class Parent5 {
	int a;
	
	void print () {
		System.out.println("I am parent print");
	}
	
	Parent5(){}
	Parent5(int a) {
		this.a = a;
	}
		
		
	void test (int a) {
		System.out.println(a);
	}
	
}



class Child5 extends Parent5 {
	
	 void print () {
		 
		 System.out.println("I am child print");
	  
	 }
	 
	 void test () {
		
	 }
	 
}


public class Test75 {

	public static void main(String[] args) {
		Parent5 p = new Parent5();
		p.print();
		p.test(10);
		
		Child5 c = new Child5();
		c.print();
		c.test(20);

	}

}
