package p1_game;

import java.util.Scanner;

import p_game.Item;
//import e_oop.ScanUtil;
import p1_game.ScanUtil;

public class RandomGame {
	
	
	boolean game;
	int gameRes;
	int ansInput;
	int ranNum;
	
	int GAME_NUM = (int)(Math.random() * 99) + 2;
	
		
	RandomGame(){
		game = false;
		this.gameRes = gameRes;
		this.ansInput = ansInput;
		this.ranNum = 0;
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
	void end(){ //시스템 종료
		System.exit(0);
	}
	
	void ranNum(int ranNumber) {
		ranNum = ranNumber;
//		System.out.println("랜덤 숫자 :  " + ranNum);
	}
	
	void rdgStart() {
		
		RandomGame randomgame = new RandomGame();
		int randomVal = GAME_NUM;
		
		System.out.print("랜덤 숫자 게임 시작(시작은 1 끝낼거면 아무 숫자 누르기)> ");
		int startInput = ScanUtil.nextInt();
		
		rdgGame : while (true) {
			if (startInput != 1) {
				break rdgGame;
			}
			System.out.print("2~100 까지 숫자 입력(나갈거면 1 입력)> ");
			ansInput = ScanUtil.nextInt();
			
			
			ranNum(randomVal);
			
			switch (ansInput) {
			
			case 1:
				//randomgame.game();
				System.out.println("랜덤 숫자 값 정답 :  " + ranNum);
				System.out.println("랜덤 게임 빠져나왔습니다.");
				break rdgGame;
				
//			case 2:
				// System.out.print("숫자 입력1>");
				// int reAnsInput = ScanUtil.nextInt();
				// randomgame.play(reAnsInput);
			//	randomgame.play(ansInput);
//				break;
				
			default:
				if (ansInput > 100) {
					System.out.println("정해진 숫자 범위를 넘어섰습니다. 다시 입력하세요.");
				} else if (ranNum == ansInput) {
					System.out.println("랜덤 숫자 값 정답 :  " + ranNum);
					System.out.println("랜덤 숫자 게임 종료되었습니다.");
					break rdgGame;
				}
				break;
			}

		}
	}

}

	

/*class Ran {
	int ranNum = 0;


}*/












