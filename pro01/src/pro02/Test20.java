package pro02;

public class Test20 {

	public static void main(String[] args) {
		
		byte bi, bj;
		int i = 100, j = 300;
	    bi = (byte) i;
 	     System.out.println("bi: " + bi);
 	    bj = (byte) j;
 	     System.out.println("bj: " + bj);  
 	     
 	     // int값을 작은 단위인 byte로 형변환시 양수인 300을 거꾸로 계산하면 44가 됨
		
 	     
 	     int i1;
 	     double x = 10.5, y = 2.8;
 	     i1 = (int)(x/y);
 	     System.out.println("(int) x/y: " + i1);  // 3
		

 	     
 	     
 	    byte b1 = 10, b2;
 	    int i2 = 5;
 	    b2 = (byte)(b1 + i2);
 	    System.out.println("b1: " + b2); // 15
 	     
 	     
	}

}
