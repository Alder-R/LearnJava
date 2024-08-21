class ClassA {
	int a = 1, b = 1;
}

class ClassB extends ClassA {
	void testcase() {
		System.out.println(this.a + this.b);
	}
	void testcase(int i) {
		System.out.println(this.a - this.b);
	}
	void testcase(char i) {
		System.out.println(this.a * this.b);
	}
	void testcase(float i) {
		System.out.println(this.a / this.b);
	}
}

public class Temp {

	public static void main(String[] args) {
		int a = 10, b = 3;
		
		ClassB c = new ClassB();
		c.testcase(a/b);
	}

}
