package pro04;

import java.util.Arrays;

public class Test32 {

	public static void main(String[] args) {

		int[][] data = new int [3][4];
		data[0][0] = 10;
		data[0][1] = 15;
		data[0][2] = 7;
		data[0][3] = 3; 
        data[1][0] = 1;
        data[1][1] = 5;
		data[1][2] = 17;
		data[1][3] = 30;
		data[2][0] = 20;
		data[2][1] = 2;
		data[2][2] = 6;
		data[2][3] = 13;
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.print(data[i][k] + " ");
			}
			System.out.println();
			
		}
		
		// 복습필요
		System.out.println();
		System.out.println();
		
		
		int data1 [][] = new int [3][];
		data1[0] = new int[4];
		data1[1] = new int[5];
		data1[2] = new int[3];
		
		data1 [0][0] = 1;
		data1 [0][1] = 2;
		data1 [0][2] = 3;
		data1 [0][3] = 4;
		data1 [1][0] = 5;
		data1 [1][1] = 6;
		data1 [1][2] = 7;
		data1 [1][3] = 8;
		data1 [1][4] = 9;
		data1 [2][0] = 10;
		data1 [2][1] = 11;
		data1 [2][2] = 12; // 값을 넣어주면 0이 아닌 값이 출력
	
		for (int m = 0; m < data1.length; m++) {
			for(int n = 0; n < data1[m].length; n++) {
				System.out.print(data1[m][n] + " ");
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int data2[] = {4, 2, 9, 10, 1};
		 for (int x : data2) {
			 System.out.print(x + " ");
		 }

		 System.out.println();
		 System.out.println();
		
			
		 
		 String s1 = "Hello";
         String s2 = new String ("world");
			
         System.out.println(s1);
		 System.out.println(s2);
			
		
		
		
		
	}

}
