package pro03;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		
		/**
		 * for�� while�� �ǽ� 
		 * 
		 * 
		 */
		
	int score = 92;
	 if (score >= 90) {
		 System.out.println("Excellent!");
	  }else if (score >= 80) {
		System.out.println("Good!");
 	  }else if (score >= 70) {
		System.out.println("OK!");
	  }else {
	    System.out.println("Not OK");	
	  }
		
	 
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 
	 // ����
	 System.out.println("����� �ڵ� �Ƿ���?");
	 Scanner scin = new Scanner(System.in);
	  System.out.print("����: ");
	  int a = scin.nextInt();
	  if (a >= 90) {
		  System.out.println("Perfact!");
	  }else {
		  System.out.println("..SoSo");
	  }
	  
		

	}

}
