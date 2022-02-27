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
		for (; i1<= 10; i1++) { // for문에 초기값이 없을때
			sum1 += i1;
		if (i1 == 11) break; //  출입구를 만들어야 할땐 if break 구문으로
		}
		System.out.println("sum1: " + sum1);
		
	
		
		System.out.println();
		
		
		// do... while 반복문
		int a1 = 1;
		do {
			System.out.println("Hello world");
			a1++;
		}
		while (a1 <= 5); // ;을 반드시 넣어 끝내야 한다
		
		
		
		
		
		 
		
	}

}
