package abstractTest00;

public class Professor01 extends Person21 {
	
	private String department;
	public Professor01(int id, String name, String department) {
		super(id, name);
		this.department = department;
	}
	
	public void show() {
		System.out.println("id: " + getId());
		System.out.println("name: " + getName());
		System.out.println("department: " + department);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
