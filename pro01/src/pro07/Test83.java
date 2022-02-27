package pro07;

import java.util.Scanner;

public class Test83 {

	public static void main(String[] args) {
		
		Scanner scin = new Scanner(System.in);
		System.out.print("0부터 100까지의 정수를 넣어주세요: ");
		int num = scin.nextInt();
		
		
		if (num < Limit.MIN || num > Limit.MAX) {
			System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
		} else {
			System.out.println("범위에 들어갑니다.");
		}
		

	}

}
