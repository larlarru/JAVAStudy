package p2_game;

import java.util.Scanner;

import e_oop.ScanUtil;

public class RandomGame {
//	Character c;
//	CharacterNameSave cns;
	
//	MyGame mg;
	
//	Ran ran;
	
	boolean game;
	int gameRes;
	static int ansInput;
	
	final static int GAME_NUM = (int)(Math.random() * 99) + 2;
	
	
	RandomGame(){
//		mg = new MyGame();
//		c = new Character(mg.cName, mg.cHp, mg.cMp, mg.cAtt, mg.cDef);
		//c = new Character("가렌", 100, 50, 20, 10);
//		cns = new CharacterNameSave();
//		c = new Character(cns.cnsCName, cns.cnsCHp, cns.cnsCMp, cns.cnsCAtt,
//							cns.cnsCDef);
//		ran = new Ran();
		game = false;
	}
	void game(){
		game = !game;
		System.out.println(game ? "게임 시작" : "게임 종료");
	}
	void play(int playNum){
		if(game){
			if(GAME_NUM == playNum){
				this.game = false;
			}
			//System.out.println("잘꺼지는지 확인");
		}
	}
	void end(){ //시스템 종료 또는 게임 종료
		System.exit(0);
	}
	/*public static void main(String[] args) {
		
		new RandomGame().rdgStart();
	}*/
	
		
	void rdgStart() {
		
		RandomGame randomgame = new RandomGame();
		int randomVal = GAME_NUM;
		
		System.out.print("랜덤 숫자 게임 시작(시작은 1)> ");
		int startInput = ScanUtil.nextInt();
		
		rdgGame : while (true) {
			if (startInput != 1) {
				//randomgame.end();
				// mg.start();
				break rdgGame;
			}
			System.out.print("숫자 입력> ");
			ansInput = ScanUtil.nextInt();
			
			Ran ran = new Ran();
			ran.ranNum(randomVal);
//			ran.ranNum = randomVal;
			
			switch (ansInput) {
			case 1:
				randomgame.game();
				break;
				
			case 2:
				// System.out.print("숫자 입력1>");
				// int reAnsInput = ScanUtil.nextInt();
				// randomgame.play(reAnsInput);
				randomgame.play(ansInput);
				
				break;
				
			default:
				if (ran.ranNum == ansInput) {
					System.out.println("랜덤 숫자 값 정답 :  " + ran.ranNum);
					System.out.println("종료되었습니다.");
//					c.getExp(50);
					//randomgame.end();
					// mg.start();
					break rdgGame;
				}
				break;
			}
			
		}
	}
}

	

class Ran {
	int ranNum = 0;

	void ranNum(int ranNumber) {
		ranNum = ranNumber;
		System.out.println("랜덤 숫자 :  " + ranNum);
	}

}












