package pro06;


class Circle {
	final double PI = 3.141592;
	private double r;
	
	Circle(){}
	Circle(double r) {
		this.r = r;
	}
	
	double getR() {return r;}
	void setR(double r) {this.r = r;}
	
	
}



public class Test76 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(2.2);
		
		
		double c1Area = c1.PI * c1.getR() * c1.getR();
		double c2Area = c2.PI * c2.getR() * c2.getR();
	
		System.out.println("c1 area: " + c1Area);
		System.out.println("c2 area: " + c2Area);

		
		
	}

}
