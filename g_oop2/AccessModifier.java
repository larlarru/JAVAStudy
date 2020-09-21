package g_oop2;

public class AccessModifier {
	
	//클래스에?접근할수 있는지 없는지 알려주는거?
	
	public String publicVar = "public : 접근제한이 없음";
	//누구든 public에 붙은 변수를 어디든지 접근할 수 있다.
	
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능";
	//같은 패키지 안에 있으면 접근 가능 다른 패키지에 있는 경우 이 변수에 접근할 수 없다. 다만 상속을 받는다면 접근 가능
	
	//default임
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	// default는 적으면 안되고 반드시 생략해야하며 같은 패지키에서만 접근이 가능하다.
	
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod() {
		System.out.println(publicVar);
	}
	
	protected void protedctedMethod() {
		System.out.println(protectedVar);
	}
	
	void defaultMethod() {
		System.out.println(defaultVar);
	}
	
	private void privateMethod() {
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protedctedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 불필요한 맴버를 감추기 위해
		*/
		
		/*
		 * 빅맥
		 * 1955
		 * 상하이
		 * 
		 * private를 사용해서 감춘다.
		 * 왜나하면 주문할때 알 필요가 없기 때문이다.
		 * private 양상추
		 * private 패티
		 * private 캐첩
		 * private 마요네즈
		 * 
		 */
		
		Time t = new Time();
		//밑에 표시된 시간 데이터는 잘못된거다.
//		t.hour = 9; //시
//		t.minute = 390; //분
//		t.second = -50; //초
		
		t.setHour(9);
		t.setMinute(390);
		t.setSecond(-50);
		System.out.println(t.getTime());
		
		t.clock();
		
		
	}
	
	
	
	
	

}


























