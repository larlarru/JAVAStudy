package p1_game;

//import p_game.Item;
import p1_game.Character;
import p1_game.Character1;
import e_oop.ScanUtil;

public class Battle {
	int hp;
	int mp;
	int att;
	int def;
	
	void hunt() {
		this.hp = (int)(Math.random() * 101);
		this.mp = (int)(Math.random() * 101);
		this.att = (int)(Math.random() * 101);
		this.def = (int)(Math.random() * 101);
		Character c = new Character("대전캐릭1", this.hp, this.mp, this.att, this.def );
		Character1 c1 = new Character1("대전캐릭2", this.hp, this.mp, this.att, this.def/*,
				new Item[]{items[0], items[1]}*/);
		System.out.println(c1.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true) {
			System.out.println("1. 공격\t2.도망");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				c.attack(c1); //캐릭터가 몬스터 공격
				if(c1.hp <= 0) {
					System.out.println(c1.name + "을 처치하였습니다.");
					//c.getExp(150);
					//c.getItem(m.itemDrop()); //몬스터 아이템 드랍
					break battle;
				}
				c1.attack(c); //몬스터가 캐릭터 공격
				break;
				
			case 2:
				break battle;
			}
		}
	}

}
