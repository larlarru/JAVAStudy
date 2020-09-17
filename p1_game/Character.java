package p1_game;

public class Character {
	/*
	 * 캐릭터
	*/
	
	String name; //캐릭터 이름
	int maxHp; //최대체력
	int hp; //체력
	int maxMp; //최대마나
	int mp; //마나
	int att; //공격력
	int def; //방어력
	int exp; //경험치
	int level; //레벨업
	//Item[] items; //보유 아이템
	
	Character(String name, int hp, int mp, int att, int def) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		//this.items = new Item[10];
	}
	
	//상태창
/*	void showInfo() {
		System.out.println("===============================================");
		System.out.println("--------------------상태------------------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("채력 : " + maxHp);
		System.out.println("마나 : " + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("---------------------아이템----------------------");
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("===============================================");
	}*/
	
	void attack(Character1 c1) {
		int damage = att - c1.def;
		damage = damage <= 0 ? 1 : damage; //마이너스가 될 경우 1
		c1.hp = c1.hp < damage ? c1.hp - c1.hp : c1.hp - damage; //체력만큼만 감소
		System.out.println(name + "가 공격으로 " + c1.name
				+ "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c1.name + "의 남은 Hp : " + c1.hp);
	}
	
/*	void getExp(int exp) {
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp) {
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp() {
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("LEVEL UP!!");
	}
	
	void getItem(Item item) {
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}
*/
}






























