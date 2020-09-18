package g_oop2;

public class SampleChild extends SampleParent { 
	//extends SampleParent는 상속받을 클래스를 적어준거다.
	
	void childMethod() {
		System.out.println(var); //상속받은 변수
		System.out.println(method(7, 13)); //상속받은 메서드
	}
	
	//오버라이딩 : 상속받은 메서드를 재정립하는것
	//super, super() : 전역변수와 지역변수가 아니라 부모클래스와 자식클래스 이름이 같을때 둘 구분을 위해 사용
	//super()는 부모클래스 생성자
	//다형성 : 객체 타입과 변수 타입을 다르게 사용하는것
	//다형성 예시 : ABV a = new ABC();를 DEF a = new ABC();로 쓰는거 그런데 막 사용하는건 비추 
	
	//오버라이딩 : 상속받은 메서드를 재정립하는것
	@Override // 이노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는것.
	//이노테이션 이걸 사용하면 무조건 오바리이딩 되는거다
	int method(int a, int b) { //리턴 타입과 메서드명 파라미터 모두 같아야 한다.
		return a * b; // SampleParent에서는 +로 했으나 여기서는 *로 메서드 변경
	}
	
/*	//만약에 밑에처럼 오타를 내서 하면 더이상 오버라이딩이 아니다
	int methㅁd(int a, int b) {
		return a * b; 
	}
	*/
	
	//super, super() : 전역변수와 지역변수가 아니라 부모클래스와 자식클래스 이름이 같을때 둘 구분을 위해 사용
	//super()는 부모클래스 생성자
	int var;
	
	void test(double var) {
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 맴버와 자식 클래스의 맴버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
		
	}
	
	SampleChild() {
		super(); //부모클래스의 생성자 호출
		//super()를 통해 부모클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		/*
		 * 만약 부모클래스에 파라미터가 여러개이면 그 파라미터에 맞게 넣어줘야지 그 값을 받는다
		 * 예를들어 int와 double 파라미터가 하나씩 있는데 super(10); 이렇게 하면되면
		 * int파라미터 애한테 값이 간다. double한테 하고 싶으면 super(10.0);해야한다.
		 * 그리고 파라미터 여러개 만들었는데 예를들어 2개가 있다면 둘중 하나는 꼭 this.var = var;라던지
		 * 이런식으로 선언해줘야한다.
		 * 자식 클래스에서 B() {this(20);}이렇게 있는데 이는 int타입 파라미터꺼다.
		 * 자식 클래스에서 super를 반드시 호출해야하는데 컴파일러가 대신 넣어주는
		 * 컴파일러가 대신 super 넣어주지 안흔 경우가 있는데 
		 * 부모 생성자에 여러? 파라미터가 있는경우 직접적으로 파라미터 명시해서 넣어주거나 
		 * this를 사용한 경우 다른 생성자 호출하기 때문에 this가 있으면 super를 넣지 않는다
		 */
	}
	
	
	//다형성 : 객체 타입과 변수 타입을 다르게 사용하는것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();
		//부모타입의 변수로 자식타입의 객체를 사용하는 것이 다형성이다.(부모 자식간에 형변환이 가능?하다)
		sp = (SampleParent)sc; //sp = sc; 이런식으로 생략이 가능하다
		sc = (SampleChild)sp; //sc = sp이런식으로 생략은 안된다.
		
		//자식타입 -> 부모타입 형변환은 생략 할 수 있다.
		
		SampleChild sc2 = (SampleChild) new SampleParent();
		/*
		 * SampleParent는 2개의 맴버를 가지고 있다.
		 * SampleChild는 5개의 맴버를 가지고 있다.
		 * SampleChild 타입의 변수는 5개의 맴버를 사용할 수 있어야 하는데 
		 * SampleParent 객체는 2개의 맴버만 가지고 있다.
		 * 그러므로 부모타입의 객체를 자식타입으로 형변환 하는것은 에러를 발생시킨다.
		 */
		
		//SampleParent 타입의 변수로는 SampleChild 객체를 가지고도 2개의 맴버만 사용할 수 있다.
		SampleParent sp3 = new SampleChild(); //변수만2개만 사용할 수 있는 애
		System.out.println(sp3.var);
		System.out.println(sp3.method(10, 20));
//		sp3.childMethod(); //사용불가
//		sp3.test(); //사용불가
		//자식에 아무리 맴버가 많아도 부모꺼만 사용할수밖에 없다(다향성이)
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
