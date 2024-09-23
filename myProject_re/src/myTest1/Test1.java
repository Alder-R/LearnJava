package myTest1;

import java.awt.*;
import java.awt.event.*;

// 한글 사용시 VM Arguments에 "-Dfile.encoding=MS949" 입력

public class Test1 extends Frame implements ActionListener{
	
	Button btnSave = new Button();
	Button btnComplete = new Button();
	TextArea txtaInfo = new TextArea(2, 46);
	
	Choice choMonth = new Choice();
	Choice choDay = new Choice();
	
	CheckboxGroup radSL = new CheckboxGroup();
	Checkbox chkSolar = new Checkbox("양력",radSL,true);
	Checkbox chkLunar = new Checkbox("음력",radSL,false);
	String strSL = "양력";
	
	Checkbox chkSchool = new Checkbox("학교", false);
	Checkbox chkAcademy = new Checkbox("학원", false);
	Checkbox chkTown = new Checkbox("동네", false);
	Checkbox chkEtc = new Checkbox("기타", false);
	String strSchool, strAcademy, strTown, strEtc;
	
	TextField txtfName = new TextField(10);
	TextField txfePhoneNum = new TextField(28);
	
	public Test1() {
		super("친구정보");
		setLocation(600, 400);
		setSize(360, 250);
		setVisible(true);
		setLayout(new BorderLayout());
		
		Panel pnl1 = new Panel();
		Panel pnl2 = new Panel();
		pnl2.setBackground(new Color(200,200,200));
		Panel pnl3 = new Panel();
		
		add(pnl1, BorderLayout.NORTH);
		add(pnl2, BorderLayout.CENTER);
		add(pnl3, BorderLayout.SOUTH);
		
		Label lblName = new Label("이  름");
		Label lblBirth = new Label("생  일:");
		Label lblMonth = new Label("월");
		Label lblDay = new Label("일");
		Label lblPhoneNum = new Label("전화번호:");
		Label lblGroup = new Label("그  룹:");
		
		Button btnSearch = new Button();
		btnSearch.setLabel("검색");
		Button btnDelete = new Button();
		btnDelete.setLabel("삭제");
		Button btnModify = new Button();
		btnModify.setLabel("수정");

		btnSave.setLabel("저장");
		btnSave.addActionListener(this);
		btnComplete.setLabel("종료");
		btnComplete.addActionListener(this);
		
		for(int i=1; i<=12; i++) choMonth.addItem(Integer.toString(i));
		for(int i=1; i<=31; i++) choDay.addItem(Integer.toString(i));
		
		txtfName.selectAll();
		
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
		pnl2.add(lblPhoneNum);
		pnl2.add(txfePhoneNum);
		pnl2.add(lblGroup);
		pnl2.add(chkSchool);
		pnl2.add(chkAcademy);
		pnl2.add(chkTown);
		pnl2.add(chkEtc);
		pnl2.add(txtaInfo, BorderLayout.SOUTH);
		
		pnl3.add(btnSave);
		pnl3.add(btnDelete);
		pnl3.add(btnModify);
		pnl3.add(btnComplete);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnComplete) { System.exit(0); }
		if(e.getSource()== btnSave) { 
			if (chkSolar.isEnabled()) { strSL = " 양력"; } else strSL = " 음력";
			if (chkSchool.getState()) { strSchool = "학교  "; } else strSchool = "";
			if (chkAcademy.getState()) { strAcademy = "학원  "; } else strAcademy = "";
			if (chkTown.getState()) { strTown = "동네  "; } else strTown = "";
			if (chkEtc.getState()) { strEtc = "기타  "; } else strEtc = "";
			
			txtaInfo.setText(" 이름: "+txtfName.getText()+
					" / 생일: "+choMonth.getSelectedItem()+"월 "+choDay.getSelectedItem()+"일"+strSL+
					" /\n 전화: "+txfePhoneNum.getText()+
					" / 그룹: "+strSchool+strAcademy+strTown+strEtc); 
			};
	}

	public static void main(String[] args) {
		new Test1();
	}
}
