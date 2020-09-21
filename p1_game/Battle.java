package p1_game;

//import p_game.Item;
import p1_game.CharacterUser;
import p1_game.CharacterAI1;
//import e_oop.ScanUtil;
import p1_game.ScanUtil;

public class Battle {
	
	
	int hp;
	int mp;
	int att;
	int def;
	int point;
	int point1;
	
	int input;
	
	
		
	int[] pointArr;
	int[] pointTurn;
	
	 Battle() {
		 
		 
		this.pointArr = new int[4];
		this.pointTurn = new int[4];
		for(int i = 0; i < this.pointArr.length; i++) {
			this.pointArr[i] = (int)(Math.random() * 10);
		}
		for(int i = 0; i < this.pointTurn.length; i++) {
			this.pointTurn[i] = (int)(Math.random() * 4);
		}
		
		input = 0;
		
	}
	
	void battlePart() {
		this.point = (int)(Math.random() * 10);
		this.point1 = (int)(Math.random() * 10);
		this.hp = this.pointArr[this.pointTurn[0]];
		this.mp = this.pointArr[this.pointTurn[1]];
		this.att = this.pointArr[this.pointTurn[2]];
		this.def = this.pointArr[this.pointTurn[3]];
/*		Character c = new Character("유저", 100 + this.point, this.mp + this.point, 
												10 + this.point, this.def + this.point);
		Character1 c1 = new Character1("대전캐릭", 100 + this.point1, this.mp + this.point1, 
												10 + this.point1, this.def + this.point1);*/
		CharacterUser c = new CharacterUser("유저", 100, 10 + this.mp + this.point, 
												   5 + this.att + this.point, this.def);
		CharacterAI1 c1 = new CharacterAI1("대전캐릭", 100, 10 + this.mp + this.point1, 
													7 + this.att + this.point1, this.def);
		System.out.println(c1.name + "를 만났습니다. 전투를 시작합니다.");
		
		//int input = 0;
		battle : while(true) {
			System.out.println("1. 공격\t2.방어\t3.스킬\t4.도망");
			//input = ScanUtil.nextInt();
			this.input = ScanUtil.nextInt();
			switch(this.input) {
			case 1:
				c.attack(c1); //캐릭터가 몬스터 공격
				if(c1.hp <= 0) {
					System.out.println(c1.name + "가 죽었습니다.");
					break battle;
				}
				c1.attack(c); //몬스터가 캐릭터 공격
				if(c.hp <= 0) {
					System.out.println(c.name + "가 죽었습니다.");
					break battle;
				}
				System.out.println(c.name + "의 남은 Hp : " + c.hp  + " 남은 Mp : " + c.mp);
				System.out.println(c1.name + "의 남은 Hp : " + c1.hp  + " 남은 Mp : " + c1.mp);
				break;
				
			case 2: //방어
				
				int attackRan = (int)(Math.random() * 10); //랜덤 확률를 위해 숫자부여
				//System.out.println(attackRan);
				if(attackRan == 2) { //만약에 랜덤숫자가 2 나오면 방어 실패를 하면서 대미지를 받음
					c1.attack(c);
					System.out.println("방어에 실패하였습니다.");
				} else if(attackRan != 2) { 
					c.defense(c1);
					System.out.println("방어에 성공하였습니다.");
				}
				
				System.out.println(c.name + "의 남은 Hp : " + c.hp  + " 남은 Mp : " + c.mp);
				System.out.println(c1.name + "의 남은 Hp : " + c1.hp  + " 남은 Mp : " + c1.mp);
				break;
			case 3: //스킬
				System.out.println("1. 참격 2. 대참격 ");
				this.input = ScanUtil.nextInt();
				if (this.input == 1) {
					if(c.mp > 10) {
					c.skill1(c1); // 캐릭터가 몬스터 공격
					c.mp -= 10 ;
					c1.attack(c); //몬스터가 캐릭터 공격
					} else if (c.mp < 10) {
						System.out.println("마나가 없습니다.");
						System.out.println("스킬 사용 실패하였습니다.");
					}
				}
				if (this.input == 2) {
					if(c.mp > 25) {
					c.skill2(c1); // 캐릭터가 몬스터 공격
					c.mp -= 25 ;
					c1.attack(c); //몬스터가 캐릭터 공격
					} else if(c1.mp < 25) {
						System.out.println("마나가 없습니다.");
						System.out.println("스킬 사용 실패하였습니다.");
					}
				}
//				c1.attack(c); //몬스터가 캐릭터 공격
			
				System.out.println(c.name + "의 남은 Hp : " + c.hp + " 남은 Mp : " + c.mp);
				System.out.println(c1.name + "의 남은 Hp : " + c1.hp + " 남은 Mp : " + c1.mp);
				break;
			case 4:
				break battle;
			}
		}
	}
	
	
	
	
	

}
