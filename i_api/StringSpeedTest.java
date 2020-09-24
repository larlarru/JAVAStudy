package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
		/*
		String str = "a";
		
		long start = System.currentTimeMillis(); //현재시간 long타입으로 반환 
		for (int i = 0; i < 10000; i++) { 
			str += "a";
		}
		long end = System.currentTimeMillis(); 
		System.out.println(end - start + "ms");
		//string 변경할거면 이렇게 하지말고 다르게 하라.
		*/
		
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis(); //현재시간 long타입으로 반환
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis(); //현재시간 long타입으로 반환
		System.out.println(end - start + "ms");
		
		
		
		
		
	}
	
	
	
	
	
	
	

}













