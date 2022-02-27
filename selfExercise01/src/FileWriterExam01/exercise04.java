package FileWriterExam01;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		// 연습
    
    Scanner scin = new Scanner (System.in);
	System.out.print("점수를 입력하라: ");
	int score = scin.nextInt();
	char grade;
	
	
	
	if (score < 100 && score > 70) {
		grade = 'A';
	}else if (score < 70 && score > 50) {
		grade = 'B';
	}else if (score < 50 && score > 30) {
		grade = 'C';
	}else {
		grade = 'F';
	}
	System.out.println("등급은 " + grade);
	
	
	
	
			
		
		

	}

}
