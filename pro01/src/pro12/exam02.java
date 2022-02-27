package pro12;

class TwoGenerics<H1, H2> {
	H1 data1;
	H2 data2;
	
	TwoGenerics(H1 d1, H2 d2) {
		data1 = d1;
		data2 = d2;
	}
	
	void showGenericsType () {
		System.out.println("제네릭형 H1: " + data1.getClass().getName());
		System.out.println("제네릭형 H2: " + data2.getClass().getName());
	}
	H1 getData1() {
		return data1;
	}
	H2 getData2() {
		return data2;
	}
	
}

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoGenerics<Integer, String> x 
		= new TwoGenerics<Integer, String> (100, "Hello");
		
		x.showGenericsType();
		int y = x.getData1();
		System.out.println("value: " + y);
		String z = x.getData2();
		System.out.println("value: " + z);
	}

}
