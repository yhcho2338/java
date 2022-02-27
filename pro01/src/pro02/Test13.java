package pro02;

public class Test13 {

	public static void main(String[] args) {
		
		/* int a = 10, b;
		b = a++;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// a: 11 , b: 10
		
		
		
		int a1 = 10, b1;
		b1 = ++a1;
		
		System.out.println("a1: " + a1);
		System.out.println("b1: " + b1);
		
		// a1: 11 , b1: 11 */

		
		int hap, j, k, L;
		j = k = L = 0;
		hap = ++j + k++ + ++L;
		System.out.printf(("%d, %d, %d, %d\n") , hap, j, k, L);
        // 2 , 1 , 1 , 1
		
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;
		++x;
		System.out.println("x= " + x);
		// 12
		
		
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("v= " + y);
        // 8
		
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		// 12 , 13
		
		
		
		System.out.println("--------------------");
		z= ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		// 14 , 14
		
		
		System.out.println("-------------------");
		z= ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y); 
		// 23 , 15 , 9
		
	}

}
