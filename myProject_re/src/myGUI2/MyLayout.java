package myGUI2;

import java.awt.*;

public class MyLayout extends Frame{
	
	public MyLayout() {		// 생성자
		super("윈도우 제목");
		Panel p = new Panel();
		Checkbox cb1 = new Checkbox("봄");
		Checkbox cb2 = new Checkbox("여름");
		Checkbox cb3 = new Checkbox("가을");
		Checkbox cb4 = new Checkbox("겨울", true);
		TextArea ta = new TextArea(7,15);
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);

		add(p, BorderLayout.NORTH);
		add(ta);
		
		setSize(350, 300);
		setVisible(true);
	}

	public static void main(String[] args) {		// 기본 메소드
		new MyLayout();
	}

}
