package pro03;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		
		/**
		 * for문 while문 실습 
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
	 
	 // 연습
	 System.out.println("당신의 코딩 실력은?");
	 Scanner scin = new Scanner(System.in);
	  System.out.print("점수: ");
	  int a = scin.nextInt();
	  if (a >= 90) {
		  System.out.println("Perfact!");
	  }else {
		  System.out.println("..SoSo");
	  }
	  
		

	}

}
