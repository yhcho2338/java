package pro11;

public class exam04 {
	
	public static void makeArray() throws ArrayIndexOutOfBoundsException {
		
		   int A[] = new int[3];
		   
		   A[0] = 10;
		   A[1] = 20;
		   A[2] = 30; // int[]�� ������ index 3������ ó���ϰ�
		   A[3] = 40; // throws �� ���ѱ�� �������� ó��
		   A[4] = 50;

		}

	public static void main(String[] args) {
		// ����ó�� �迭

	System.out.println("main starts");
	
	try {
		makeArray();
		
		
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("���� �޽���: " + e.getMessage());
	}
	System.out.println("main ends");
		
	}


}
