package g_oop2;

public class AccessTest {

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protedctedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
//		System.out.println(am.privateVar);// 같은 클래스에만 접근이 가능한데 다른 클래스라서 안됨
//		am.privateMethod();// 같은 클래스에만 접근이 가능한데 다른 클래스라서 안됨
		
		
	}
	
	

}


















