package pro06;


class Parent7 {
	int a = 10;
	
	void show() {
		System.out.println("AAAAA");
	}
	
}



class Child6 extends Parent7 {
	int b = 20;
	
	void show1() {
		System.out.println("BBBBB");
	}
	
}

class Child7 extends Parent7 {
	int c = 30;
	
	void show2() {
		System.out.println("CCCCC");
	}
	
}



public class Test77 {

	public static void main(String[] args) {
		
		Child6 c1 = new Child6();
		Child7 c2 = new Child7();

		System.out.println("c1.a: " + c1.a);
		System.out.println("c1.b: " + c1.b);
		System.out.println("c2.a: " + c2.a);
		System.out.println("c2.a: " + c2.c);
		
		c1.show();
		c1.show1();
	    c2.show();
		c2.show2();
		
		
	}

}
