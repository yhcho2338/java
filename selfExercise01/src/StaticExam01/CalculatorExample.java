package StaticExam01;

public class CalculatorExample {

	public static void main(String[] args) {
		double result01 = 10 * 10 * Calculator.PI;
		int result02 = Calculator.plus(10, 5);
		int result03 = Calculator.minus(10, 5);
		
		// 정적 맴버인 static은 객체에 속한게 아니며
		// 위와 같이 클래스명과 사용할 변수나 메소드명을 붙여서 적어준다
		
		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result02);
		
		

	}

}
