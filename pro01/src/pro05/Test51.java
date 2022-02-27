package pro05;


class Dog {
	String name;
	int age;	
}

class Cat {
	String name;
	int age; 
	
}

 public class Test51 {	

	
	public static void main(String[] args) {
	 
		Dog happy = new Dog();
		Dog bella = new Dog();
		happy.name = "Happy";
		happy.age = 3;
		bella.name = "Bella";
		bella.age = 2;
		
		System.out.println("나는 강아지 두 마리를 키웁니다.");
		System.out.println("한마리의 이름은 " + happy.name + "이고, " + happy.age + "살 입니다.");
	    System.out.println("다른 한마리의 이름은 " + bella.name + "이고," + bella.age + "살 입니다.");
	    System.out.println(happy);
	    System.out.println(bella);
	    
	    
	    System.out.println();
	    System.out.println();
	    
	
	    Dog sarang = new Dog();
		Cat sansung = new Cat();
		sarang.name = "Sarang";
		sarang.age = 2;
		sansung.name = "Sansung";
		sansung.age = 2;
		
		System.out.println("나는 강아지와 고양이를 키웁니다.");
		System.out.println("강아지의 이름은 " + sarang.name + "이고, " + sarang.age + "살 입니다.");
	    System.out.println("고양이의 이름은 " + sansung.name + "이고, " + sansung.age + "살 입니다.");
	    System.out.println(sarang);
	    System.out.println(sansung);
	    
	    
	    ///////////////////////////////////////////////////////
	    
	    Car myCar2 = new Car();
	     myCar2.kind = "Sonata1";
	     myCar2.color = "Red";
	     myCar2.year = 1990;
	     		
	     
	    Car myCar3; 
	     myCar3 = myCar2;
	    
	    System.out.println(myCar2);
	    System.out.println(myCar3);
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    
	    
	}

}
