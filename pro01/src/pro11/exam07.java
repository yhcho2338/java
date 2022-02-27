package pro11;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scin = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = scin.next();
		
		System.out.print("Phone number: ");
		String phone = scin.next();
		
		System.out.print("Age: ");
		int age = scin.nextInt();
		
		System.out.print("Height: ");
		float height = scin.nextFloat();
		
		System.out.print("Gender: ");
		char gender = scin.next().charAt(0);
		
		
		System.out.println("Name: " + name);
		System.out.println("Phone number: " + phone);
		System.out.println("나이: " + age);
		System.out.println("신장: " + height);
		System.out.println("성별: " + gender);
		
		scin.close();
	}

}
