package pro01;

public class Test6 {

	public static void main(String[] args) {
		
	//byte b = 200;
	//System.out.println(b); // �ʱ�ȭ���� ������ �ԷºҰ�
		
	byte b = 126;
	System.out.println(b);
	b++;
	System.out.println(b);
	b++;
	System.out.println(b); // -128, ������δ� ���� ���ڸ��� ���
	
	System.out.println(b = ++b); // -127,
	
	
	
	
	byte b2 = -127;
	System.out.println(b);
	b--;
	System.out.println(b);
	b--;
	System.out.println(b); 

	
	
	
	
	}

}
