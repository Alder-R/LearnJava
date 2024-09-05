package myObject;

class GrandGreeting {
	String name = "grand씨";
	public void sayHello() {
		System.out.println(" 좋은 아침입니다.");
	}
}

class Greeting extends GrandGreeting {
	public String name = "홍길동";
	public void sayHello() {
		System.out.println("씨 안녕하세요");
	}
	public void test2() {
		System.out.print(super.name);
		super.sayHello();
	}
}

public class EngHello extends Greeting {
	public String name = "Mr.Hong";
	public void sayHello() {
		System.out.println(name + " Nice to meet you");
	}
	public void test() {
		System.out.print(super.name);
		super.sayHello();
	}
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
		eng.test2();
	}
}