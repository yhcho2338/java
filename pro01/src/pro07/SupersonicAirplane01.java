package pro07;

//import pro00.Airplane01; // ��� 01 - import�� ���� ���� ��

public class SupersonicAirplane01 
                            extends pro00.Airplane01 { // ��� 02
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("�����Ӻ�����.");
		}else {
			super.fly();
		}
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
