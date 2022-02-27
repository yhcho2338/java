package pro09;

public class MemberExample01 {

	public static void main(String[] args) {
		Member01 obj1 = new Member01("blue");
		Member01 obj2 = new Member01("blue");
		Member01 obj3 = new Member01("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		

	}

}
