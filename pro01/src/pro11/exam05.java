package pro11;


class MyException extends Exception {
	int x;
	MyException(int x) {
		this.x = x;
	}
	public String toString() {
		return "I am " + x + " in MyException class";
	}
	
}



public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyException me = new MyException(10);
		
		try {
			System.out.println("before throw MyException");
			throw me; // ������ �߻������� me �� �ּ��� MyException�� �ҷ��´� 
		}
		catch (MyException e) {
			System.out.println(e); // �������� �ڿ� �ڿ� toString�� ���� �Ǿ�����
		}
		System.out.println("main ends");

	}

}
