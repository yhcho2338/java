package pro13;

class NumberThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.print(i);
		}
	}
}



public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread (new NumberThread2()); // 오버라이딩
		t.start();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			
		System.out.print(ch);
		}

	}

}
