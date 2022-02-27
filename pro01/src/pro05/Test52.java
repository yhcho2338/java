package pro05;

class Friend {
	
	String name;
	int age;

	
	void printFriend() {
		
		System.out.println("name: " + name + ". age: " + age);
	}
	
}

public class Test52 {

	public static void main(String[] args) {
	
		Friend f = new Friend(); 
		f.printFriend();
		f.name = "Alice";
		f.age = 20;
		f.printFriend();
		
		System.out.println(f);
		

	}

}
