package h_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		
		/*
		 * finally
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수선언;변수선언) {} catch(Exception e) {}
		 * - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try블럭 종료시 자동으로 반환된다.
		 * 
		 */
		
		FileInputStream fis = null; //파일 읽기
		
		try {
			fis = new FileInputStream("d:/file.txt"); //d드라이브에 있는 file.txt를 읽겠다라는 의미다.
		} catch(Exception e) {
			e.printStackTrace();
		} finally { //예외가 발생하든 무족건 실행 즉 반드시 실행해야하는것이 있을때 finally 쓰면 된다.
			try {
				fis.close(); //그리고 항상 close해줘서 닫아줘야한다. 
				//그리고 finally에 fis.close(); 혼자 갔다두면 에러가 나느데 그러면 에러처리 try 해주면된다.
			} catch (Exception e) {
				e.printStackTrace(); 
			} 
		}
		
		
		//예외 발생 : try -> catch -> finally
		//예외 미발생 : try -> finally
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")) {
			String str = "아무내용이나 써보자...";
			
			byte[] bytes = str.getBytes();
			
			for (int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	

}


























