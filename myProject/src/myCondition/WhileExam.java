package myCondition;

public class WhileExam {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int j = 1, sum = 0;
		while (sum < 100) {
			sum += j;
			j++;
			System.out.println("sum: " + sum);
		}

		// do ~ while문
		int k = 5;
		do {
			System.out.println(k);
			k++;
		} while (k > 10);

		// break문: 자바 프로그래밍 교재 47쪽
		// continue문: 자바 프로그래밍 교재 48쪽

		// 50쪽 종합문제 6번
		int n = 1;
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				System.out.print(n++ + "\t");
			}
			System.out.println();
		}
	}

}
