package myCondition;

public class ForExam {

	public static void main(String[] args) {
		
		// ���� 1-27 ����
		int evenSum = 0, oddSum = 0;
		for (int i=1; i<=20; i++)
			if (i%2==0) evenSum += i;
			else oddSum += i;
		System.out.println("1���� 20������ ¦�� ���� " + evenSum + "�̰�, " +
									 "Ȧ�� ���� " + oddSum + "�Դϴ�.");
		
		// ���� 1-29 ����
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) 
				System.out.print(i+"\t");	// tab
			System.out.print("\n");			// new line: �ٹٲ�(����)
		}
		
		// ���� 1-30
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) 
				System.out.print(j+"\t");	// tab
			System.out.print("\n");			// new line: �ٹٲ�(����)
		}
		
		System.out.println("----------------");
		// ��������1 (���� 1-31 ����)
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) 
				System.out.print("*\t");
			System.out.println();
		}
		
		System.out.println("----------------");
		// ��������2 (���� 1-32 ����)
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) 
				System.out.print("*\t");
			System.out.println();
		}
		
		System.out.println("----------------");
		// ��������3 (�� �� ����)
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
