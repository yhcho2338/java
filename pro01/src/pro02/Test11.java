package pro02;

public class Test11 {

	public static void main(String[] args) {
		
		int a = 30, b = 7;
		int c, d, e, f, g;
		
		c = a + b;
		d = a - b;
		e = a * b;
		f = a % b;
		g = a / b;
		
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("g: " + g);
		
		
		int n = 2753;
		int a1, b1, c1, d1;
		a1 = n / 1000;
		n = n % 1000;
		b1 = n / 100;
		n = n % 100;
		c1 = n / 10;
		d1 = n % 10;
		
		System.out.println("1000�� �ڸ�: " + a1);
		System.out.println("100�� �ڸ�: " + b1);
		System.out.println("10�� �ڸ�: " + c1);
		System.out.println("1�� �ڸ�: " + d1);
		

	}

}
