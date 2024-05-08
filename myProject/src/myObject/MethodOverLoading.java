package myObject;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		Add han = new Add();
		int x = han.sum(10, 25);
		System.out.println(x);						// µ¡¼À
		System.out.println(han.sum(50, 6));			// ¹®ÀÚ¿­ ¿¬°á
		System.out.println(han.sum("¼­¿ï","Æ¯º°½Ã"));	// ¹®ÀÚ¿­ ¿¬°á
		
		System.out.println("----------------");
		Multiply dul = new Multiply();
		System.out.println(dul.sum(2, 3, 2));		// °ö¼À
		System.out.println(dul.sum(2, 4));			// °ÅµìÁ¦°ö
	}
	
}

class Add {
	int sum(int i1, int i2) {			// µ¡¼À
		return i1 + i2;
	}
	String sum(String s1, String s2) {	// ¹®ÀÚ¿­ ¿¬°á
		return s1 + s2;
	}
}

class Multiply {
	int sum(int i1, int i2, int i3) {	// °ö¼À
		return i1 * i2 * i3;
	}
	double sum(int i1, int i2) {
		double i = Math.pow(i1, i2);	// °ÅµìÁ¦°ö
		return i;
	}
}