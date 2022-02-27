package pro04;

import java.util.Arrays;

public class Test30 {

	public static void main(String[] args) {
		
		int score[];
		score = new int[] {90, 85, 92, 75, 88};
		
		for (int i = 0; i < score.length; i++)
			System.out.println("score["+ i +"]= " + score[i]);
		// length는 배열의 갯수	
		
		
		System.out.println();
		System.out.println();
		
		
		// 하나만 출력하는 경우 
		System.out.println(score[1]); // []는 인덱스번호 그러므로 85
		
		
		System.out.println();
		System.out.println();
		
		
		int score2[];
		score2 = new int[] {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(score2));
		
		
		System.out.println();
		System.out.println();
		
		
		int[] score3 = new int[5];
		System.out.println(score3);
		// 값 없이 길이만 설정하고 참조변수를 호출하면 위치가 나온다
		
		double[] score4 = new double[7];
		System.out.println(score4);
		
		

	}

}
