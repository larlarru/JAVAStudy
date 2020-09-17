package p1_game;

import e_oop.ScanUtil;

public class MyGame {

	RandomGame rdg;
	Battle battle;

	MyGame() {
		rdg = new RandomGame();
		battle = new Battle();
	}

	public static void main(String[] args) {
		/*
		 * rpg 게임
		 */
		new MyGame().start();

	}

	void start() {
		int input = 0;
		while (true) {
			System.out.println("1.랜덤숫자게임\t2.배틀게임\t3.종료");
			input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				rdg.rdgStart();
				break;
			case 2:
				battle.battlePart();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	
	

}


































