package p2_game;

import e_oop.ScanUtil;

public class MyGame {
	
	Character c;
	Item[] items;
	
	CharacterNameSave cns;
	
	Move m;//이동
	RandomGame rdg; //게임
	
//	String cName; //캐릭터 이름
//	int cHp; //체력
//	int cMp; //마나
//	int cAtt; //공격력
//	int cDef; //방어력
	
	MyGame() {
//		this.cName = "가렌";
//		this.cHp = 100; //체력
//		this.cMp = 50; //마나
//		this.cAtt = 20; //공격력
//		this.cDef = 10; //방어력
//		this.cName = "가렌";
//		this.cHp = 100; //체력
//		this.cMp = 50; //마나
//		this.cAtt = 20; //공격력
//		this.cDef = 10; //방어력
		m = new Move();
		rdg = new RandomGame();
		cns = new CharacterNameSave();
		c = new Character(cns.cnsCName, cns.cnsCHp, cns.cnsCMp, cns.cnsCAtt, cns.cnsCDef);
//		c = new Character("가렌", 100, 50, 20, 10);
//		c = new Character(this.cName, this.cHp, this.cMp, this.cAtt, this.cDef);
		
		items = new Item[10];
//		items[0] = new Item("초보자 환영합니다.", 0, 0, 0, 0);//아이템 얻는것중하나
		items[0] = new Item("무한의 대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}
	
	
	

	public static void main(String[] args) {
		/* 
		 * rpg 게임
		*/
		new MyGame().start();

	}
	
	void start() {
		int input = 0;
		while(true) {
			System.out.println("1.내정보\t2.이동\t3.사냥\t4.게임\t5.종료");
			input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				c.showInfo();
				break;
			case 2:
				m.move();
				break;
			case 3:
				hunt();
				break;
			case 4:
				//String[] args = null;
				//RandomGame.main(args);
				rdg.rdgStart();
				break;
			case 5:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}
	
	void hunt() {
		Monster m = new Monster("고블린", 20, 10, 15, 10,
				new Item[]{items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true) {
			System.out.println("1. 공격\t2.도망");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				c.attack(m); //캐릭터가 몬스터 공격
				if(m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(150);
					c.getItem(m.itemDrop()); //몬스터 아이템 드랍
					break battle;
				}
				m.attack(c); //몬스터가 캐릭터 공격
				break;
				
			case 2:
				break battle;
			}
		}
	}
	
	
	
	

}























