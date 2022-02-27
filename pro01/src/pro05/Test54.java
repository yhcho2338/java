package pro05;

class Friend2 {
	
	String name;
	int age;
	
	Friend2() {}
	Friend2(String n, int a) {
		name = n;
		age = a;
		
	}
	
	void printFriend2() {
		System.out.println("name: " + name + " , age: " + age);
		
	}
}


public class Test54 {

	public static void main(String[] args) {
		
		Friend2 f = new Friend2("Alice", 20);
		Friend2 f2 = new Friend2("Bob", 15);
		
		f.printFriend2();	
		f2.printFriend2();
	}
}
