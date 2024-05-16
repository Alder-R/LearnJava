package myClass;

class Student {
	// 생성자(없으면 자동으로 JVM에서 기본 생성자를 삽입, 접근 제어자 사용 가능)
	Student() {}		// 기본 생성자
	Student(int ban) {	// 다형성: 오버로딩			// 매개 변수 1개 사용
		this.ban = ban;
	}
	Student(String name, int grade, int ban) {	// 매개 변수 3개 사용
		this.name = name;
		this.grade = grade;
		this.ban = ban;
	}

	// 멤버 변수 (정적 특성)
	String name;		// 이름
	int grade;			// 학년
	int ban;			// 반
	String phoneNum;	// 전화번호

	// 메소드
	void studentOutput() { System.out.println("이름: " + name + ", 학년: " + grade + ", 반: " + ban); }
	void study() { System.out.println("\t공부하는 중"); }
}

class MyStudent {	// class 이름과 동일 -> 실행

	public static void main(String[] args) {
		// 객체 생성(클래스로부터)
		Student kimdh = new Student();
		Student choijh = new Student(5);
		Student asdf = new Student("ㅁㄴㅇㄹ", 1, 9);

		kimdh.name = "김이름";
		kimdh.grade = 2;
		kimdh.ban = 7;
		kimdh.studentOutput();
		kimdh.study();

		choijh.name = "최성명";
		choijh.studentOutput();

		asdf.studentOutput();
		asdf.study();
	}

}

