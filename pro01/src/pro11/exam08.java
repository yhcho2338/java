package pro11;

import java.io.IOException;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter one Character: ");
		
		int x;
		try {
			x = System.in.read();
			System.out.println("A: " + x);
			System.out.println("A: " + ((char)x));
		}
		
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		// 복습 필요
		
	}

}
