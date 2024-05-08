package myGUI;

import java.awt.*;

public class ChoiceExam extends Frame{

	public ChoiceExam() {
		super("Choice �׽�Ʈ");			// â �̸�
		setSize(400, 300);				// â ũ��
		setLocation(1000, 250);			// â ��ġ
		Panel p = new Panel();			// Panel ����
		p.setBackground(Color.white);	// Panel ���� ����
		
		// ���� ����(��, ����, ����, �ܿ�)
		Choice ch = new Choice();		// Choice ��ü ����
		// �׸� �߰�
		ch.addItem("��");
		ch.addItem("����");
		ch.addItem("����");
		ch.addItem("�ܿ�");
		p.add(ch);				// Panel�� Choice ���̱�
		add(p);					// �����ӿ� Panel ���̱�
		
		Label la1 = new Label("��", Label.RIGHT);
		p.add(la1);
		// �� ����(1~12)
		Choice chMonth = new Choice();
		for (int i=1; i<=12; i++) {
			chMonth.addItem(Integer.toString(i));
		}
		p.add(chMonth);
		Label la2 = new Label("��", Label.RIGHT);
		p.add(la2);
		// �� ����(1~31)
		Choice chDay = new Choice();
		for (int i=1; i<=31; i++) {
			chDay.addItem(Integer.toString(i));
		}
		p.add(chDay);
		
		// ���� ����Ʈ
		List list1 = new List(5, true);		// 5�� �׸� ������, ���� ���� true
		list1.add("��");
		list1.add("ȭ");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		p.add(list1);
		
		// �ؽ�Ʈ �Է�
		//  TODO ������Ʈ ��ġ ���� �ʿ�
		TextField tf1 = new TextField("���̵�",20);
		TextField tf2 = new TextField(20);
		tf1.selectAll();
		tf2.setEchoChar('*');
		Label la3 = new Label("ID", Label.RIGHT);
		p.add(la3);
		p.add(tf1);
		Label la4 = new Label("PW", Label.RIGHT);
		p.add(la4);
		p.add(tf2);

		setVisible(true);		// â ���̰�
	}
	
	public static void main(String[] args) {
		new ChoiceExam();
	}

}
