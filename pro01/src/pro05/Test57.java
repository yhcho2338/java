package pro05;

class Data2 {
	
	int value;
	static int count;
	
	
	//Data2 (int value, int count){
		
		
	//}
	
	
	void print() {
		System.out.println("value: " + value);
		System.out.println("count: " + count);
		
	}
	
	
}


// 복습 필요

public class Test57 {

	public static void main(String[] args) {
		
		Data2 d1 = new Data2();
		Data2 d2 = new Data2();
		
		//Data2.print(); 
		d1.print();
		d2.print();
		
		

	}

}
