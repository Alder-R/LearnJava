package myCondition;

public class IfExam {

	public static void main(String[] args) {

		// 홀수 짝수 확인
		int a = 15;
		if (a%2==0)	System.out.println(a + "은(는) 짝수");
		else 		System.out.println(a + "은(는) 홀수");

		// 5의 배수 확인
		int b = 27;
		if (b%5==0)	System.out.println(b + "은(는) 5의 배수이다");
		else 		System.out.println(b + "은(는) 5의 배수가 아니다");

		// n의 배수 확인
		int c = 12, d = 3;
		if (c%d==0)	System.out.println(c+"은(는) "+d+"의 배수이다");
		else		System.out.println(c+"은(는) "+d+"의 배수가 아니다");

	}
}
