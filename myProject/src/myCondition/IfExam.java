package myCondition;

public class IfExam {

	public static void main(String[] args) {
		
		// Ȧ�� ¦�� Ȯ��
		int a = 15;
		if (a%2==0)	System.out.println(a + "��(��) ¦��");
		else 		System.out.println(a + "��(��) Ȧ��");
		
		// 5�� ��� Ȯ��
		int b = 27;
		if (b%5==0)	System.out.println(b + "��(��) 5�� ����̴�");
		else 		System.out.println(b + "��(��) 5�� ����� �ƴϴ�");
		
		// n�� ��� Ȯ��
		int c = 12, d = 3;
		if (c%d==0)	System.out.println(c+"��(��) "+d+"�� ����̴�");
		else		System.out.println(c+"��(��) "+d+"�� ����� �ƴϴ�");
		
	}
}
