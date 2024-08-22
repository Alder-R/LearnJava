package myObject;

abstract class ShapeExam {
	public abstract double getArea();		// 면적
	public abstract double getCircum();		// 둘레
}

public class Circle extends ShapeExam {
	double radius = 10;		// 원의 반지름
	@Override
	public double getArea() {		// 원의 면적
		return Math.PI * radius * radius;
	}

	@Override
	public double getCircum() {		// 원의 둘레
		return Math.PI * 2 * radius;
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("원의 반지름: " + c.radius);
		System.out.println("원의 면적: " + c.getArea());
		System.out.println("원의 둘레: " + c.getCircum());
	}

}
