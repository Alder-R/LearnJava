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
	Checkbox chk5 = new Checkbox("오렌지", false);
	Button btnClose = new Button("닫기");
	
	public ItemEventExam() {
		super("ItemEvent");
		pnl1.add(chk1);
		pnl1.add(chk2);
		pnl1.add(chk3);
		pnl1.add(chk4);
		pnl1.add(chk5);
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
		chk5.addItemListener(this);
		btnClose.addActionListener(this);
	}
	
	
	public void itemStateChanged(ItemEvent itmEv) {
		if (itmEv.getStateChange() == ItemEvent.SELECTED) 
			txta1.append("\n" + itmEv.getItem() + "이(가) 선택됨\n");
		else if (itmEv.getStateChange() == ItemEvent.DESELECTED) 
			txta1.append("\n" + itmEv.getItem() + "이(가) 취소됨\n");
	}
	
	
	public void actionPerformed(ActionEvent atEv) {
		if (atEv.getSource() == btnClose) System.exit(0);
	}
	
	
	public static void main(String[] args) {
		new ItemEventExam();
	}

}
