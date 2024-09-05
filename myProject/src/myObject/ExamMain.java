package myObject;

class Sports {
	String name;
	int player;
	public Sports(String name, int player) {
		this.player = player;
		this.name = name;
	}
	public int getPlayer() {
		return player;
	}
	public String getName() {
		return name;
	}
	public void rule() {
		System.out.println("경기 규칙 적는 곳");
	}
}

class Baseball extends Sports {
	String team;
	public Baseball(String name, int player, String team) {
		super(name, player);
		this.team = team;
	}
	public void rule() {
		System.out.println("야구 규칙");
	}
	public String getTeam() {
		return team;
	}
}

class Basketball extends Sports {
	public Basketball(String name, int player) {
		super(name, player);
	}
	public void rule() {
		System.out.println("농구 규칙");
	}
}

public class ExamMain {
	public static void main(String[] args) {
		Baseball baseball = new Baseball("BaseBall", 9, "한화이글스");
		System.out.println("경기 종목 : " + baseball.getName());
		System.out.println("선수 인원 : " + baseball.getPlayer() + "명");
		System.out.print("경기 규칙 : ");
		baseball.rule();
		System.out.println("팀 이름　 : " + baseball.getTeam());
		
		System.out.println();
		
		Basketball basketball = new Basketball("Basketball", 5);
		System.out.println("경기 종목 : " + basketball.getName());
		System.out.println("선수 인원 : " + basketball.getPlayer() + "명");
		System.out.print("경기 규칙 : ");
		basketball.rule();
	}
}
