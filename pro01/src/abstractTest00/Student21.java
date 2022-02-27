package abstractTest00;

public class Student21 extends Person21 {
	
	private int year;
	public Student21(int id, String name, int year) {
		super(id, name);
		this.year = year; 
		
	}

	public void show() {
		System.out.println("id: " + getId());
		System.out.println("name: " + getName());
		System.out.println("year: " + year);
	}

	
	
	public static void main(String[] args) {
		
	}

}
