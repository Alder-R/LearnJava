package myObject;

class Car {
	String carName;
	String color = "검은색";
	int velocity;		// 속도
	void speedUp() {
		velocity += 5;
	}
	void speedDown() {
		velocity -= 5;
	}
	void infoPrint() {
		System.out.println("차량 이름: " + carName + 
				"\n차량 색상: " + color + 
				"\n현재 속력: " + velocity);
	}
}



class Truck extends Car {
	int ton;
	void load() {
		System.out.println("트럭에 짐을 실었다.");
	}
	void offload() {
		System.out.println("트럭에서 짐을 내렸다.");
	}
}



public class TruckMain {

	public static void main(String[] args) {
		Truck myTruck = new Truck();
		myTruck.carName = "프론티어";
		myTruck.ton = 3;
		System.out.println("나의 트럭은 " + myTruck.color + "이다.");
		System.out.println(myTruck.carName + "는 " + myTruck.ton + "톤을 실을 수 있다.");
		myTruck.load();
		myTruck.offload();
		myTruck.infoPrint();
	}

}
