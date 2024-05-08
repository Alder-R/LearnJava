package myGUI;

import java.awt.*;

public class myFrame extends Frame {		// 상속 받음
	
	public myFrame() {			// 생성자
		super("새 Frame");		// 부모의 생성자 호출(타이틀 생성)
		setLocation(500, 200);	// 모니터 내 프레임 출력 위치 설정
		setSize(350, 100);		// 프레임 크기(가로, 세로)설정
		setVisible(true);		// 프레임을 보이게 한다
	}

	
	public static void main(String[] args) {
		myFrame f = new myFrame();			// 상속받은 클래스 호출
		f.setTitle("ㅁㄴㅇㄹ");
		
		myFrame ff = new myFrame();
		ff.setTitle("qwer");
		ff.setLocation(800, 400);
		
		myFrame fff = new myFrame();
		fff.setSize(500, 200);
		fff.setLocation(600, 600);
		fff.setBackground(Color.gray);
		
		myFrame ffff = new myFrame();
		ffff.setTitle("파란 창");
		ffff.setSize(250, 250);
		ffff.setLocation(0, 0);
		ffff.setBackground(Color.blue);
		
		 myFrame2 f2 = new myFrame2();
		 f2.setLocation(800, 500);
	}

}
