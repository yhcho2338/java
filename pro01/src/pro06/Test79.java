package pro06;


class Parent9 {
	
}

class Child9 extends Parent9 {
	
	
}



public class Test79 {

	
	public static void method1 (Parent9 cp) {
		if (cp instanceof Child9) {
			Child9 c1 = (Child9) cp;
			System.out.println("method1�� ����ȯ ����");
		} else {
			System.out.println("method1�� ����ȯ ����");
		}
		
	}
	
	
/*	public static void method2 (Parent9 p1) {
		Child9 c1 = (Child9) p1;
		System.out.println("method1�� ��ȯ����?");
		
	}*/  // �̷��� �ϸ� �ȵ�, if ���� Ȱ��
	
	
	
	public static void main(String[] args) {
		Parent9 p = new Child9();
		method1(p);
		//method2(p);
		
		Parent9 p1 = new Parent9();
		method1(p1);
		//method2(p1);
			

		
	}

}
