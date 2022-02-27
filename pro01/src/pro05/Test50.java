package pro05;

public class Test50 {

public static void main(String[] args) {
	
	Car myCar = new Car();
    myCar.kind = "Sonata";
    myCar.color = "black";
    myCar.year = 2015;
    
    Car yourCar = new Car();
    yourCar.kind = "Pride";
    yourCar.color = "White";
    yourCar.year = 1990;
    
    myCar.run();
    yourCar.run();
    
    myCar.speedUp();
    yourCar.speedUp();
		
	}

}

// 복습 필요


