package pro06;

class Parent3 {
	int data2 = 10;
	
}


class Child3 extends Parent3 {
	int data = 20;
	
	void printData() {
		System.out.println("�θ��� �����ʹ�: " + super.data2);
		System.out.println("������ �����ʹ�: " + this.data);
		System.out.println("������ �����ʹ�: " + data);
		
	}
	
}




public class Test73 {

	public static void main(String[] args) {
		
		Child3 c = new Child3();
		
		c.printData();
		
		
	}

}
