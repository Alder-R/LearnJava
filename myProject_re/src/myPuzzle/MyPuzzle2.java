package myPuzzle;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.Oneway;
import javax.swing.JButton;
import javax.swing.JFrame;;

public class MyPuzzle2 extends JFrame implements ActionListener {
	
	JButton b1 = new JButton("1");
	JButton bEmpty = new JButton("");

	MyPuzzle2() {
		super("퍼즐2 게임");
		setLocation(500, 500);
		setSize(500, 200);
		setLayout(new GridLayout(1, 2));
		
		bEmpty.setEnabled(false);
		add(b1);
		add(bEmpty);
		
		b1.addActionListener(this);
		bEmpty.addActionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton active, inactive;
		if (b1.isEnabled()) {
			active = b1;
			inactive = bEmpty;
		} 
		else {
			inactive = b1;
			active = bEmpty;
		}
		inactive.setEnabled(true);
		inactive.setText(active.getText());
		active.setEnabled(false);
		active.setText("");
	}

	public static void main(String[] args) {
		new MyPuzzle2();
	}
}
