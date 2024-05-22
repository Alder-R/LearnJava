package myTest1;

import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame implements ActionListener{
	
	Button btnComplete = new Button();
	
	public Test1() {
		super("친구정보");
		setLocation(600, 400);
		setSize(360, 270);
		setVisible(true);
		setLayout(new BorderLayout());
		
		Panel pnl1 = new Panel();
		Panel pnl2 = new Panel();
		pnl2.setBackground(new Color(200,200,200));
		Panel pnl3 = new Panel();
		
		add(pnl1, BorderLayout.NORTH);
		add(pnl2, BorderLayout.CENTER);
		add(pnl3, BorderLayout.SOUTH);
		
		Label lblSpace1 = new Label("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　");
		Label lblSpace2 = new Label("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　");
		Label lblName = new Label("이  름");
		Label lblBirth = new Label("생  일:");
		Label lblMonth = new Label("월");
		Label lblDay = new Label("일");
		Label lblPhoneNum = new Label("전화번호:");
		Label lblGroup = new Label("그  룹:");
		
		Button btnSearch = new Button();
		btnSearch.setLabel("검색");
		Button btnSave = new Button();
		btnSave.setLabel("저장");
		Button btnDelete = new Button();
		btnDelete.setLabel("삭제");
		Button btnModify = new Button();
		btnModify.setLabel("수정");

		btnComplete.setLabel("완료");
		btnComplete.addActionListener(this);
		
		Choice choMonth = new Choice();
		for(int i=1; i<=12; i++) choMonth.addItem(Integer.toString(i));
		Choice choDay = new Choice();
		for(int i=1; i<=31; i++) choDay.addItem(Integer.toString(i));
		
		CheckboxGroup radSL = new CheckboxGroup();
		Checkbox chkSolar = new Checkbox("양력",radSL,true);
		Checkbox chkLunar = new Checkbox("음력",radSL,false);
		
		Checkbox chkSchool = new Checkbox("학교", false);
		Checkbox chkAcademy = new Checkbox("학원", false);
		Checkbox chkTown = new Checkbox("동네", false);
		Checkbox chkEtc = new Checkbox("기타", false);
		
		TextField txtfName = new TextField(10);
		txtfName.selectAll();
		TextField txfePhoneNum = new TextField(30);
		
		pnl1.add(lblName);
		pnl1.add(txtfName);
		pnl1.add(btnSearch);
		
		pnl2.add(lblBirth);
		pnl2.add(choMonth);
		pnl2.add(lblMonth);
		pnl2.add(choDay);
		pnl2.add(lblDay);
		pnl2.add(chkSolar);
		pnl2.add(chkLunar);
		pnl2.add(lblSpace1);
		pnl2.add(lblPhoneNum);
		pnl2.add(txfePhoneNum);
		pnl2.add(lblSpace2);
		pnl2.add(lblGroup);
		pnl2.add(chkSchool);
		pnl2.add(chkAcademy);
		pnl2.add(chkTown);
		pnl2.add(chkEtc);
		
		pnl3.add(btnSave);
		pnl3.add(btnDelete);
		pnl3.add(btnModify);
		pnl3.add(btnComplete);
	}
	

	@Override
	public void actionPerformed(ActionEvent atev) {
		if(atev.getSource()== btnComplete) System.exit(0);
	}

	public static void main(String[] args) {
		new Test1();
	}
}
