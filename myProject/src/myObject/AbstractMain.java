package myObject;

abstract class Ship {
	abstract String shipName();
	abstract int maxSpeed();		// 최대 속도
	abstract int maxPassenger();	// 최대 탑승 인원
	abstract int maxLuggage();		// 최대 적재량
}

class CargoShip extends Ship {		// 화물선
	String shipName;
	int maxSpd, maxPass, maxLug;
	public CargoShip(String shipName, int maxSpd, int maxPass, int maxLug) {
		this.shipName = shipName;
		this.maxSpd = maxSpd;
		this.maxPass = maxPass;
		this.maxLug = maxLug;
	}
	@Override
	String shipName() {
		return shipName;
	}
	@Override
	int maxSpeed() {
		return maxSpd;
	}
	@Override
	int maxPassenger() {
		return maxPass;
	}
	@Override
	int maxLuggage() {
		return maxLug;
	}
}
public class AbstractMain{

	public static void main(String[] args) {
		CargoShip EverGiven = new CargoShip("MV Ever Given", 23, 20, 199629);
		System.out.println(EverGiven.shipName() + "의 최대 속도:   \t" + EverGiven.maxSpeed() + "노트");
		System.out.println(EverGiven.shipName() + "의 최대 탑승 인원:\t" + EverGiven.maxPassenger() + "명");
		System.out.println(EverGiven.shipName() + "의 최대 적재량:  \t" + EverGiven.maxLuggage() + "톤");
	}

}
