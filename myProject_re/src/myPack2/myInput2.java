package myPack2;

import javax.swing.JOptionPane;

public class myInput2 {

	public static void main(String[] args) {
		// ��������
		// �Է´�ȭâ: PC ���� �Է�, ������
		// ��´�ȭâ: ������ �� PC ����
		float pcPrice, discountRate;
		
		pcPrice = Float.parseFloat(JOptionPane.showInputDialog("PC ���� �Է�:"));
		discountRate = Float.parseFloat(JOptionPane.showInputDialog("������(%) �Է�:"));
		
		float discountedPrices = pcPrice - pcPrice * discountRate/100;
		JOptionPane.showMessageDialog(null, "������ �� PC ����: \n" + discountedPrices);
	}

}
