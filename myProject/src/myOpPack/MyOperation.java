
package myOpPack;

public class MyOperation {
	
	public static void main(String[] args) {
		
		// 1. ��� ������		+ - * / %
		int a = 50; int b = 10;
		System.out.println("--- 1. ��� ������  ---");
		System.out.println(a/b);  // 5
		System.out.println(a%b);  // 0
		
		// 2. ����(��) ������	> >= < <= == !=
		System.out.println("--- 2. ����(��) ������  ---");
		System.out.println(a>b);		// true
		System.out.println(a==b);		// false
		System.out.println(!(a!=b));	// false
		
		// 3. �� ������		& && | || !
		System.out.println("--- 3. �� ������  ---");
		System.out.println((a>=b)&&(a!=b));		// true
		System.out.println((a>=b)&(a!=b));		// true
		System.out.println(!(a>=b)|(a!=b));		// true
		
		// 4. ����(����/����) ������	++ --
		// �������� ������ �����ϱ�
		int c = 15;
		System.out.println("--- 4. ����(����/����) ������  ---");
		int d = ++c +5;
		System.out.println(d);		// 21
		int e = c-- + 5;
		System.out.println(e);		// 21
		System.out.println(c);		// 15
		
		// 5. ��Ʈ ������		& | ^ ~ >> << >>>
		System.out.println("--- 5. ��Ʈ ������  ---");
		System.out.println("����(���α׷���(JAVA))33p");
		
		// 6. ���� ������		= += -= *= /= %=
		System.out.println("--- 6. ���� ������  ---");
		System.out.println("����(���α׷���(JAVA))34p");
		
		// 7. ����(����) ������ 	?:
		// ���� ? ó��1(������ ���϶�) : ó��2(������ �����϶�)
		System.out.println("--- 7. ���� ������ (���� ������) ---");
		int result = (5 != 4) ? 1 : 0;
		System.out.println(result);
		
	}

}
