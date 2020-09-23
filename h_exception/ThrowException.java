package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		
		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 */
		
		IOException ioe = new IOException(); //IOException에 객체 생성
		
		try {
			throw ioe; //이 위치에서 무족건 에러 발생하기 때문에 예외 처리try를 해줘야한다.
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}































