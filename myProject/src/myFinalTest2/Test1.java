package myFinalTest2;

public class Test1 {
	public static void main(String[] args) {
		Truck myTruck = new Truck();
	}
}
class Car {
	Car() {
		System.out.println("Car 생성");
	}
}

class Truck extends Car {
	Truck() {
		System.out.println("Truck 생성");
	}
}