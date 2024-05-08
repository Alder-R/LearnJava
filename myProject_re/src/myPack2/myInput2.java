package myPack2;

import javax.swing.JOptionPane;

public class myInput2 {

	public static void main(String[] args) {
		// 도전과제
		// 입력대화창: PC 가격 입력, 할인율
		// 출력대화창: 할인이 된 PC 가격
		float pcPrice, discountRate;
		
		pcPrice = Float.parseFloat(JOptionPane.showInputDialog("PC 가격 입력:"));
		discountRate = Float.parseFloat(JOptionPane.showInputDialog("할인율(%) 입력:"));
		
		float discountedPrices = pcPrice - pcPrice * discountRate/100;
		JOptionPane.showMessageDialog(null, "할인이 된 PC 가격: \n" + discountedPrices);
	}

}
