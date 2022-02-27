package interfaceTest02;

public class ChildrenBookResult {
	
	// 같은 패키지 안에 있으므로 import 할 필요 없다.

	public static void main(String[] args) {
		
		ChildrenBook b = new ChildrenBook("AA", "BB");
		b.printInfo();
		b.showTitle();

	}

}
