package myClass;

class Student {
	// ������(������ �ڵ����� JVM���� �⺻ �����ڸ� ����, ���� ������ ��� ����)
	Student() {}		// �⺻ ������
	Student(int ban) {	// ������: �����ε�			// �Ű� ���� 1�� ���
		this.ban = ban;
	}
	Student(String name, int grade, int ban) {	// �Ű� ���� 3�� ���
		this.name = name;
		this.grade = grade;
		this.ban = ban;
	}
	
	// ��� ���� (���� Ư��)
	String name;		// �̸�
	int grade;			// �г�
	int ban;			// ��
	String phoneNum;	// ��ȭ��ȣ
	
	// �޼ҵ�
	void studentOutput() { System.out.println("�̸�: " + name + ", �г�: " + grade + ", ��: " + ban); }
	void study() { System.out.println("\t�����ϴ� ��"); }
}

class MyStudent {	// class �̸��� ���� -> ����

	public static void main(String[] args) {
		// ��ü ����(Ŭ�����κ���)
		Student kimdh = new Student();
		Student choijh = new Student(5);
		Student asdf = new Student("��������", 1, 9);
		
		kimdh.name = "���̸�";
		kimdh.grade = 2;
		kimdh.ban = 7;
		kimdh.studentOutput();
		kimdh.study();
		
		choijh.name = "�ּ���";
		choijh.studentOutput();
		
		asdf.studentOutput();
		asdf.study();
	}

}

