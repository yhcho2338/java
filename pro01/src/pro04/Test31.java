package pro04;

import java.util.Arrays;

public class Test31 {

	public static void main(String[] args) {
		
		int [] original = {4, 2, 9, 7, 10, 3};
		int [] destination = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.arraycopy(original, 2, destination, 4, 3);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(destination));
		
		
		
		int data1[] = {4, 2, 9, 10, 1};
		int data2[];
		
		data2 = data1;
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		
		
		
		int data3[] = {1, 2, 3, 4, 5};
		int data4[];

		data4 = data3;
		data3[3] = 3000;
		
		System.out.println("data3: " + Arrays.toString(data3));
		System.out.println("data4: " + Arrays.toString(data4));
		
		
		
		
		
		
	}

}
