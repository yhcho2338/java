package pro03;

public class Test25 {

	public static void main(String[] args) {
	
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
			
		}
		System.out.println("sum: " + sum);  //  55
		
		
		
		int i1 = 1 , sum1 = 0;
		for (; i1<= 10; i1++) { // for���� �ʱⰪ�� ������
			sum1 += i1;
		if (i1 == 11) break; //  ���Ա��� ������ �Ҷ� if break ��������
		}
		System.out.println("sum1: " + sum1);
		
	
		
		System.out.println();
		
		
		// do... while �ݺ���
		int a1 = 1;
		do {
			System.out.println("Hello world");
			a1++;
		}
		while (a1 <= 5); // ;�� �ݵ�� �־� ������ �Ѵ�
		
		
		
		
		
		 
		
	}

}
