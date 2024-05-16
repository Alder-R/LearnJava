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

	void eating() {System.out.println("급식 먹는 중...");}
}

public class StudentExam {

	public static void main(String[] args) {
		Student kim = new Student("김이름");
		kim.setGrade(1);
		kim.ban = 4;
		Student jang = new Student("장ㅁㅁ", 3, 7);
		Student jung = new Student("정ㅇㅇ", 2, 8);
		Student jun = new Student("전ㄴㄴ", 3, 10);

		System.out.println("이름: "+kim.getName()+" \t학년: "+kim.getGrade()+" \t학급: "+kim.ban);
		System.out.println("이름: "+jang.getName()+" \t학년: "+jang.getGrade()+" \t학급: "+jang.ban);
		jang.eating();
		System.out.println("이름: "+jung.getName()+" \t학년: "+jung.getGrade()+" \t학급: "+jung.ban);
		System.out.println("이름: "+jun.getName()+" \t학년: "+jun.getGrade()+" \t학급: "+jun.ban);
		jun.eating();
	}

}
