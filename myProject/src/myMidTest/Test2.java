
package myMidTest;

public class Test2 {

	public static void main(String[] args) {
		int a = 3, b = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("* ");
			}
			a--;
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("* ");
			}
			b++;
			System.out.println();
		}
	}

}
