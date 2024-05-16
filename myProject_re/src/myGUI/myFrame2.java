package myGUI;

import java.awt.*;

public class myFrame2 extends Frame {

	public myFrame2() {
		super("새 Frame2(Panel)");		// 타이틀 생성
		setSize(600, 80);
		// Panel 생성: Panel 클래스의 특징 - 혼자서 실행 불가, Frame 같은 컨테이너에 포함되어야 함
		Panel p = new Panel();			// Panel 생성
		p.setBackground(Color.yellow);	// Panel 색상 변경
		add(p);							// Panel을 Frame에 붙임 (필수)

		// 버튼 생성
		Button b1 = new Button();		// 비어 있는 버튼 객체 생성
		b1.setLabel("버튼1");				// b1에 Label 넣기
		Button b2 = new Button("종료");	// Label 있는 버튼 객체 생성
		p.add(b1);
		p.add(b2);

		// 체크박스 생성 (복수 선택 가능)
		Checkbox ck1 = new Checkbox();				// 체크박스 생성
		ck1.setLabel("사과");							// ck1에 Label 넣기
		Checkbox ck2 = new Checkbox("딸기", true);	// 선택된 체크박스 생성
		Checkbox ck3 = new Checkbox("바나나", false);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);

		// 라디오버튼 생성 (복수 선택 불가능, 그룹 중에서 하나만)
		CheckboxGroup g = new CheckboxGroup();		// 체크박스를 그룹으로 묶음
		Checkbox ra1 = new Checkbox("남성",g,true);	// 기본 선택됨
		Checkbox ra2 = new Checkbox("여성",false,g);
		p.add(ra1);
		p.add(ra2);

		// 라벨(레이블) 생성
		Label la1 = new Label("레이블1");
		Label la2 = new Label("레이블2", Label.CENTER);	// 가운데 정렬
		la1.setBackground(Color.red);
		la2.setBackground(Color.cyan);
		p.add(la1);
		p.add(la2);

		// 초이스 생성 (드롭 다운 리스트 형태)
		Choice ch = new Choice();
		ch.addItem("봄");
		ch.addItem("여름");
		ch.addItem("가을");
		ch.addItem("겨울");
		p.add(ch);
		// 반복문 활용하여 초이스 생성
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
		ff2.setBackground(Color.red);	// Panel색 Yellow에 가려짐
		ff2.setSize(400, 200);
		ff2.setLocation(600, 400);
		ff2.setTitle("ff2(Panel)");
	}

}
