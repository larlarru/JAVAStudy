package p1_game;

import p_game.Character;
import e_oop.ScanUtil;

public class MyGame {

	RandomGame rdg;

	MyGame() {
		rdg = new RandomGame();
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
			System.out.println("1.랜덤숫자게임\t2.종료");
			input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				rdg.rdgStart();
				break;
			case 2:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	
	

}


































