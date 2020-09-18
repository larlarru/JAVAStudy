package g_oop2;

public class Store {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터" , 100000);
		Desktop d2 = new Desktop("LG 컴퓨터" , 100000);
		
		AirCon ac1 = new AirCon("삼성  에어컨" , 200000);
		AirCon ac2 = new AirCon("LG 에어컨" , 200000);
		
		TV tv1 = new TV("삼성  에어컨" , 300000);
		TV tv2 = new TV("LG  에어컨" , 300000);
		
		Customer c = new Customer();
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d1); //구매담당소스 
		// c.buy(d1); = c.buy((product)d1); (product)이게 생략되어 들어가 있다
		
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac2);
		
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2);
		
		c.showItem(); //아이템 목록 보여주는 부분
		
		
		
		
	}

}


//부모클래스
class Product { //모든 물건이 공통점으로 가지고 있는 맴버
	String name; //이름
	int price; //가격
	
	//생성자 만들기
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo() {
		return name + "(" + price + "원)";
	}
	
	
	
}


class Desktop extends Product { //product상속받음
	
	Desktop(String name, int price) {
		super(name, price);
	}
	
	void programing() {
		System.out.println("프로그램을 만듭니다.");
	}
}

class AirCon extends Product {
	
	AirCon(String name, int price) {
		super(name, price);
	}
	
	void setTemperature() { //온도설정 매소드
		System.out.println("온도를 설정합니다.");
	}
	
	
}

class TV extends Product {
	
	TV(String name, int price) {
		super(name, price);
	}
	
	void setChannel() {
		System.out.println("채널을 변경합니다.");
	}
	
}

class Customer {
	
	int money = 1000000;
	Product[] item = new Product[100]; //여러개 상품들 저장해야하니 배열로 한다.
	
	void buy(Product p) {
		if(money < p.price) { //돈딸리면 구매 불가
			System.out.println("잔돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) { //빈곳에다가 구매한 물건을 넣음
				item[i] = p;
				break;
			}
		}
		
		System.out.println(p.getInfo() + "를 구매했다."); //정보를 출력하면서 구매했다고 출력
		
		
	}
	
	void showItem() { //내가 가지고 있는 아이템 목록 출력 부분
		System.out.println("========== 아이템 목록 ==============");
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			} else {
				System.out.println(item[i].getInfo());
				}
		}
		
		System.out.println("=====================================");
		
	}
	
	
}
























