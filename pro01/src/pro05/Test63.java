package pro05;

class Data {
	private int x;
	public int y;
	int z;
	
	Data(){}
	Data (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	int getX() {
		return x;
	}
	
	void setX(int x) {
		this.x = x;
	}
	
	
	void printData() {
		System.out.println("x는 " + x + ", y는 " + y + ", z는 " + z);
	}
}


public class Test63 {

	public static void main(String[] args) {
		
		Data data = new Data(10, 20, 30);
		//data.setX(10);
		//data.y = 20;
		//data.z = 30;
		
		data.printData();
		data.setX(20);
		System.out.println("변경된 x값은: " + data.getX());

	}

}
