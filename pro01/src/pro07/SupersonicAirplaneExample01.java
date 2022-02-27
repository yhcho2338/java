package pro07;

public class SupersonicAirplaneExample01 {

	public static void main(String[] args) {
		SupersonicAirplane01 sa = new SupersonicAirplane01();
		sa.takeOff();
		sa.fly();
		sa.flymode = SupersonicAirplane01.SUPERSONIC;
		sa.fly();
		sa.flymode = SupersonicAirplane01.NORMAL;
		sa.fly();
		sa.land();

	}

}
