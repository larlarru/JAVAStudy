package g_oop2;

public abstract class SampleAbstractParent {
	
	/*
	 * abstract 추상클래스를 만들어 주는 제어장치
	 * 추상메서드를 하나라도 가지고 있으면 추상클래스
	 */
	
	//추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	void method() { //추상 메서드
		
	}
	
	//추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod(); //추상 메서드인걸 알려주기 위해 abstract 붙임
	//내용이 없기 때문에 호출할수가 없다.
	//메서드는 같은데 기능이 조금씩 다르기 때문에 추상 메서드로 만든다.
	
	
	
}

class SampleAbstractChild extends SampleAbstractParent {
	//추상 클래스로 만들거나 추상 메소드에 내용을 만들어주면 된다.
	//내용은 오버라이딩 써서 만들어주면된다.
	
	@Override
	void abstractMethod() {
		//
	}
	
	
}














