package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		
		/*
		 * 메서드에 예외 선언하기
		 * - 메서드 호출시 발생할 수 있는 예외를 선언해줄 수 있다.
		 * - void method() throws IOException {}
		 * - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		
		try {
			method(); //메서드 호출
		} catch (IOException e) {
			e.printStackTrace();
		} 
		try {
			new FileInputStream(""); //예외처리 반드시 해줘야한다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
	}

	private static void method() throws IOException{ //method 메서드
		throw new IOException(); //위에다가 throws IOException 선언해주면 이제 위에서 호출하는 method();에서 에러를 해결해 줘야한다.
		
	}
	
	
	
	

}












