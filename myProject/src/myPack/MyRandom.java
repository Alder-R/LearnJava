package myPack;

import java.util.Scanner;

public class MyRandom {

	static int chance = 5;		// 주어지는 기회, 값 수정 가능

	static void upDownGame() {
		int randomNum = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		
		// System.out.printf("(개발자용)정답: "+randomNum);
		
		for (int tryNum = 1; chance != 0; tryNum++) {
			if (chance+1 == tryNum) {
				System.out.println("\n***** 정답을 맞추지 못했습니다. *****\n"
						+chance+"회의 기회를 모두 소진하였습니다. "+"정답은 \""+randomNum+"\"이었습니다.\n"
						+ "게임을 다시 시작합니다.");
				upDownGame();
			}
			System.out.printf("\n숫자 입력(0~99): ");
			int inputNum = sc.nextInt();
			if (inputNum == 100) { 
				System.out.print("게임을 종료합니다.");
				System.exit(0); 
				}
			else if (inputNum > randomNum) { System.out.println("너무 큽니다. ("+tryNum+"/"+chance+"회)"); } 
			else if (inputNum < randomNum) { System.out.println("너무 작습니다. ("+tryNum+"/"+chance+"회)"); } 
			else if (inputNum == randomNum) { 
				System.out.println("\n***** 축하합니다. *****\n"
						+ "정답은 \""+randomNum+"\"이었습니다. "+chance+"회의 기회 중 "+tryNum+"회만에 정답을 맞추었습니다.\n"
						+ "게임을 다시 시작합니다."); 
				upDownGame();
				}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("***** UP & DOWN GAME *****\n"
						+"@ "+chance+"회의 기회 안에 랜덤으로 주어지는 숫자를 맞추면 됩니다.\n"
						+"@ 기회가 모두 소진되거나 정답을 맞추면 게임은 자동으로 재시작됩니다.\n"
						+"@ 종료를 원하면 숫자 입력 칸에 \"100\"을 입력하고 Enter(Return)키를 누르세요.\n"
						+"***** UP & DOWN GAME *****");
		
		upDownGame();
	}

}
