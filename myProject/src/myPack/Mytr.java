package myPack;

import java.util.Scanner;

public class Mytr {

	public static void main(String[] args) {
		double base, height, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 입력: ");
		base = sc.nextDouble();
		System.out.print("높이 입력: ");
		height = sc.nextDouble();
		area = base * height / 2;
		System.out.println("삼각형의 넓이: " + area);
	}

}
