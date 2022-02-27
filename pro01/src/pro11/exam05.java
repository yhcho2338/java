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
			throw me; // 예외의 발생이지만 me 의 주소인 MyException을 불러온다 
		}
		catch (MyException e) {
			System.out.println(e); // 참조변수 뒤엔 뒤엔 toString이 생략 되어있음
		}
		System.out.println("main ends");

	}

}
