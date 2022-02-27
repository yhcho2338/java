package abstractTest01;


// 같은 패키지 이므로 import 안해줘도 됨

public class Result01 {

	public static void main(String[] args) {
		Parent22 x = new Child22();
		Parent22 y = new Child23();
		
		x.show();
		y.show();
		x.print();
		y.print();
		

	}

}
