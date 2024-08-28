package myPuzzle;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyPuzzle16 extends JFrame implements ActionListener {

	JButton[] btns;
	Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
	
	MyPuzzle16() {
		super("퍼즐 게임");
		setSize(300, 300);
		setLocation(res.width/2 - 150, res.height/2 - 150);		// 화면 중앙에 창 위치하기
		makeButtons();
		setVisible(true);
	}
	
	void makeButtons() {
		btns = new JButton[16];
		setLayout(new GridLayout(4, 4));
		
		for (int i = 0; i < btns.length; i++) {
			add(btns[i] = i == 15 ? new JButton("") : new JButton(String.valueOf(i+1)));
			btns[i].addActionListener(this);
		}

		btns[15].setEnabled(false);
	}
	
	int[] nb = new int[4];
	void findNeighbor(int id) {
		// 상
		nb[0] =	id - 4; 
		if( nb[0] < 0) { nb[0] = -1; }
		
		// 하
		nb[1] = id + 4; 
		if (nb[1] >= 16) { nb[1] = -1; }
			
		// 좌
		nb[2] = id - 1; 
		if 	(nb[2] % 4 == 3) { nb[2] = -1; }
		
		// 우
		nb[3] = id + 1; 
		if (nb[3] % 4 == 0) { nb[3] = -1; }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton act, inact;
		JButton b = (JButton)e.getSource();
		int id;
		for (id = 0; id < 16; id++) {
			if (b == btns[id]) { break; }
		}
		 
		findNeighbor(id);
	  
	    for (int i = 0; i < 4 ; i++) {
	    	if (nb[i] != -1 && !btns[nb[i]].isEnabled()) {
	    	    act = btns[id];
	    	    inact = btns[nb[i]];
	    	    inact.setText(act.getText());
	    	    act.setText("");
	    	    inact.setEnabled(true);
	            act.setEnabled(false);
	            break;
	            } 	 
	    	}
	    }

	public static void main(String[] args) {
		new MyPuzzle16();
	}
}
