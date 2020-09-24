package i_api;

import java.util.Arrays;

//import d_array.Array;

public class StringClass {

	public static void main(String[] args) {
		
		
		/*
		 * api : 어떤 기능을 좀더 편하게 사용하는거?
		 */
		
		/*
		 * String
		 * - 여러개의 문자를 사용하기 쉽게 만들어 높은 클래스
		 * 
		 * String의 주요 메서드
		 * - equals() : 문자열의 내용이 같은지 반환한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
		 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
		 * - replace() : 문자열 내의 특정 문자를 다른 문자로 변경한다.
		 */
		 
		boolean equals = "문자열".equals("문자열"); //String에 저장된 문자열을 비교한다.
		//boolean으로 같나 안같냐 판단
		System.out.println(equals); //true로 출력됨
		
		/*quals 주의점 : 이 메서드는 .앞에 있는 문자열안에 있는 클레스>?를 참조한다. 
		 * 그래서()안에 NULL이여도 상관없는데 .앞에 있는 "문자열".는 NULL이면 안된다.
		 */
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2)); //false가 나온다. 1번에서 equlas를 호출해서 2번을 비교한다.
//		System.out.println(str2.equals(str1)); //이러면 에러가 난다. 왜냐 str2부분이 NULL이라서 오류가 난다.
		//null이 있을 수 있는 변수를 앞에 두지 않는다.
		
		String str = "12345";
		int length = str.length(); //문자열 내용의 길이를 반환 5개의 문자를 가지고 있다.
		for (int i = 0; i < length; i++) { 
			char charAt = str.charAt(i); //0번 인덱스면 1 1번 인덱스면2다. 배열 생각하면 편한다. 그리고 charAt는 문자를 반환해준다.
			System.out.println(charAt);
		}
		
		//문자열 뒤집기
		String rev = ""; //뒤집기 하기 위해 charAt를 뒤에서부터 하나씩 가져온다.
		for (int i = str.length() - 1; 0 <= i; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5, 8); //5번 인덱스부터 8번 인덱스 전짜기 잘라서 반환. ~이상 ~미만 느낌
		System.out.println(sub2); 
		
		/*substring 문자열을 일부 잘라서 문자열 반환해주는데 인덱스를 하나 넘길수 있고 2개 넘길수 있다.
		 *  하나면 시작인덱스를 넘긴다. 
		 *  그래서 끝까지 넘김. 
		 *  2개 넘기면 시작과 끝?을 잘라서 반환
		 */
		
		str = "수박 오렌지 귤 블루베리"; //0수1박2 3오렌지 귤 블루베리 이런느낌 즉 오렌지가 3번이라는 소리다
		int index = str.indexOf("오렌지"); //오렌지의 시작 인덱스를 반환한다.
		System.out.println(index);
		
		//substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = { //indexOf를 통해서 찾음 과일 끝날때 공백 있는데 그 공백 위치를 indexOf를 이용해 찾음 0번 인덱스와 공백 인덱스를 짤라서 찾는다.
				"수박 20000원", //0번 인덱스
				"오렌지 100000원", //1번 인덱스
				"귤 500원", //2번 인덱스
				"블루베리 3000원" //3번 인덱스
		};
		
		for (int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println("a" + name);
		}
		for (int i = 0; i < menu.length; i++) {
			/*String name = menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원")); //" "만 쓰면 공백 포함해서 출력되기 때문에 공백 다음에 있는걸 출력하기 위해 +1 해준다.
			int name1 = Integer.parseInt(name);*/
			int name1 = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원"))); 
			System.out.println(name1);
		}
		
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//오렌지가 메뉴의 몇번 인덱스에 있는지 찾기
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].contains("오렌지")) {
				System.out.println("오렌지는" + i + "번 인덱스에 있습니다.");
			}
		}
		
		str = "a/b/c";
		String[] split = str.split("/"); //split는 /이거 기준으로 나눈다. 그리고 배열 형태로 받아서 반환해준다.
		System.out.println(Arrays.toString(split));
		
		
		//메뉴명과 가격 나누기
		for (int i = 0; i < menu.length; i++) {
			String[] m = menu[i].split(" ");
			System.out.println("메뉴명 : " + m[0] + " / 가격 : " + m[1]);
		}
		
		str = " 문자열 ";
		String trim = str.trim(); //앞뒤 공백이 제거되서 출력된다.
		System.out.println("[" + str + "] => [" + trim + "]");
		
		//사용자의 실수로 아이디나 비밀번호 앞뒤에 공백이 들어가는 것을 방지하기 위해 사용할 수 있다.
		String id = " myid";
		String password = "mypassword ";
		System.out.println(id.trim()); //이렇게 .trim() 붙여주면 공백을 제거하고 출력된다.
		System.out.println(password.trim()); //이렇게 .trim() 붙여주면 공백을 제거하고 출력된다.
		
		int number = 10;
		str = number + ""; //number에 "" 즉 공백을 더해주면 문자열이 된다.
		str = String.valueOf(number);
		
		str = "123456789";
		str = str.replace("3", "짝"); //3이라는 글자를 짝으로 바꿔서 출력해준다.
		System.out.println(str);
		str = str.replace("6", "짝");
		str = str.replace("9", "짝");
		System.out.println(str);
		
		str = "banana";
		str = str.replace("a", "u");
		System.out.println(str);
		
		
	}
	
	
}


















