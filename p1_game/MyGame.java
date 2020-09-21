package p1_game;

//import e_oop.ScanUtil;
import p1_game.ScanUtil;

public class MyGame {

	RandomGame rdg;
	Battle battle;
	Menu menu;

	MyGame() {
		rdg = new RandomGame();
		battle = new Battle();
		menu = new Menu();
	}

	public static void main(String[] args) {
	
		new MyGame().start();

	}

	void start() {
		int input = 0;
		while (true) {
			System.out.println("환영합니다.");
			System.out.println("1시작\t2.종료");
			input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				//battle.battlePart();
				menu.start();
				break;
			case 2:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	
	

}


































