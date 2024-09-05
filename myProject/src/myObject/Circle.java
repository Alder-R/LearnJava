package myObject;

abstract class ShapeExam {
	abstract double getArea();		// 면적
	abstract double getCircum();		// 둘레
}

public class Circle {
	public static void main(String[] args) {
		Circle2 c = new Circle2(10);
		System.out.println("원의 반지름: " + c.radius);
		System.out.println("원의 면적: " + c.getArea());
		System.out.println("원의 둘레: " + c.getCircum());
		
		System.out.println();
		
		Square r = new Square(5);
		System.out.println("정사각형의 한 변: " + r.edge);
		System.out.println("정사각형의 면적: " + r.getArea());
		System.out.println("정사각형의 둘레: " + r.getCircum());
	}

}

class Circle2 extends ShapeExam {
	double radius;		// 원의 반지름
	public Circle2(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {		// 원의 면적
		return Math.PI * radius * radius;
	}
	@Override
	public double getCircum() {		// 원의 둘레
		return Math.PI * 2 * radius;
	}
}

class Square extends ShapeExam {
	double edge;		// 정사각형의 한 변
	public Square(double edge) {
		this.edge = edge;
	}
	@Override
	public double getArea() {		// 정사각형의 면적
		return edge * edge;
	}
	@Override
	public double getCircum() {		// 정사각형의 둘레
		return edge * 4;
	}
}