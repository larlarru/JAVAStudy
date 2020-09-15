package e_oop.test;

public class Run {
	//메서드 : 알바가 할 일(보스가 알바에게 시킨 일)
	//파라미터 : 일을 하기 위해 필요한 것(보스가 알바에게 주는 것)
	//리턴타입 : 일을 하고 난 후 돌려주는 것(알바가 보스에게 주는 것)
	
	//주문받기 위해 필요한 것?
	//주문받은 후 보스에게 줄 것? : 주문서
	String[] order() {
		System.out.println("과목 목록");
		return new String[] {"국어", "영어", "수학", "사회", "과학"};
	}
	
	//서빙하기 위해 필요한것? 음식
	//서빙 후 보스에게 줄것? 없음
	void serve(String[] products) {
		System.out.println("주문완료되었습니다.");
	}
	
	//계산하기 위해 필요한 것? 계산서
	//계산 후 보스에게 줄것?
	void pay(String[] order){
		System.out.println("안녕히가세요.");
	}
	
	
}
