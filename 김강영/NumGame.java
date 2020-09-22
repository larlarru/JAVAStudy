package 김강영;
import 김강영.ScanUtil;

public class NumGame {
	
	int aiNum;
	int userNum;
	
	NumGame() {
		this.aiNum = (int)(Math.random() * 99) + 2;
		this.userNum = 0;
	}
	
	void start() {
		int input = 0;
		System.out.println("숫자게임에 오신걸 환영합니다.");
		System.out.println("상대방보다 큰 숫자를 입력하시면 이깁니다. 같거나 작으면 집니다.");
		numgame : while (true) {
			System.out.println("2~100중 아무 숫자를 입력하세요(1.종료)> ");
//			System.out.println("상대방 숫자 값 : " + aiNum);
			input = ScanUtil.nextInt();
			this.userNum = input;

			switch (input) {
			case 1:
				System.out.println("상대방 숫자 값 : " + aiNum);
				System.out.println("게임을 종료합니다.");
				System.out.println("메뉴선택창으로 돌아갑니다.");
				break numgame;
			default:
				if(input > 100) { //정해진 숫자 범위를 넘으면 다시 입력하기
					System.out.println("정해진 숫자 범위를 넘어섰습니다. 다시 입력하세요.");
				} else if(aiNum < userNum) { //내가 입력한 숫자가 상대방 숫자보다 크면 승리
					System.out.println("승리하셨습니다.");
					System.out.println("상대방 숫자 값 : " + aiNum);
					break numgame;
				} else
				System.out.println("졌습니다. 다시 입력하세요.");
				break;
			}
		}
	}

}
