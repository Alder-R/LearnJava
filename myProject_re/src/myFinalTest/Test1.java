package myFinalTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 extends Frame implements ActionListener{

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	Panel pnl3 = new Panel();
	Label lbl = new Label("이름", Label.RIGHT);
	Label lb2 = new Label("결과", Label.RIGHT);
	TextField tf1 = new TextField(6);
	TextArea txta1 = new TextArea(10, 40);
	Button btn1 = new Button("찾기");
	Button btn2 = new Button("종료");
	
	public Test1() {
		super("테스트1");

		setSize(500, 300);
		setLocation(1000, 100);
		add(pnl1, BorderLayout.NORTH);
		add(pnl2, BorderLayout.CENTER);
		add(pnl3, BorderLayout.SOUTH);
		pnl1.add(lbl);
		pnl1.add(tf1);
		pnl1.add(btn1);
		pnl2.add(lb2);
		pnl2.add(txta1);
		pnl3.add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { txta1.setText(tf1.getText()+"\n"); }
		if (e.getSource() == btn2) { System.exit(0); }
	}

	public static void main(String[] args) {
		new Test1();
	}
}
