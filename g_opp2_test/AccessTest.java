package g_opp2_test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier { //상속을 받았으나 AccesTest가 받는거다

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//같은 패키지거나 상속을 받아야 접근하는데 상속도 아니고 패키지도 같은게 아니라서 접근이 불가능하다.
//		System.out.println(am.protectedVar);  
//		am.protedctedMethod();
		
		//상속받아서 오류 안나게 할려면 이렇게 선언해주고 해야한다.
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);  
		at.protedctedMethod();
		
		//둘다 사용할수 없다.
//		System.out.println(at.defaultVar);
//		System.out.println(at.privateVar);
		
		
	}
	
	

}




















