package e_oop;

public class VariableInit {
	
	//메서드 안은 지역변수 밖은 인스턴스 변수
	
	//Variable : 변수 Init : 초기화
	
	//명시적 초기화
	int var = 10;
	static int staticVar = 20;
	
	//초기화 블럭
	//클래스 밑에 {}하고 {}안에 초기화 하는거
	{
		var = 30; //static 붙지 않는 변수를 초기화 하기 위해 쓰는거
	}
	
	static{
		staticVar = 40; //satic 붙은 변수를 초기화 하기 위해 쓰는거
	}
	
	//명시적 초기화를 쓰면 변수에 값만 넣을 수 있는데 초기화블럭을 쓰면 여러개 필요한 변수?를 쓸 수 있다.
	
	/*
	 * 생성자
	 * - 클래스와 같은 이름의 메서드
	 * - 인스턴스 변수를 초기화하기 위해 사용한다.
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야 한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	 * - 생성자는 리턴타입이 없다.
	*/
	
	/*
	 * static 안붙은 인스턴스 변수를 초기화하기 위해 사용
	 * 생성자는 메서드인데 리턴타입이 없다(?)
	*/
	
	//생성자는 리턴타입이 없고 클래스와 같은 이름으로 하기
	VariableInit() { // <-이게 생성자
		var = 50; //인스턴스 변수를 초기화 하기 위한
/*		staticVar = 60; // <- 이렇게 클래스 변수를 초기화 하면 좋지 않음
		왜냐하면 값을 공유해야 하는 클래스 변수가 객체 생성 시 마다 계속 초기화되기 때문에
		클래스 변수를 생성자에서 초기화하는 것은 좋지 않다.*/
		
		/*
		 * 생성자 사용이유
		 * 초기화에 여러줄의 코드가 필요할 때
		 * 초기화에 파라미터가 필요할 때
		*/
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// Init클래스(?)가 생성자가 하나도 없을때 만들어주는데 하나라도 있기 때문에 에러가 발생한다. 해결할려면 하나 또 만들어주면된다.
		Init i = new Init(); //Init 사용을 위한 객체 생성
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init(); 
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		Init i3 = new Init(70, 80, 90); //가로안에 값만 적어주면된다.
		
		
	}
	
	

}

class Init {
	int a;
	int b;
	int c;
	
	
	//현재 같은 이름을 가진 메서드 Init 메서드가 2개가 있다 그러면 둘이 구분이 안가니 파라미터 int a, int b, int c 이런거 가지고 구분한다.
	Init(int a, int b, int c) {
		//밑에 this를 붙이지 않으면 지역변수가 된다.
		this.a = a;
		this.b = b;
		this.c = c;
		//this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다.
		
	}

	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는것
	Init() { // 이렇게 파라미터가 없는 생성자를 만들어주면 에러가 안생긴다
		//인스턴스 변수를 초기화 하고 싶으면 밑에처럼 하는데 더 좋은 방법으로는 this 사용한다.
		/*a = 10;
		b = 20;
		c = 30;
		*/
		//this() : 생성자에서 다른 생성자를 호출할 때 사용한다.
		this(10, 20, 30);  //this변수는 생성자의 가장 첫줄에 만들어줘야하는데 그게 아니면 에러가 난다. 지금 여기 적혀있는는 /**/안에 있는거 변수 해제하면 에러가 난다.첫줄이 아니니까
		//그리고 위에 this문장은 Init(int a, int b, int c)로 가서 초기화 해준다. 그렇게 되면 위에
//		a = 10;
//		b = 20;
//		c = 30;
		//위의 3변수가 있으면 this 쓴 의미가 없게 되기 때문에 this는 첫줄에 와야한다.

//		전역변수와 인스턴스 변수의 차이 기준이 다름 전역변수는 위치를 기준으로 이름을 붙인거 인스턴스 변수는 static가 붙냐 안붙냐의 차이
		//전역변수는 밖에 있어서 주는거? 전역변수에서 static가 붙는냐 안붙는냐에 따라 인스턴스 변수냐 아니냐로 갈린다. 
	}
	
}






























