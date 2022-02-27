package pro05;

class Point2 {

private int x;
private int y;

Point2 (){}
Point2 (int x, int y) {
	this.x = x;
	this.y = y;
}
int getX() {
	return x;
}
int getY() {
    return y;	
}
	
void setX (int x) {
	this.x = x;
}

void setY (int y) {
	this.y = y;
}
}


public class Test66 {

	static void add(Point2 t1, Point2 t2) {
		
	Point2 pt = new Point2();
	pt.setX(t1.getX() + t2.getX());
	pt.setY(t1.getY() + t2.getY());
	System.out.println("p1 + p2: (" + pt.getX() + ","  + pt.getY() + ")");
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		Point2 p1 = new Point2(1, 5);
		Point2 p2 = new Point2(5, 8);
		
		System.out.println("p1: " + p1.getX() + p1.getY());
		System.out.println("p2: " + p2.getX() + p2.getY());
		add(p1, p2);
		

	}

}

