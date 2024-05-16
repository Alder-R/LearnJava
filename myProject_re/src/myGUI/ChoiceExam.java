package myGUI;

import java.awt.*;

public class ChoiceExam extends Frame{

	public ChoiceExam() {
		super("Choice 테스트");			// 창 이름
		setSize(400, 300);				// 창 크기
		setLocation(1000, 250);			// 창 위치
		Panel p = new Panel();			// Panel 생성
		p.setBackground(Color.white);	// Panel 색상 변경

		// 계절 선택(봄, 여름, 가을, 겨울)
		Choice ch = new Choice();		// Choice 객체 생성
		// 항목 추가
		ch.addItem("봄");
		ch.addItem("여름");
		ch.addItem("가을");
		ch.addItem("겨울");
		p.add(ch);				// Panel에 Choice 붙이기
		add(p);					// 프레임에 Panel 붙이기

		Label la1 = new Label("월", Label.RIGHT);
		p.add(la1);
		// 월 선택(1~12)
		Choice chMonth = new Choice();
		for (int i=1; i<=12; i++) {
			chMonth.addItem(Integer.toString(i));
		}
		p.add(chMonth);
		Label la2 = new Label("일", Label.RIGHT);
		p.add(la2);
		// 일 선택(1~31)
		Choice chDay = new Choice();
		for (int i=1; i<=31; i++) {
			chDay.addItem(Integer.toString(i));
		}
		p.add(chDay);

		// 요일 리스트
		List list1 = new List(5, true);		// 5개 항목 보여줌, 다중 선택 true
		list1.add("월");
		list1.add("화");
		list1.add("수");
		list1.add("목");
		list1.add("금");
		list1.add("토");
		list1.add("일");
		p.add(list1);

		// 텍스트 입력
		//  TODO 컴포넌트 위치 변경 필요
		TextField tf1 = new TextField("아이디",20);
		TextField tf2 = new TextField(20);
		tf1.selectAll();
		tf2.setEchoChar('*');
		Label la3 = new Label("ID", Label.RIGHT);
		p.add(la3);
		p.add(tf1);
		Label la4 = new Label("PW", Label.RIGHT);
		p.add(la4);
		p.add(tf2);

		setVisible(true);		// 창 보이게
	}

	public static void main(String[] args) {
		new ChoiceExam();
	}

}
