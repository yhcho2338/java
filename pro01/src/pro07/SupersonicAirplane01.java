package pro07;

//import pro00.Airplane01; // 방법 01 - import를 가장 많이 씀

public class SupersonicAirplane01 
                            extends pro00.Airplane01 { // 방법 02
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속비행모드.");
		}else {
			super.fly();
		}
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
