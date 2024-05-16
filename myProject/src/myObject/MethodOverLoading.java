package myObject;

public class MethodOverLoading {

	public static void main(String[] args) {
		Add han = new Add();
		int x = han.sum(10, 25);
		System.out.println(x);						// 덧셈
		System.out.println(han.sum(50, 6));			// 문자열 연결
		System.out.println(han.sum("서울","특별시"));	// 문자열 연결

		System.out.println("----------------");
		Multiply dul = new Multiply();
		System.out.println(dul.sum(2, 3, 2));		// 곱셈
		System.out.println(dul.sum(2, 4));			// 거듭제곱
	}

}

class Add {
	int sum(int i1, int i2) {			// 덧셈
		return i1 + i2;
	}
	String sum(String s1, String s2) {	// 문자열 연결
		return s1 + s2;
	}
}

class Multiply {
	int sum(int i1, int i2, int i3) {	// 곱셈
		return i1 * i2 * i3;
	}
	double sum(int i1, int i2) {
		double i = Math.pow(i1, i2);	// 거듭제곱
		return i;
	}
}