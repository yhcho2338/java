package pro03;

public class Test26 {

	public static void main(String[] args) {
		
		// break 구문
		
		int a = 1;
		while (a <= 10) {
			if (a == 5) break; // 가장 가까운 번복, 선택문을 빠져나감
			
		System.out.println("a: " +a);
		a++;
			
		}
		
		
		int a1 = 1;
		while (a1 <= 5) {
			if (a1 == 10) break;
			
		System.out.println("a1: " +a1);	
		a1++;	
		}  // 위의 경우 if 문을 만날수 없음
		
		
		
		int a2 = 0;
		while (a2 < 10) {
		  a2++;
		  if (a2 % 3 == 0) continue;
		  System.out.println(a2);	
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		// 중첩 반복문
		int row, col;
		row = 1;
		while (row <= 10) {
			
			col = 1;
			while (col <= 10) {
				System.out.print(row * col + " ");
				col++;
			}
		row++;
		System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		// 중첩 반복문 -> for 문으로
		int row1, col1;
		 for (row1 = 1; row1 <= 10; row1++) {
			for (col1 = 1; col1 <= 10; col1++) {
				System.out.print(row1 * col1 + " ");
			}
		System.out.println();	 
		 }
		
		
		
		
	}

}
