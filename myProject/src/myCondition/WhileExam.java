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
		
		// do ~ while��
		int k = 5;
		do {
			System.out.println(k);
			k++;
		} while (k > 10);
		
		// break��: �ڹ� ���α׷��� ���� 47��
		// continue��: �ڹ� ���α׷��� ���� 48��
		
		// 50�� ���չ��� 6��
		int n = 1;
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				System.out.print(n++ + "\t");
			}
			System.out.println();
		}
	}

}
