package myGUI2;

import java.awt.*;
import java.awt.event.*;

public class ItemEventExam extends Frame implements ItemListener, ActionListener{

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	TextArea txta1 = new TextArea(7, 15);
	Checkbox chk1 = new Checkbox("키위", false);
	Checkbox chk2 = new Checkbox("사과", false);
	Checkbox chk3 = new Checkbox("딸기", false);
	Checkbox chk4 = new Checkbox("배", false);
	Button btnClose = new Button("닫기");
	
	public ItemEventExam() {
		super("ItemEvent");
		pnl1.add(chk1);
		pnl1.add(chk2);
		pnl1.add(chk3);
		pnl1.add(chk4);
		pnl2.add(btnClose);
		add(pnl1, BorderLayout.NORTH);
		add(txta1, BorderLayout.CENTER);
		add(pnl2, BorderLayout.SOUTH);
		setSize(300, 300);
		setLocation(900, 300);
		setVisible(true);
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		chk4.addItemListener(this);
		btnClose.addActionListener(this);
	}
	
	
	public void itemStateChanged(ItemEvent itmev) {
		if (itmev.getStateChange() == ItemEvent.SELECTED) 
			txta1.append(itmev.getItem() + "가 선택됨\n\n");
		else if (itmev.getStateChange() == ItemEvent.DESELECTED) 
			txta1.append(itmev.getItem() + "가 취소됨\n\n");		
	}
	
	
	public void actionPerformed(ActionEvent atev) {
		if (atev.getSource() == btnClose) System.exit(0);
	}
	
	
	public static void main(String[] args) {
		new ItemEventExam();
	}

}
