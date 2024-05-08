package myObject;

class Student {
	private String name;
	private int grade;
	int ban;
	public Student() {}
	public Student(String name) {this.name = name;}
	public Student(String name, int grade) {this(name); this.grade = grade;}
	public Student(String name, int grade, int ban) {this(name); this.grade = grade; this.ban=ban;}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}
	public void setGrade(int grade) {this.grade = grade;}
	public int getGrade() {return this.grade;}
	
	void eating() {System.out.println("�޽� �Դ� ��...");}
}

public class StudentExam {

	public static void main(String[] args) {
		Student kim = new Student("���̸�");
		kim.setGrade(1);
		kim.ban = 4;
		Student jang = new Student("�失��", 3, 7);
		Student jung = new Student("������", 2, 8);
		Student jun = new Student("������", 3, 10);
		
		System.out.println("�̸�: "+kim.getName()+" \t�г�: "+kim.getGrade()+" \t�б�: "+kim.ban);
		System.out.println("�̸�: "+jang.getName()+" \t�г�: "+jang.getGrade()+" \t�б�: "+jang.ban);
		jang.eating();
		System.out.println("�̸�: "+jung.getName()+" \t�г�: "+jung.getGrade()+" \t�б�: "+jung.ban);
		System.out.println("�̸�: "+jun.getName()+" \t�г�: "+jun.getGrade()+" \t�б�: "+jun.ban);
		jun.eating();
	}

}
