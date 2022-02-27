package pro05;

class Dog2 {
	
	String name;
	String color;
	
	Dog2(){
		System.out.println("Default constructor is called");
		
	}
	
	void printDog2() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
		
	}
	
}


public class Test53 {

	public static void main(String[] args) {
	
		Dog2 d = new Dog2();
		
		d.name = "Sarang";
		d.color = "Brown";
		
		d.printDog2();
	
	}
}
