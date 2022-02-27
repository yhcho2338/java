package pro01;

public class Test7 {

	public static void main(String[] args) {
		
		byte b = 126;
		System.out.println(b); // 126
		b++;
		System.out.println(b); // 127
		b++;
		System.out.println(b); // -128
		
		
		byte b2 = -127;
		System.out.println(b2); // -127
		b2--;
		System.out.println(b2); // -128
		b2--;
		System.out.println(b2); // 127
		
		// -128~127 까지 양 끝이 이어진 반지 형태
		
		
		
		
		short x = 200;
		System.out.println(x); 
		x++;
		System.out.println(x); // 201
		x++;
		System.out.println(x); // 202
		
		
		short y = 32767;
		System.out.println(y); // 32767
		y++;
		System.out.println(y); // -32768
		
		
		
		
		int i = 2147483647;  // 기본, cpu 최적의 용량이 4byte라서 많이 사용
		System.out.println(i);  // 2147483647 맥시멈값
		
		
		
		
		long a1 = 500; // int에 포함되는 수이므로 L을 붙일 필요는 없다
		long b1 = 700L;
		long c1 = 1000L; // 대문자 L로 쓸것 
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		
		long L = 2147483648L;
		System.out.println(L);  // int 범위를 초과할땐 접미사 L
				
				
		long L1 = 2147483647;
		System.out.println(L1); //  2147483647
		L1++;
		System.out.println(L1); //  2147483648
		
		
		
		
		
		
	}

}
