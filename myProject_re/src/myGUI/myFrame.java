package myGUI;

import java.awt.*;

public class myFrame extends Frame {		// ��� ����
	
	public myFrame() {			// ������
		super("�� Frame");		// �θ��� ������ ȣ��(Ÿ��Ʋ ����)
		setLocation(500, 200);	// ����� �� ������ ��� ��ġ ����
		setSize(350, 100);		// ������ ũ��(����, ����)����
		setVisible(true);		// �������� ���̰� �Ѵ�
	}

	
	public static void main(String[] args) {
		myFrame f = new myFrame();			// ��ӹ��� Ŭ���� ȣ��
		f.setTitle("��������");
		
		myFrame ff = new myFrame();
		ff.setTitle("qwer");
		ff.setLocation(800, 400);
		
		myFrame fff = new myFrame();
		fff.setSize(500, 200);
		fff.setLocation(600, 600);
		fff.setBackground(Color.gray);
		
		myFrame ffff = new myFrame();
		ffff.setTitle("�Ķ� â");
		ffff.setSize(250, 250);
		ffff.setLocation(0, 0);
		ffff.setBackground(Color.blue);
		
		 myFrame2 f2 = new myFrame2();
		 f2.setLocation(800, 500);
	}

}
