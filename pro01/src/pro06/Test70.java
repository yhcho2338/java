package pro06;

class Person2 {
	
	private String name;
	private String phone;
	
	Person2 () {}
	Person2 (String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	String getName() {return name;}
	String getPhone() {return phone;}
	
	void setName(String name) {this.name = name;}
	void setPhone(String phone) {this.phone = phone;}
	
	
	void printPerson2 () {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
	
}


class Student6 extends Person2 {
	
	private int score;
	Student6 (){}
	   Student6 (String name, String phone, int score) {
		   super(name, phone);
		   this.score = score;
		   
	   }
		
	void printStudent () {
		printPerson2();
		System.out.println("score: " + score);
	}
	
	
}



public class Test70 {

	public static void main(String[] args) {
		
		
		Student6 s = new Student6("A", "1234-1234", 90);
		s.printStudent();
		s.setName("B");
		s.setPhone("5678-5679");
		//System.out.println("name: " + s.getName());
		//System.out.println("phone: " + s.getPhone());
		System.out.println("-----------------");
		s.printStudent();
		
	
		
		

	}

}
