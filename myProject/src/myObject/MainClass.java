package myObject;

class Student1 {
	String name, hakbun, phone, juso, major;
	public Student1() {}
	public Student1(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	public void study() { System.out.println(this.name + "은(는) 공부하고 있다."); }
	public void eat() { System.out.println(this.name + "은(는) 식사하고 있다."); }
	public void test() { System.out.println(this.name + "은(는) 시험보고 있다."); }
	public void extra_act() { System.out.println(this.name + "은(는) 동아리 활동하고 있다."); }
}

class Leader extends Student1 {
	boolean isLeader = true;
	public Leader(String name, String hakbun, boolean isLeader) {
		this.name = name;
		this.hakbun = hakbun;
		this.isLeader = isLeader;
	}
	public void isLeader() { System.out.println(this.name + "은(는) 학급회장이다."); }
}

public class MainClass {
	public static void main(String[] args) {
		Leader hong = new Leader("홍길동", "30130", true);
		hong.isLeader();
		hong.study();
		
		Student1 kim = new Student1("김철수", "10305");
		kim.eat();
		
		Student1 Lee = new Student1("이영희", "10512");
		Lee.extra_act();
	}

}
