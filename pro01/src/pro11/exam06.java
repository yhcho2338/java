package pro11;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수 args
		
		//int args[]  

		try {
			String data1 = args[0]; // 여기부터 오류, 매개변수 data1, 2가 없다, 문자열이 있어야 했다, 값은 -1
 			String data2 = args[1];
			int value1 = Integer.parseInt(data1); 
			// string형을 인티거 형으로 넣어라 그러나 값이 null
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		
	}

}
