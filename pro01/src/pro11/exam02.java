package pro11;

public class exam02 {

	public static void main(String[] args) {
		// �迭 �ε��� ����
		
		int n[] = {7, 9, 10, 2, 5};
		int i = 0;
		
		try {
			for (i=0; i<=5; i++) {
				System.out.println("n[" + i + "] = " + n[i]);
			}
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(i + "�� ���� �ε�����");
		}

		
	}

}
