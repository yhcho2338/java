package real_test;

interface WithPrivate {
	default int getData() {
		print();
		return get() + 100;
	}
	
	private void print( ) {
		System.out.println(get());
	}
	private int get() {
		return 100;
	}
}

class Test4 implements WithPrivate {
	void test() {
		int x = getData();
		System.out.println(("x: " + x));
	}
	
}


public class realTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = new Test4();
		t.test();

	}

}

/*

1¹ø: interface 
2¹ø: Test4
3¹ø: new 

*/