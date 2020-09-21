package g_oop2;

public interface SampleInterface {
	//추상메서드와 상수만 가질수 있다.
	//관계 없는것들끼리 관계를 만들어 줄수 있다.
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	
	//모든 맴버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
	
	
	
}


//extends는 클래스 상속받을때 사용
class SampleImplement implements SampleInterface, SampleInterface2 { //인터페이스 상속받을때는 implements사용
	//인터페이스는 다중 상속이 가능하다. 즉 여러개의 인터페이스를 상속을 받을 수 있다.
	//위에처럼 , 찍고 적어주면 여러개의 인터페이스를 상속받는다.
	//인터페이스 여러개 상속받을때 중복된거 제외하고 메서드가 만들어지는데 만약 오타나면 별개럴로 취급되서 만들어진다.
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	


	
}

interface SampleInterface2 {
	void method1();
	void method3();
	
}

























