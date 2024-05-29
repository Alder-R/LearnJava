package myGUI2;

import java.awt.*;
import java.awt.event.*;

public class ActionEventExam extends Frame implements ActionListener, TextListener{
	
	Panel pnl1 = new Panel();
	Button btn1 = new Button("버튼1");
	Button btn2 = new Button("버튼2");
	TextField txtfName = new TextField(10);
	
	public ActionEventExam() {
		super("ActionEventExam창 이름");
		add(pnl1);
		pnl1.add(btn1);
		pnl1.add(btn2);
		pnl1.add(txtfName);
		setSize(400, 200);
		setLocation(600, 300);
		setVisible(true);
		
		// 이벤트 발생 객체(btn1, 2)에 이벤트 핸들러(addActionListener) 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txtfName.addTextListener(this);
	}
	
	
	// actionPerformed 메소드에 이벤트 기능 구현
	// @Override
	public void actionPerformed(ActionEvent atev) {
		// 창 닫기 기능
		if (atev.getSource() == btn1 || atev.getSource() == btn2) System.exit(0);
	}
	
	// @Override
	public void textValueChanged(TextEvent txtev) {
		if (txtev.getSource() == txtfName) System.exit(0);
	}

	public static void main(String[] args) {
		new ActionEventExam();
	}



}
