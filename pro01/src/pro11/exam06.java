package pro11;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ű����� args
		
		//int args[]  

		try {
			String data1 = args[0]; // ������� ����, �Ű����� data1, 2�� ����, ���ڿ��� �־�� �ߴ�, ���� -1
 			String data2 = args[1];
			int value1 = Integer.parseInt(data1); 
			// string���� ��Ƽ�� ������ �־�� �׷��� ���� null
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch (Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
		
	}

}
