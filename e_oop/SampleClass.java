package e_oop;

/* import가 다른 클래스를 사용하는데 다른 패키지에 있을때 그 패키지가 어디에 있는지 알려준다.
*/

public class SampleClass {
	
	//클래스를 만들때 항상 앞글자는 대문자로 하기
	public static void main(String[] args) {
		//메서드 안에 있는 변수는 지역변수라고함
		int local = 10; //지역변수 : 메서드 안에서만 사용하는 변수
	}
	
	int field; //전역변수 : 클래스 전체 영역에서 사용하는 변수
	//초기화하지 않아도 기본값으로 초기화된다.
	
	boolean bool = false; //boolean같은 경우 false가 기본값
	String str = null; //참조형 타입은 null이 기본값
	
	
	/*
	 * - 메서드 : 변수를 가지고 할 일
	 * - 선언 방법 : 리턴타입 메서드명(파라미터) { }
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	*/
	
	//void : 타입이 없다
	void method1() { //void 리턴 타입 : 타입을 적어준다.(int, String...) method1 : 메서드이름 method1() : ()안에는 파라미터 적어줘야한다.
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	String method2(int parameter) {
		return parameter + "를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}
	
	//flowTest1() 호출 시 출력되는 문장을 순서대로 번호를 붙여주세요.
	void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTEst1 종료 : 6");
	}
	
	void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}

}
























