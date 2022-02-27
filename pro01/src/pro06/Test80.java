package pro06;

class Prt01 {
	
	void print() {
		System.out.println("¤¡¤¡");
	}
	
	void show() {
		System.out.println("¤¢¤¢");
	}
	
}



class Chd01 extends Prt01 {
	
	void print() {
		System.out.println("¤§¤§");
	}
	
	void showA() {
		System.out.println("¤¨¤¨");
	}
	
}


class Chd02 extends Prt01 {
	void print() {
		System.out.println("¤²¤²");
	}
	
	void showB() {
		System.out.println("¤³¤³");
	}
	
}


public class Test80 {
	
	static void doWork(Prt01 pk) {
		
		if (pk instanceof Chd01) {
			Chd01 ca = (Chd01) pk;
			ca.print();
			ca.show();
			ca.showA();
		} else if (pk instanceof Chd02) {
			Chd02 cb = (Chd02) pk;
			cb.print();
			cb.show();
			cb.showB();
				
		} else {
			pk.print();
			pk.show();
		}
	
		
	}
	
	
	public static void main(String[] args) {
		
		Prt01 p = new Prt01();
		Chd01 a	= new Chd01();
		Chd02 b = new Chd02();
		
		doWork(p);
		doWork(a);
		doWork(b);
		
	}

}
