package pro00;
 
// 자료형 클래스 예제 01

class Point5 {

private int x;
private int y;

Point5 (){}
Point5 (int x, int y) {
this.x = x;
this.y = y;
}

int getX() {
	return x;
}

int getY() {
	return y;
}

void setX(int x) {
	this.x = x;
		
}

void setY(int y) {
	this.y = y;
}
	
	
}



public class Exercise01 {

	static void add (Point5 t1, Point5 t2) {
		Point5 pt = new Point5();
		pt.setX(t1.getX() + t2.getX());
		pt.setY(t1.getY() + t2.getY());
		System.out.println("p1 + p2: " + pt.getX() + "," + pt.getY());
		
	}
	
	
	public static void main(String[] args) {
	 Point5 p1 = new Point5(5, 3);
	 Point5 p2 = new Point5(3, 4);
	 
	 System.out.println("P1: " + p1.getX() + "," + p1.getY());
	 System.out.println("P2: " + p2.getX() + "," + p2.getY());
	 add(p1, p2);

	}

}
