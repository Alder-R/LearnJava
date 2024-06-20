package myFinalTest;

class RecClass {
	double area(int x) {		// 정사각형의 면적 구하기
		return x = x*x;
	}
	double round(int y) {		// 정사각형의 둘레 구하기
		return y = y*4;
	}
}

public class Test1 extends RecClass {

	public static void main(String[] args) {
		RecClass rc = new RecClass();
		System.out.println("정사각형의 면적은: " + rc.area(5));
		System.out.println("정사각형의 둘레는: " + rc.round(5));
	}

}
