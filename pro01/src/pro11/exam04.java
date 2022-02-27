package pro11;

public class exam04 {
	
	public static void makeArray() throws ArrayIndexOutOfBoundsException {
		
		   int A[] = new int[3];
		   
		   A[0] = 10;
		   A[1] = 20;
		   A[2] = 30; // int[]에 선연된 index 3까지만 처리하고
		   A[3] = 40; // throws 로 떠넘기고 오류없이 처리
		   A[4] = 50;

		}

	public static void main(String[] args) {
		// 예외처리 배열

	System.out.println("main starts");
	
	try {
		makeArray();
		
		
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("오류 메시지: " + e.getMessage());
	}
	System.out.println("main ends");
		
	}


}
