package myCondition;

public class ForExam {

	public static void main(String[] args) {
		
		// 예제 1-27 변형
		int evenSum = 0, oddSum = 0;
		for (int i=1; i<=20; i++)
			if (i%2==0) evenSum += i;
			else oddSum += i;
		System.out.println("1부터 20까지의 짝수 합은 " + evenSum + "이고, " +
									 "홀수 합은 " + oddSum + "입니다.");
		
		// 예제 1-29 변형
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) 
				System.out.print(i+"\t");	// tab
			System.out.print("\n");			// new line: 줄바꿈(개행)
		}
		
		// 예제 1-30
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) 
				System.out.print(j+"\t");	// tab
			System.out.print("\n");			// new line: 줄바꿈(개행)
		}
		
		System.out.println("----------------");
		// 도전과제1 (예제 1-31 참조)
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) 
				System.out.print("*\t");
			System.out.println();
		}
		
		System.out.println("----------------");
		// 도전과제2 (예제 1-32 참조)
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) 
				System.out.print("*\t");
			System.out.println();
		}
		
		System.out.println("----------------");
		// 도전과제3 (위 둘 참조)
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) 
				System.out.print("*\t");
			System.out.println();
		}
		for (int i=3; i>=1; i--) {
			for (int j=1; j<=i; j++) 
				System.out.print("*\t");
			System.out.println();
		}
		
		
	}

}
