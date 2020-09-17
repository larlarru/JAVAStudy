package f_game;

public class Monster {
	String name; //Monster 이름
	int maxHp; //최대체력
	int hp; //체력
	int maxMp; //최대마나
	int mp; //마나
	int att; //공격력
	int def; //방어력
	int level; //레벨업
	Item[] items; //보유 아이템
	
	Monster(String name, int hp, int mp, int att, int def, Item[] items) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.items = items;
	}
	
	void attack(Character m) { //파라미터만 바꿔서 공격 대상을 바꿔주면된다.
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; //마이너스가 될 경우 1
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; //체력만큼만 감소
		System.out.println(name + "가 공격으로 " + m.name
				+ "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 Hp : " + m.hp);
	}
	
	Item itemDrop() {
		return items[(int)(Math.random() * items.length)];
	}
	
}
