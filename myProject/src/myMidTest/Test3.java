
package myMidTest;

public class Test3 {
	String name;
	String hakbun;

	void startStudy() {
		System.out.println("시험공부를 합니다.");
	}
	void startEat() {
		System.out.println("식사를 합니다.");
	}

	public static void main(String[] args) {
		Test3 jin = new Test3();
		jin.name = "진ㅇㅇ";
		jin.hakbun = "10101";
		jin.startStudy();
		jin.startEat();
	}

}
