
package myMidTest;

public class Test1 {

	public static void main(String[] args) {
		int even = 0, odd = 0, multiple = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				even += i;
			}
			if (i % 2 == 1) {
				odd += i;
			}
			if (i % 5 == 0) {
				multiple += i;
			}
		}
		System.out.println("1���� 50������ ¦�� ��: " + even);
		System.out.println("1���� 50������ Ȧ�� ��: " + odd);
		System.out.println("1���� 50������ 5�� ��� ��: " + multiple);
	}

}
