package myMidTest2;

public class Test1 {
	public static void main(String[] args) {
//		Sports BaseBall = new BaseBall("BaseBall", 9);
//		System.out.println("경기 종목 : " + BaseBall.getName());
//		System.out.println("선수 인원 : " + BaseBall.getPlayer() + "명");
//		System.out.println("경기 규칙 : " + "야구 규칙");
//		
//		System.out.println("");
//		
//		Sports BasketBall = new BasketBall("BasketBall", 5);
//		System.out.println("경기 종목 : " + BasketBall.getName());
//		System.out.println("선수 인원 : " + BasketBall.getPlayer() + "명");
//		System.out.println("경기 규칙 : " + "농구 규칙");
//
//		System.out.println("");
//		
		Sports FootBall = new FootBall("football", 10);
		System.out.println("경기 종목 : " + FootBall.getName());
		System.out.println("선수 인원 : " + FootBall.getPlayer() + "명");
		System.out.println("경기 규칙 : " + "");
	}
}

class BaseBall extends Sports {
	public BaseBall(String name, int player) {
		super(name, player);
	}
}

class BasketBall extends Sports {
	public BasketBall(String name, int player) {
		super(name, player);
	}
}

class FootBall extends Sports {
	public FootBall(String name, int player) {
		super(name, player);
	}
}