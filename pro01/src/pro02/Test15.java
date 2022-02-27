package pro02;

public class Test15 {

	public static void main(String[] args) {
		
		int x = 20;
		int a = 2;
		
		int r1 = x >> a;
		int r2 = x >>> a; // 불필요함
		int r3 = x << a;
		
		System.out.println("r1 : " + r1);  // 5
		System.out.println("r2 : " + r2);  // 5  
		System.out.println("r3 : " + r3);  // 80
		
		
	}

}
