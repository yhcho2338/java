package pro07;

import java.util.Scanner;

public class Test83 {

	public static void main(String[] args) {
		
		Scanner scin = new Scanner(System.in);
		System.out.print("0���� 100������ ������ �־��ּ���: ");
		int num = scin.nextInt();
		
		
		if (num < Limit.MIN || num > Limit.MAX) {
			System.out.println("������ ������ϴ�. �ٽ� �Է����ּ���.");
		} else {
			System.out.println("������ ���ϴ�.");
		}
		

	}

}
