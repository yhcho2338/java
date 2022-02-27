package pro13;


class NumberThread3 extends Thread {
	String name;
	
	NumberThread3(){}
	NumberThread3(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " - starting.");
		
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(300);
				System.out.println("in" + name + ":" + i);
			}
		
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + "terminating");
		
	}
	
	
}


public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starting.");
		Thread th = new Thread(new NumberThread3 ("Number Thread"));
		th.start();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("In main: " + i);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			
		}
		System.out.println("main ending.");
		
		
		
	}

}
