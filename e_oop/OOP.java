package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		*/
		
		/*메인메소드는 한줄만 호출하면 반복문에 계속 적어야하는걸 계속 반복할 수 있다.
		*/
		
		SampleClass sc = new SampleClass(); //객체 생성하고 저장
		
		System.out.println(sc.field); //sc.field를 초기화하지 않아서 기본값인 0이 출력됨
		
		sc.method1(); //메서드 호출
		
		sc.method2(5);//이 메소드를 int타입이고 리턴했을때 String의 값을 받을 수 있다.(?)
		
		String returnValue = sc.method2(5);
		System.out.println(returnValue);
		System.out.println(sc.method2(10)); //변수 선언 하기 싫고 메소드를 담고 싶다면 이렇게 해도됨
		sc.flowTest1();
		
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 벼수를 통해 메서드를 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고.
		//리턴타이빙 있는 메서드는 리턴받은 값을 출력해주세요.
		ClassMaker cm = new ClassMaker();
		cm.makermethod1();
		System.out.println(cm.makermethod2());
		cm.makermethod3("test");
		System.out.println(cm.intmethod1(5, 2));
		
		Calculator cc = new Calculator();
		double result = cc.add(123456, 654321);
		result = cc.mul(result, 123456);
		result = cc.div(result, 123456);
		result = cc.sub(result, 654321);
		result = cc.rem(result, 123456);
		System.out.println(result);
/*		double oopAdd = cc.add(123456, 654321);
		System.out.println(oopAdd);
		
		double oopMul = cc.mul(oopAdd, 123456);
		System.out.println(oopMul);
		
		double oopDiv = cc.div(oopMul, 123456);
		System.out.println(oopDiv);
		
		double oopSub = cc.sub(oopDiv, 654321);
		System.out.println(oopSub);
		
		double oopRem = cc.rem(oopSub, 123456);
		System.out.println(oopRem);
		*/
	}

}















