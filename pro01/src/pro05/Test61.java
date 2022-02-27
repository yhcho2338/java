package pro05;

class Person {
	
	
	static int count;
	String name;
	 
	
	Person(){
		count++;
    }
	
	static void printCount() {
		System.out.println("count: " + count);
	}
	
}


public class Test61 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person.printCount();
		p1.printCount();
		p2.printCount();
		
		

	}

}
