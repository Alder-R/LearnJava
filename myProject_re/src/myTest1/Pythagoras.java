package myTest1;

public class Pythagoras {

	public static void main(String[] args) {
		double a = 3;		// 밑변
		double b = 4;		// 높이
		System.out.println("밑변 = "+a+
						"\n높이 = "+b+
						"\n빗변  = " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
	}

}
