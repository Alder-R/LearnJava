package myObject;

abstract class Ship {
	abstract String ShipName();
	abstract int MaxSpeed();		// 최대 속도
	abstract int MaxPassenger();	// 최대 탑승 인원
	abstract int MaxLuggage();		// 최대 적재량
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
	String ShipName() {
		return shipName;
	}
	@Override
	int MaxSpeed() {
		return maxSpd;
	}
	@Override
	int MaxPassenger() {
		return maxPass;
	}
	@Override
	int MaxLuggage() {
		return maxLug;
	}
}
public class AbstractMain{

	public static void main(String[] args) {
		CargoShip EverGiven = new CargoShip("MV Ever Given", 23, 20, 199629);
		System.out.println(EverGiven.ShipName() + "의 최대 속도:   \t" + EverGiven.MaxSpeed() + "노트");
		System.out.println(EverGiven.ShipName() + "의 최대 탑승 인원:\t" + EverGiven.MaxPassenger() + "명");
		System.out.println(EverGiven.ShipName() + "의 최대 적재량:  \t" + EverGiven.MaxLuggage() + "톤");
	}

}
