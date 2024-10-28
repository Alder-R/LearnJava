package myPack;

public class MyMath {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		System.out.println(Math.round(-4.4));
		System.out.println(Math.round(-4.5));
		System.out.println(Math.round(-4.6));
		
		System.out.println(Math.round(4.4));
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(4.6));
		
		System.out.println(Math.random());
		System.out.println(Math.random() * 100);
		System.out.println(Math.floor(Math.random() * 100));		// 0 ~ 99
		System.out.println(Math.floor(Math.random() * 100 + 1));	// 1 ~ 100
		System.out.println("-----");
		
		double r = 5;
		System.out.println("반지름이 " + r + "인 원의 면적: " + getArea(r));
	}
	// 원의 면적 계산기
	public static double getArea(double r) {
		return Math.round(Math.PI * (r * r) * 100000) / (double)100000;
	}
}
