package pro06;



class Parent8 {
	void print() {
		System.out.println("����");
	}
	
	void test() {
		System.out.println("����");
	}
		
}

class Child8 extends Parent8 {
	void print() {
		System.out.println("����");
		
	}
	
	void check() {
		System.out.println("ȣȣ");
	}
		
}


public class Test78 {

	public static void main(String[] args) {
		
		Parent8 p = new Parent8();
		p.print();
		p.test();
		//P.check();  // �ڽ�Ŭ�������� ���ǵ� ���� �����ü� ����
		
		Child8 c = new Child8();
		c.print();
		c.test();
		c.check();
		
		Parent8 x = new Parent8();
		x.print();
		x.test();
		
		
		
		

	}

}
