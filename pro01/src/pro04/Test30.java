package pro04;

import java.util.Arrays;

public class Test30 {

	public static void main(String[] args) {
		
		int score[];
		score = new int[] {90, 85, 92, 75, 88};
		
		for (int i = 0; i < score.length; i++)
			System.out.println("score["+ i +"]= " + score[i]);
		// length�� �迭�� ����	
		
		
		System.out.println();
		System.out.println();
		
		
		// �ϳ��� ����ϴ� ��� 
		System.out.println(score[1]); // []�� �ε�����ȣ �׷��Ƿ� 85
		
		
		System.out.println();
		System.out.println();
		
		
		int score2[];
		score2 = new int[] {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(score2));
		
		
		System.out.println();
		System.out.println();
		
		
		int[] score3 = new int[5];
		System.out.println(score3);
		// �� ���� ���̸� �����ϰ� ���������� ȣ���ϸ� ��ġ�� ���´�
		
		double[] score4 = new double[7];
		System.out.println(score4);
		
		

	}

}
