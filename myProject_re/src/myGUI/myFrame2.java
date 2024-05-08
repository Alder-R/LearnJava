package myGUI;

import java.awt.*;

public class myFrame2 extends Frame {
	
	public myFrame2() {
		super("�� Frame2(Panel)");		// Ÿ��Ʋ ����
		setSize(600, 80);
		// Panel ����: Panel Ŭ������ Ư¡ - ȥ�ڼ� ���� �Ұ�, Frame ���� �����̳ʿ� ���ԵǾ�� ��
		Panel p = new Panel();			// Panel ����
		p.setBackground(Color.yellow);	// Panel ���� ����
		add(p);							// Panel�� Frame�� ���� (�ʼ�)
		
		// ��ư ����
		Button b1 = new Button();		// ��� �ִ� ��ư ��ü ����
		b1.setLabel("��ư1");				// b1�� Label �ֱ�
		Button b2 = new Button("����");	// Label �ִ� ��ư ��ü ����
		p.add(b1);
		p.add(b2);
		
		// üũ�ڽ� ���� (���� ���� ����)
		Checkbox ck1 = new Checkbox();				// üũ�ڽ� ����
		ck1.setLabel("���");							// ck1�� Label �ֱ�
		Checkbox ck2 = new Checkbox("����", true);	// ���õ� üũ�ڽ� ����
		Checkbox ck3 = new Checkbox("�ٳ���", false);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		// ������ư ���� (���� ���� �Ұ���, �׷� �߿��� �ϳ���)
		CheckboxGroup g = new CheckboxGroup();		// üũ�ڽ��� �׷����� ����
		Checkbox ra1 = new Checkbox("����",g,true);	// �⺻ ���õ�
		Checkbox ra2 = new Checkbox("����",false,g);
		p.add(ra1);
		p.add(ra2);
		
		// ��(���̺�) ����
		Label la1 = new Label("���̺�1");
		Label la2 = new Label("���̺�2", Label.CENTER);	// ��� ����
		la1.setBackground(Color.red);
		la2.setBackground(Color.cyan);
		p.add(la1);
		p.add(la2);
		
		// ���̽� ���� (��� �ٿ� ����Ʈ ����)
		Choice ch = new Choice();
		ch.addItem("��");
		ch.addItem("����");
		ch.addItem("����");
		ch.addItem("�ܿ�");
		p.add(ch);
		// �ݺ��� Ȱ���Ͽ� ���̽� ����
		Choice chDay = new Choice();
		for (int i=1; i<=31; i++) {
			chDay.addItem(Integer.toString(i));
		}
		p.add(chDay);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new myFrame2();
		new myFrame();
		
		myFrame2 ff2 = new myFrame2();
		ff2.setBackground(Color.red);	// Panel�� Yellow�� ������
		ff2.setSize(400, 200);
		ff2.setLocation(600, 400);
		ff2.setTitle("ff2(Panel)");
	}

}
