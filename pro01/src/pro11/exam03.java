package pro11;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = new int[5];
		try {
			A[7] = 100;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 메시지: " + e.getMessage());
		}

	}

}
