package i_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateClass {

	public static void main(String[] args) {
		
		Date today = new Date(); //java.util과 java.sql이 있는데 java.sql는 sql 데이터 타입의 것을 가져온다.
		System.out.println(today); //기본적으로 현재 날짜와 시간이 저장되어있는걸 출력한다.
		
		//날짜 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); //SimpleDateFormat에 값을 넘겨줌 sql로 치면 TO-DATE라고 보면된다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS"); //ss는 초 .SSS는 초를 천분의 1초 단위로 표현한다.
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //년월일시분초 표현
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss a"); 
		//yy는 년도중에 뒤에 2자리만 표현 dd(E)는 요일 표현 hh는 12시간 기준으로 표현 오전과 오후 구별해서 표현을 위해 a(오전 아마 am인듯)를 넣어줌
//		SimpleDateFormat sdf5 = new SimpleDateFormat("yy-MM-dd(E) a hh:mm:ss"); //이러면 오전 다음에 시분초가 표현된다. 
		
		System.out.println(sdf1.format(today)); //format형식의 문자열로 반환
		System.out.println(sdf2.format(today)); //format형식의 문자열로 반환
		System.out.println(sdf3.format(today)); //format형식의 문자열로 반환
		System.out.println(sdf4.format(today)); //format형식의 문자열로 반환
//		System.out.println(sdf5.format(today)); //format형식의 문자열로 반환
		
		//문자열 -> 날짜
		String str = "1987년 05월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str); //String str와 SimpleDateFormat sdf5가 둘다 같지 않아서 에러가난다. 그래서 try catch를 써서 해결한다. 
			System.out.println(dateStr); //시간을 설정하지 않아씩 때문에 0000이 들어간다.
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴
		//객체를 만들어서 리턴을 해주는데
//		Calendar cal = Calendar.getInstance(); //싱글톤 패턴
		//위처럼 2번 객체 했는데 안에 있는것만 사용한다. 그러니 2번 할필요가 없다.
//		new Date(); //각각의 고유한 객체가 된다.
		
		cal.setTime(new Date());
		cal.set(2020, 8, 29); //2020/09/29(월은 0부터 시작)
		
		System.out.println(cal.getTime());
		
		//날짜계산
		cal.add(Calendar.YEAR, 1); //현제 Calendar년도에 1을 더하는거다.
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3); //빼고 싶으면 음수 넣으면된다.
		cal.add(Calendar.HOUR, 4); //시간에 4시간 더한다.
		cal.add(Calendar.MINUTE, 10);
		cal.add(Calendar.SECOND, -15);
		
		
		System.out.println(sdf3.format(cal.getTime()));
		
		
		
	}
	
	
	
	
	
	

}














