package myCondition;

public class IfExam3 {

	public static void main(String[] args) {
		
		// ����� �Ű����� ���
		int a = args.length;
		int limit = 6;
		if (a==0)	System.out.println("����� �Ű������� �Է��ϼ���");
		else if (a<limit) {
			System.out.printf("�Էµ� ����� �Ű������� \t");
			for (int i=0; i<a; i++) {
				System.out.printf(args[i]);
				if (i+1 != a) {
					System.out.printf(",\t");
				}
			}
			System.out.println("\t �Դϴ�.");
		}
		else System.out.println("����� �Ű������� " + limit + "�������� �Է� �����մϴ�.");
		
	}

}
