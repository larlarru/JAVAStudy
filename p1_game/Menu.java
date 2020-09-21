package p1_game;

//import e_oop.ScanUtil;
import p1_game.ScanUtil;

public class Menu {

	RandomGame rdg;
	Battle battle;
	Miro miro;
	NumGame numgame;

	Menu() {
		rdg = new RandomGame();
		battle = new Battle();
		miro = new Miro();
		numgame = new NumGame();

	}

	void start() {
		int input = 0;
		menu: while (true) {
			System.out.println("1.랜덤숫자게임\t2.배틀\t3.미로\t4.큰숫자게임\t5.시작메뉴창\t6.종료");
			input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				rdg.rdgStart(); //랜덤숫자
				break;
			case 2:
				battle.battlePart(); //배틀
				break;
			case 3:
				miro.start();
				break;
			case 4:
				numgame.start();
				break;
			case 5:
				break menu;
			case 6:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}
}
