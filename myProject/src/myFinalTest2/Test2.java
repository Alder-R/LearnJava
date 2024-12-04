package myFinalTest2;

public class Test2 {

	public static void main(String[] args) {
		Test2 ts = new Test2();
		ts.school();
		ts.school("4");
		ts.school(7);
	}
	public void school() {
		System.out.print("1234");
	}
	public void school(int c) {
		System.out.print(++c);
	}
	public void school(String c) {
		System.out.print("문자");
	}
}
