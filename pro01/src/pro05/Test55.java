package pro05;

class Student {
	int no;
	String name;
	double score;
	
	Student(int m, String n, double b) {
	no = m;
	name = n;
	score = b;
		
	}
	

	void printStudent( ) {
		
	System.out.println("no: " + ", name: " + name + " , score: " + score);
	}
	
	
}


public class Test55 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "∂ ¿Ã", 5.5);
		Student s2 = new Student(2, "√∂¿Ã", 10.5);
		

		s1.printStudent();
		s2.printStudent();
	}

}
