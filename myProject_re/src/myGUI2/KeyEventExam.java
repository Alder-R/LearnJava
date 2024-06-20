package myGUI2;

import java.awt.*;
import java.awt.event.*;

/* 주민등록번호를 입력할 때, 앞자리에 6개 숫자가 적히면 다음 칸(TextField)으로 자동 커서 이동,
 * 앞자리 칸(TextField)에서 왼쪽 방향키 입력 시 결과
 */

public class KeyEventExam extends Frame implements KeyListener{
	
	TextField jumin1 = new TextField(6);
	TextField jumin2 = new TextField(10);
	Label lbl = new Label("-", Label.CENTER);
	Panel pnl = new Panel();
	
	public KeyEventExam() {
		super("주민번호 입력 KeyEvent");
		pnl.add(jumin1);
		pnl.add(lbl);
		pnl.add(jumin2);
		add(pnl);
		setSize(400, 200);
		setLocation(400, 200);
		setVisible(true);
		// 키보드 입력이 될 객체(jumin1)에 이벤트 핸들러(addKeyListener) 연결
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
	}
	
	// 아래 셋은 추상 메소드이므로, 사용하지 않아도 정의해야 함
	// 키가 눌렸다가 뗴어졌을 때 호출되는 메소드
	public void keyReleased(KeyEvent kyEv) {
		
	}
	
	// 키가 눌렸을 때 호출되는 메소드
	public void keyPressed(KeyEvent kyEv) {
		if (kyEv.getKeyCode() == KeyEvent.VK_LEFT) {
			jumin2.setText("앞자리 입력");
			if (jumin2.hasFocus() == true) {
				jumin1.requestFocus();
				jumin1.setText("");
			}
		}
	}
	
	// 문자가 입력되었을 떄 호출되는 메소드
	public void keyTyped(KeyEvent kyEv) {
		if (jumin1.getText().trim().length() == 5) {
			jumin2.requestFocus();		// 다음 칸으로 커서 이동
			jumin2.setText("");
		}
		
		if (jumin2.getText().trim().length() == 7) {
			KeyOver();
		}
	}
	
	public void KeyOver() {
		jumin1.requestFocus();
		jumin1.setText("");
		jumin2.setText("숫자 입력 초과");
	}
	
	
	public static void main(String[] args) {
		new KeyEventExam();
	}

}
