package myPack;
import javax.swing.JOptionPane;
// ���� ����Ű: ctrl + f11
public class myInput {

	public static void main(String[] args) {
		// ù��° �Է��� ���ڸ� ��� ����
		int num1;
		
		// �ι�° �Է��� ���ڸ� ��� ����
		int num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("ù��° ���� �Է�:"));
		System.out.println("ù��° ����: " + num1);
		num2 = Integer.parseInt(JOptionPane.showInputDialog("�ι�° ���� �Է�:"));
		System.out.println("�ι�° ����: " + num2);
		
		System.out.print("��: ");
		System.out.println(num1 + num2);
		
		JOptionPane.showMessageDialog(null, num1 + num2);
	}

}
