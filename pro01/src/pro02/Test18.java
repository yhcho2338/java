package pro02;

public class Test18 {

	public static void main(String[] args) {
		
		int a = 30, b = 11, c = 7, d = 10;
		a += b + c - d;
		System.out.println(a);  // 38
		
		
		a %= b - c;
		System.out.println(a);  // 2
		
		
		
		int a1 = 20, b1 = 7, c1 = 30, d1 = 2, e1 = 8;
		int x = a1 / b1 + c1 * d1 % e1; 
		System.out.println("x = " + x); 
		
		boolean y = a1 > b1 + c1 && d1 < 8;
		System.out.println("y = " + y);
		
		int z = 100;
		z += a1 + b1 - c1 * d1 / e1;
		System.out.println("z = " + z); 

	}

}
