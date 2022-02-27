package pro12;


class Data1 <G extends Number> {
	G obj;
	
	Data1 (G ob1) {
		obj = ob1;
	}
	
	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
	
}


public class exam03 {

	public static void main(String[] args) {
		// 제네릭스를 상속 받을때의 예제
		
		Data1<Integer> d = new Data1<Integer>(100);
		
		
	}

}
