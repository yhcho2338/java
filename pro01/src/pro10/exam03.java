package pro10;

public class exam03 {

	public static void main(String[] args) {
		String s3 = new String("Hi");
		String s4 = new String("Hi");
		
		// new는 새로운 객체를 생성하기때문에 주소값 역시 다름
		
		if (s3 == s4) {
			System.out.println("s3 == s4");
		} else {
			System.out.println("s3 != s4");
		}

	}

}


