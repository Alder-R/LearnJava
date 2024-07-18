package myPuzzle;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.Oneway;
import javax.swing.JButton;
import javax.swing.JFrame;;

public class MyPuzzle16 extends JFrame implements ActionListener {

	JButton[] btns = new JButton[16];
	JButton inactive = btns[0];
	
	MyPuzzle16() {
		super("퍼즐 게임");
		setLocation(1000, 100);
		setSize(600, 600);
		makeButtons();
		setVisible(true);
	}
	
	void makeButtons() {
		setLayout(new GridLayout(4, 4));
		
		for (int i = 0; i < btns.length; i++) {
			add(btns[i] = i == 0 ? new JButton("") : new JButton(String.valueOf(i)));
		}
		btns[0].setEnabled(false);
	}
	
	void findNeighbor(int id) {
		if (btns[getX()] - 1 == isEnabled()) {}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int id = 0;
		findNeighbor(id);
	}

	public static void main(String[] args) {
		new MyPuzzle16();
	}
}
