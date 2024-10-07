package myMid2;

import java.awt.*;
import java.awt.event.*;

public class MyPack extends Frame implements ItemListener, ActionListener{

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	TextArea txta1 = new TextArea(7, 15);
	Choice cho = new Choice();
	CheckboxGroup grp = new CheckboxGroup();
	Checkbox chk1 = new Checkbox("봄", grp, false);
	Checkbox chk2 = new Checkbox("여름", grp, true);
	Checkbox chk3 = new Checkbox("가을", grp, false);
	Checkbox chk4 = new Checkbox("겨울", grp, false);
	Button btnClose = new Button("닫기");
	Button btnClear = new Button("초기화");
	
	public MyPack() {
		super("나의 ItemEvent");
		pnl1.add(cho);
		cho.addItem("대한민국");
		cho.addItem("영국");
		cho.addItem("미국");
		cho.addItem("프랑스");
		pnl1.add(chk1);
		pnl1.add(chk2);
		pnl1.add(chk3);
		pnl1.add(chk4);
		pnl2.add(btnClose);
		pnl2.add(btnClear);
		add(pnl1, BorderLayout.NORTH);
		add(txta1, BorderLayout.CENTER);
		add(pnl2, BorderLayout.SOUTH);
		setSize(300, 300);
		setLocation(900, 300);
		setVisible(true);
		
		cho.addItemListener(this);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		chk4.addItemListener(this);
		btnClose.addActionListener(this);
		btnClear.addActionListener(this);
	}
	
	
	public void itemStateChanged(ItemEvent itmEv) {
		if (itmEv.getStateChange() == ItemEvent.SELECTED) {
			txta1.append("\n" + itmEv.getItem() + "이(가) 선택됨\n");
		}
	}
	
	
	public void actionPerformed(ActionEvent atEv) {
		if (atEv.getSource() == btnClose) { System.exit(0); }
		if (atEv.getSource() == btnClear) { txta1.setText(""); }
	}


	public static void main(String[] args) {
		new MyPack();
	}

}
