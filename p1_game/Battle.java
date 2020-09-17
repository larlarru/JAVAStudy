package p1_game;

//import p_game.Item;
import p1_game.CharacterUser;
import p1_game.CharacterAI1;
import e_oop.ScanUtil;

public class Battle {
	int hp;
	int mp;
	int att;
	int def;
	int point;
	int point1;
	
	
		
	int[] pointArr;
	int[] pointTurn;
	
	 Battle() {
		this.pointArr = new int[4];
		this.pointTurn = new int[4];
		for(int i = 0; i < this.pointArr.length; i++) {
			this.pointArr[i] = (int)(Math.random() * 10) + 5;
		}
		for(int i = 0; i < this.pointTurn.length; i++) {
			this.pointTurn[i] = (int)(Math.random() * 4);
		}
	}
	
	void battlePart() {
		this.point = (int)(Math.random() * 101);
		this.point1 = (int)(Math.random() * 101);
		this.hp = this.pointArr[this.pointTurn[0]];
		this.mp = this.pointArr[this.pointTurn[1]];
		this.att = this.pointArr[this.pointTurn[2]];
		this.def = this.pointArr[this.pointTurn[3]];
/*		Character c = new Character("유저", 100 + this.point, this.mp + this.point, 
												10 + this.point, this.def + this.point);
		Character1 c1 = new Character1("대전캐릭", 100 + this.point1, this.mp + this.point1, 
												10 + this.point1, this.def + this.point1);*/
		CharacterUser c = new CharacterUser("유저", 100, 0, 10 + this.att + this.point, 0);
		CharacterAI1 c1 = new CharacterAI1("대전캐릭", 100, 0, 10 + this.att + this.point1, 0);
		System.out.println(c1.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true) {
			System.out.println("1. 공격\t2.방어\t3.도망");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				c.attack(c1); //캐릭터가 몬스터 공격
				if(c1.hp <= 0) {
					System.out.println(c1.name + "이 죽었습니다.");
					//c.getExp(150);
					//c.getItem(m.itemDrop()); //몬스터 아이템 드랍
					break battle;
				}
				c1.attack(c); //몬스터가 캐릭터 공격
				if(c.hp <= 0) {
					System.out.println(c.name + "이 죽었습니다.");
					//c.getExp(150);
					//c.getItem(m.itemDrop()); //몬스터 아이템 드랍
					break battle;
				}
				break;
				
			case 2:
				c.defense(c1);
				break;
			case 3:
				break battle;
			}
		}
	}

}
