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
		
		System.out.println("���� ������ �� ������ Ű��ϴ�.");
		System.out.println("�Ѹ����� �̸��� " + happy.name + "�̰�, " + happy.age + "�� �Դϴ�.");
	    System.out.println("�ٸ� �Ѹ����� �̸��� " + bella.name + "�̰�," + bella.age + "�� �Դϴ�.");
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
		
		System.out.println("���� �������� ����̸� Ű��ϴ�.");
		System.out.println("�������� �̸��� " + sarang.name + "�̰�, " + sarang.age + "�� �Դϴ�.");
	    System.out.println("������� �̸��� " + sansung.name + "�̰�, " + sansung.age + "�� �Դϴ�.");
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
