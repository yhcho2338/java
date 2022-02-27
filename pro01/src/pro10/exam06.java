package pro10;

import java.util.Random;

public class exam06 {

	public static void main(String[] args) {
		// 랜덤

		Random rand1 = new Random();
		Random rand2 = new Random();
		
		for(int i = 0; i < 3; i++) {
			System.out.println(rand1.nextInt() + " ");
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(rand2.nextInt(100) + " ");
		}
	}
	
	// 이어서 복습

}
