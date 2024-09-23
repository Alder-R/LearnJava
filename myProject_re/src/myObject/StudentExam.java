package myObject;

public class StudentExam {
	public static void main(String[] args) {
		Student A = new Student("AAA");
		A.grade = 1;
		Student B = new Student("BBB", 2);
		Student C = new Student();
		A.printInfo();
		B.printInfo();
		C.printInfo();
	}
}

class Student {
	String name;
	int grade;
	public Student() {}
	public Student(String name) { 
		this.name = name; 
	}
	public Student(String name, int grade) {
		this.name = name; 
		this.grade = grade; 
	}
	public void printInfo() {
		System.out.println("학생 이름: " + this.name + "\t학년: " + this.grade);
	}
}