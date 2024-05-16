
package myOpPack;

public class MyOperation {

	public static void main(String[] args) {

		// 1. 산술 연산자		+ - * / %
		int a = 50; int b = 10;
		System.out.println("--- 1. 산술 연산자  ---");
		System.out.println(a/b);  // 5
		System.out.println(a%b);  // 0

		// 2. 관계(비교) 연산자	> >= < <= == !=
		System.out.println("--- 2. 관계(비교) 연산자  ---");
		System.out.println(a>b);		// true
		System.out.println(a==b);		// false
		System.out.println(!(a!=b));	// false

		// 3. 논리 연산자		& && | || !
		System.out.println("--- 3. 논리 연산자  ---");
		System.out.println((a>=b)&&(a!=b));		// true
		System.out.println((a>=b)&(a!=b));		// true
		System.out.println(!(a>=b)|(a!=b));		// true

		// 4. 증감(증가/감소) 연산자	++ --
		// 전위형과 후위형 구별하기
		int c = 15;
		System.out.println("--- 4. 증감(증가/감소) 연산자  ---");
		int d = ++c +5;
		System.out.println(d);		// 21
		int e = c-- + 5;
		System.out.println(e);		// 21
		System.out.println(c);		// 15

		// 5. 비트 연산자		& | ^ ~ >> << >>>
		System.out.println("--- 5. 비트 연산자  ---");
		System.out.println("교재(프로그래밍(JAVA))33p");

		// 6. 대입 연산자		= += -= *= /= %=
		System.out.println("--- 6. 대입 연산자  ---");
		System.out.println("교재(프로그래밍(JAVA))34p");

		// 7. 조건(삼항) 연산자 	?:
		// 조건 ? 처리1(조건이 참일때) : 처리2(조건이 거짓일때)
		System.out.println("--- 7. 조건 연산자 (삼항 연산자) ---");
		int result = (5 != 4) ? 1 : 0;
		System.out.println(result);

	}

}
