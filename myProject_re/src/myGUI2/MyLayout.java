package myGUI2;

import java.awt.*;

public class MyLayout extends Frame{
	
	public MyLayout() {		// ������
		super("������ ����");
		Panel p = new Panel();
		Checkbox cb1 = new Checkbox("��");
		Checkbox cb2 = new Checkbox("����");
		Checkbox cb3 = new Checkbox("����");
		Checkbox cb4 = new Checkbox("�ܿ�", true);
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

	public static void main(String[] args) {		// �⺻ �޼ҵ�
		new MyLayout();
	}

}
