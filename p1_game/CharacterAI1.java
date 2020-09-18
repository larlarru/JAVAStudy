package p1_game;

public class CharacterAI1 {
	String name; //Monster 이름
	int maxHp; //최대체력
	int hp; //체력
	int maxMp; //최대마나
	int mp; //마나
	int att; //공격력
	int def; //방어력
	int level; //레벨업
	//Item[] items; //보유 아이템
	
	CharacterAI1(String name, int hp, int mp, int att, int def/*, Item[] items*/) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		//this.items = items;
	}
	
	void attack(CharacterUser c1) { //파라미터만 바꿔서 공격 대상을 바꿔주면된다.
		int damage = att - c1.def;
		damage = damage <= 0 ? 1 : damage; //마이너스가 될 경우 1
		c1.hp = c1.hp < damage ? c1.hp - c1.hp : c1.hp - damage; //체력만큼만 감소
		System.out.println(name + "가 공격으로 " + c1.name
				+ "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c1.name + "의 남은 Hp : " + c1.hp);
	}
	void defense(CharacterUser c1) {
		int damage = 0;
		damage = damage <= 0 ? 0 : damage; //마이너스가 될 경우 1
		c1.hp = c1.hp < damage ? c1.hp - c1.hp : c1.hp - damage; //체력만큼만 감소
		//System.out.println(c1.name + "가 공격 하였으나 " + name
		//		+ "는" + damage + "만큼 데미지를 받으며 방어에 성공하였습니다.");
		//System.out.println(c1.name + "의 남은 Hp : " + c1.hp);
	}
	void skill1(CharacterUser c1) {
		//System.out.println("1. 참격 2. 대참격 ");
		
		
			int damage = 20;
			damage = damage <= 0 ? 1 : damage; //마이너스가 될 경우 1
			c1.hp = c1.hp < damage ? c1.hp - c1.hp : c1.hp - damage; //체력만큼만 감소
//			c1.hp = c1.hp - 10;
			System.out.println(name + "가 공격으로 " + c1.name
					+ "에게" + damage + "만큼 데미지를 주었습니다.");
			System.out.println(c1.name + "의 남은 Hp : " + c1.hp);

	}
	void skill2(CharacterUser c1) {
		
			int damage = 40;
			damage = damage <= 0 ? 1 : damage; //마이너스가 될 경우 1
			c1.hp = c1.hp < damage ? c1.hp - c1.hp : c1.hp - damage; //체력만큼만 감소
//			c1.hp = c1.hp - 25;
			System.out.println(name + "가 공격으로 " + c1.name
					+ "에게" + damage + "만큼 데미지를 주었습니다.");
			System.out.println(c1.name + "의 남은 Hp : " + c1.hp);

	}
	
	
/*	Item itemDrop() {
		return items[(int)(Math.random() * items.length)];
	}
	*/
}
