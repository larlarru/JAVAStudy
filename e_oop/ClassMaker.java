package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해주세요.
	int maker = 2;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	void makermethod1() {
		System.out.println(maker);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해 주세요.
	int makermethod2() {  //int가 있는 메소드는 반드시 return 해줘야 한다.
		return maker;
	}
	
	//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어 주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	void makermethod3(String parameter){
		System.out.println(parameter);
	}
	
	//int 타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해 주세요.
	int intmethod1(int intParameter1, int intParameter2) { //(파라미터) 파라미터는 , 붙이면 여러개 가능하다.
		return intParameter1 * intParameter2;
	}
/*	int intmethod1(int intParameter1) {
		return intParameter1;
	}
	int intmethod2(int intParameter1, int intParameter2) {
		return intParameter1 * intParameter2;
	}
*/	
	
}














