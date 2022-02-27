package pro05;

class PersonInfo {
	
	String name;
	int age;
	double height;
	
	PersonInfo() {
		
	
	}
	
}



public class Test56 {

	public static void main(String[] args) {
		
	PersonInfo p = new PersonInfo();
	// 다른형태로 복습
	
	p.name = "Alice";
	p.age = 20;
	p.height = 140.5;
	
	System.out.println("p.name: " + p.name);
	System.out.println("p.age: " + p.age);
	System.out.println("p.height" + p.height);
		
		
	}

}
