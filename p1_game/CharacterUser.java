package p1_game;

public class CharacterUser {
	/*
	 * 캐릭터
	*/
	Battle battle /*= new Battle()*/;
	String name; //캐릭터 이름
	int maxHp; //최대체력
	int hp; //체력
	int maxMp; //최대마나
	int mp; //마나
	int att; //공격력
	int def; //방어력
	int exp; //경험치
	int level; //레벨업
	
	CharacterUser(String name, int hp, int mp, int att, int def) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		battle = new Battle();
	}
	
	
	void attack(CharacterAI1 c) {
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage; //마이너스가 될 경우 1
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage; //체력만큼만 감소
		System.out.println(name + "가 공격으로 " + c.name
				+ "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 Hp : " + c.hp);
	}
	void defense(CharacterAI1 c1) {
		int damage = 0;
		damage = damage <= 0 ? 0 : damage; //마이너스가 될 경우 1
		c1.hp = c1.hp < damage ? c1.hp - c1.hp : c1.hp - damage; //체력만큼만 감소
//		System.out.println(c1.name + "가 공격 하였으나 " + name
//				+ "는" + damage + "만큼 데미지를 받으며 방어에 성공하였습니다.");
//		System.out.println(c1.name + "의 남은 Hp : " + c1.hp);
	}
	
	void skill1(CharacterAI1 c) {
		// System.out.println("1. 참격 2. 대참격 ");

		int damage = 20;
		damage = damage <= 0 ? 1 : damage; // 마이너스가 될 경우 1
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage - 10; // 체력만큼만 감소
//		c.hp = c.hp - 10;
		System.out.println(name + "가 공격으로 " + c.name + "에게" + damage
				+ "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 Hp : " + c.hp);

	}

	void skill2(CharacterAI1 c) {
		int damage = 40;
		damage = damage <= 0 ? 1 : damage; // 마이너스가 될 경우 1
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage - 25; // 체력만큼만 감소
//		c.hp = c.hp - 25;
		System.out.println(name + "가 스킬 공격으로 " + c.name + "에게" + damage
				+ "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 Hp : " + c.hp);
	}
	
}






























