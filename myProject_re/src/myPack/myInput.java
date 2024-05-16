package myPack;
import javax.swing.JOptionPane;
// 실행 단축키: ctrl + f11
public class myInput {

	public static void main(String[] args) {
		// 첫번째 입력한 숫자를 담는 변수
		int num1;

		// 두번째 입력한 숫자를 담는 변수
		int num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자 입력:"));
		System.out.println("첫번째 숫자: " + num1);
		num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자 입력:"));
		System.out.println("두번째 숫자: " + num2);

		System.out.print("합: ");
		System.out.println(num1 + num2);

		JOptionPane.showMessageDialog(null, num1 + num2);
	}

}
