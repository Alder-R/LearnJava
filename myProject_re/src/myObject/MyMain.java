package myObject;

class Airplane {
	String name;
	String color = "검정색";
	int velocity;
	
	void SpeedUp(int i) { 
		velocity += i; 
		System.out.println(name + " 속도 " + i + " 증가, 현재 속도 " + velocity);
		}
	void SpeedDown(int i) { 
		if (velocity >= i) {
			velocity -= i; 
		}
		else {
			velocity = 0;
		}
		System.out.println(name + " 속도 " + i + " 감소, 현재 속도 " + velocity);
	}
	void GetName() {
		System.out.println(name);
	}
	void GetColor() {
		System.out.println(color);
	}
}

class Heli extends Airplane {
	public Heli() {
		super.name = "헬기";
		super.color = "파란색";
	}

	
	boolean isHaveBlade = true, isRoterRotation = false;
	int height;
	void PlayRoter() {
		if (isHaveBlade && !isRoterRotation) {
			isRoterRotation = true;
			System.out.println("로터 회전 시작");
		}
		else if (isHaveBlade && isRoterRotation) {
			isRoterRotation = false;
			System.out.println("로터 회전 종료");
			height = 0;
			velocity = 0;
		}
		else {
			System.out.println("날개가 없음");
		}
	}
	void HeightUp(int i) { 
		if (isRoterRotation) { 
			height += i;
			System.out.println(name + " 고도 " + i + " 상승, 현재 고도 " + height);
			}
		else {
			System.out.println(name + " 로터 회전 중 아님, 고도 상승 불가");
		}
		}
	void HeightDown(int i) {
		if (height >= i) {
			height -= i; 	
		}
		else {
			velocity = 0;	
		}
		System.out.println(name + " 고도 " + i + " 하락, 현재 고도 " + height);
	}
	void SpeedDown(int i) { 		// 후진이 가능하도록 오버라이딩
		velocity -= i; 
		System.out.println(name + " 속도 " + i + " 감소, 현재 속도 " + velocity);
	}
}

class Airliner extends Airplane {
	public Airliner() {
		super.name = "여객기";
		super.color = "하얀색";
	}
	int maxPassenger;
	void SetPassenger(int i) { 
		maxPassenger = i; 
		System.out.println(name + " 최대 승객 " + maxPassenger + "으로 설정됨");
		}
	boolean isFly = false;
	void Fly() {
		if (!isFly) {
			System.out.println(name + " 이륙합니다.");
			isFly = true;
		}
		else {
			System.out.println(name + " 착륙합니다.");
			isFly = false;
			velocity = 0;
		}
	}
	void GetName() {		// 이름 출력 시 최대 승객도 함께 출력하도록 오버라이딩
		System.out.println(name + " 최대 승객 " + maxPassenger);
	}
}

public class MyMain {

	public static void main(String[] args) {
		Heli Helicopter = new Heli();
		Helicopter.GetName();
		Helicopter.GetColor();
		Helicopter.PlayRoter();
		Helicopter.HeightUp(2);
		Helicopter.HeightUp(4);
		Helicopter.SpeedUp(10);
		Helicopter.SpeedDown(5);
		Helicopter.SpeedDown(5);
		Helicopter.SpeedDown(5);
		Helicopter.HeightDown(4);
		Helicopter.HeightDown(2);
		Helicopter.HeightDown(2);
		Helicopter.PlayRoter();
		Helicopter.HeightUp(2);
		System.out.println();
		
		Airliner Al = new Airliner();
		Al.GetName();
		Al.SetPassenger(416);
		Al.GetName();
		Al.GetColor();
		Al.SpeedUp(2);
		Al.Fly();
		Al.SpeedUp(3);
		Al.SpeedUp(5);
		Al.SpeedUp(7);
		Al.SpeedDown(6);
		Al.SpeedDown(5);
		Al.SpeedDown(4);
		Al.Fly();
		Al.SpeedDown(3);
	}

}
