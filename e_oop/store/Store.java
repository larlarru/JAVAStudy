package e_oop.store;

import java.util.Arrays;

public class Store {
	//메서드 : 알바가 할 일(보스가 알바에게 시킨 일)
	//파라미터 : 일을 하기 위해 필요한 것(보스가 알바에게 주는 것)
	//리턴타입 : 일을 하고 난 후 돌려주는 것(알바가 보스에게 주는 것)
	
	//주문받기 위해 필요한 것?
	//주문받은 후 보스에게 줄 것? : 주문서
	int list(int resList) {
		return resList;
	}
	
	String[] order() { //입력을 받으면 여기로 옴
		System.out.println("주문확인하겠습니다");
		return new String[] {"연필 : 1", "팬 : 2", "종이 : 3"};
	}
	
	void serve(String[] sums) {
		System.out.println("고른신 품목 확인중...");
		String[] serve = order();
		System.out.println(Arrays.toString(serve));
		System.out.println("계산합니다");
		//int resListvalue = list();
/*		String listPay = resList();
		int listSum = 0;
		int temp = 0;
		//.equal써야됨
		if(listPay == '1' || listPay == '2' || listPay == '3') {
			listSum++;
		} else if(listPay / 100 == '2') {
			listSum++;
		} else if(listPay / 100 == 3) {
			listSum++;
		}
		*/
		System.out.println("계산합니다");
		
	}
	
	private String resList() {
		// TODO Auto-generated method stub
		return null;
	}

	//계산하기 위해 필요한 것? 계산서
	//계산 후 보스에게 줄것?
	void pay(String[] order){
		System.out.println("감사합니다. 안녕히가세요.");
	}
	
	
}
