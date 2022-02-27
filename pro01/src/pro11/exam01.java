package pro11;

public class exam01 {

	public static void main(String[] args) {
		
		// 예외
		
		int a=5, b=0, c;
		
		try {
			c = a / b;
			System.out.println("c: " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("o으로 나눌 수 없다.");
		}

	}

}
