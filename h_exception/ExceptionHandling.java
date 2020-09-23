package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		/*
		 * 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄) //문법적 에러
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은
		 * 	  예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 * 
		 */
		
		try { //에러나는 문장 try로 감싸주면 프로그램은 돌아간다.
			
		int result = 10 / 0;
		System.out.println(result);
		
		} catch(ArithmeticException | IndexOutOfBoundsException e) { //cathc()안에 파라미터 있어야한다.
			//catch() 파라미터 안에 여러개의 파라미터를 만들때 위에처럼 만든다. 그래서 하나의 변수 타입?이 된다.
			//try 실행하는데 37번에서 에러라면 catch로 넘어온다.
			e.printStackTrace(); //예외 메세지를 출력한다.
		} catch(NullPointerException e) { //이렇게 catch 뒤에 catch 만들 수 있다.
			//Null를 참조, Null안에서 뭔가 시도했다는 소리
			String str = null; //null이 들어있는데
			System.out.println(str.length()); //null를 호출?하는데 없으니 에러
		} catch (Exception e) {
			//모든 예외처리?를 할 수가 있다.
			//즉 IOException은 try...catch하거나 throw 해야 한다는 뜻이다.
		}
		
		test1();
		
		/*
		 * JVM
		 * - Method Area
		 * - Call Stack : 현재 호출되어 있는 메서드
		 * - Heap
		 */
		
		/*
		 * Call Stack에 돌고 있는 메서드 내용이 밑에 에러 내용들인데 최근에 실행된게 test2다.
		 * 
		 * 그리고 at 블라블라 적혀 있는건 위치를 말한다. 
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero 
		 * at h_exception.ExceptionHandling.test2(ExceptionHandling.java:66) <-가장 최근에 실행된 에러
		 * at h_exception.ExceptionHandling.test1(ExceptionHandling.java:62)
		 * at h_exception.ExceptionHandling.main(ExceptionHandling.java:52)
		 * 
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * 여기서
		 * java.lang.ArithmeticException 이거 누르면 breakpoint만 뜨는데
		 * 어디서 멈출 것인가 정하는거다.
		 * F11누르면 디버그인데(초록색 장수풍뎅이처럼 생김) 디버그가 한줄한줄? 실행시켜서 뜨는거다.
		 * 그리고 행번호 적힌곳에 더블클릭하면 브레이크 포인터 설정이 가능하다 무슨 파랑색 열매처럼 생긴건데
		 * 
		 * 에러들 창중에 밑에 내용대로 뜨는게 있는데
		 * at java.io.FileInputStream.<init>(FileInputStream.java:146)
		 * at java.io.FileInputStream.<init>(FileInputStream.java:101)
		 * 
		 * FileInputStream.java:101 클릭해서 들어가보면 FileInputStream내용?들이 들어가 있는 창이 뜬다.
		 * 그리고 뭔 코드내용들이 있는데 주석달린 내용들이다.
		 * 
		 */
		
		
		
		
		
		
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		
		
		
		try {
			new FileInputStream(" "); 
			//new FileInputStream(" "); 이거 하나만 적으면 에러나는데 예외처리 하지 않으면 이런 컴파일 에러가 발생하는데 이런 애들은 반드시 예외처리(예: try{}) 해줘야한다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * java.io.FileNotFoundException:   (지정된 경로를 찾을 수 없습니다)
	   at java.io.FileInputStream.open(Native Method) <----------------가장 최근에 생긴 에러
	   at java.io.FileInputStream.<init>(FileInputStream.java:146)
	   at java.io.FileInputStream.<init>(FileInputStream.java:101)
	   at h_exception.ExceptionHandling.test2(ExceptionHandling.java:95)
	   at h_exception.ExceptionHandling.test1(ExceptionHandling.java:89)
	   at h_exception.ExceptionHandling.main(ExceptionHandling.java:55)

	 */
	
	
	
	
	
	
	
	
	
	
	
	

}


























