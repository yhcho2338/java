package pro05;

class Friend3 {
	
	String name;
	int age;
	
	Friend3(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	void Hello() {
		System.out.println("Hello");
		
	}
	
	void printFriend() {
		this.Hello();
		System.out.println("name: " + this.name + ", age: " + this.age);
		System.out.println("Fighting");
		System.out.println();
	}
	
		
}



public class Test59 {

	public static void main(String[] args) {
		
		Friend3 f = new Friend3("가가", 20);
		Friend3 f2 = new Friend3("나나", 18);
		
		f.printFriend();
		f2.printFriend();
		
		
	 

	}
	
}
