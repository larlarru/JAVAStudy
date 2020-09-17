package e_oop;

import java.util.Scanner;

public class RandomGame {
	
	boolean game;
	int gameRes;
	static int ansInput;
	
	final static int GAME_NUM = (int)(Math.random() * 99) + 2;
	
	
	RandomGame(){
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
	void end(){ //시스템 종료
		System.exit(0);
	}
	public static void main(String[] args) {
		RandomGame randomgame = new RandomGame();
		int randomVal = GAME_NUM;
		System.out.print("랜덤 숫자 게임 시작(시작은 1)> ");
		int startInput = ScanUtil.nextInt();
		if(startInput != 1) {
			randomgame.end();
		}
		
		
		while(true){
			
			System.out.print("숫자 입력> ");
			ansInput = ScanUtil.nextInt();
									
			Ran ran = new Ran();
			ran.ranNum(randomVal);
			
			switch (ansInput) {
			case 1: randomgame.game(); break;
			
			case 2:
			//System.out.print("숫자 입력1>");
			//int reAnsInput = ScanUtil.nextInt();
			//randomgame.play(reAnsInput);
			randomgame.play(ansInput);
				
			break;
			
				
			default:
				if(ran.ranNum == ansInput) {
				System.out.println("랜덤 숫자 값 정답 :  " + ran.ranNum);
				System.out.println("종료되었습니다.");
				randomgame.end();
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
		//System.out.println("랜덤 숫자 :  " + ranNum);
	}

}












