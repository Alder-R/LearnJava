package myCondition;

public class IfExam3 {

	public static void main(String[] args) {

		// 명령행 매개변수 출력
		int a = args.length;
		int limit = 6;
		if (a==0)	System.out.println("명령행 매개변수를 입력하세요");
		else if (a<limit) {
			System.out.printf("입력된 명령행 매개변수는 \t");
			for (int i=0; i<a; i++) {
				System.out.printf(args[i]);
				if (i+1 != a) {
					System.out.printf(",\t");
				}
			}
			System.out.println("\t 입니다.");
		}
		else System.out.println("명령행 매개변수는 " + limit + "개까지만 입력 가능합니다.");

	}

}
