package pro01;

public class Test6 {

	public static void main(String[] args) {
		
	//byte b = 200;
	//System.out.println(b); // 초기화때는 범위외 입력불가
		
	byte b = 126;
	System.out.println(b);
	b++;
	System.out.println(b);
	b++;
	System.out.println(b); // -128, 계산결과로는 가장 끝자리로 출력
	
	System.out.println(b = ++b); // -127,
	
	
	
	
	byte b2 = -127;
	System.out.println(b);
	b--;
	System.out.println(b);
	b--;
	System.out.println(b); 

	
	
	
	
	}

}
