package i_api;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개 
		 * []	문자의 집합이나 범위([a-z]:a부터 z까지, [^a-z]:a부터 z가 아닌것)
		 * {}	앞 문자의 개수({2}:2개, {2,4}:2개 이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷문자의 대소문자가 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 * 
		 * --\?쓰면 정규표현식 ?가 아니라 문자?로 쓰이게 된다.
		 * 
		 */
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}"; //{}를 사용해서 앞에있는[a-z]글자의 갯수를 정해준다. [a-z]까지 어떤 글자든 글자가 3개 온다라는 의미이다. 
		//만약에 {1,3}이 {1, 3}이런식으로 공백이 들어가면 알파벳과 숫자사이 공백이 들어가 있다라는 의미이다.
//		String regex = "[a-z0-9]+"; //대괄호 안에 범위를 여러개 넣을 수 있다. 뒤에 갯수를 지정해야하는데 +로 지정한다. 갯수를 지정하지않으면 무족건 하나가 온다.
//		String regex = "\\w*";
		String regex = ".*"; //.은 어떤 문자와 상관없이 0개 이상이 온다.
		
		Pattern p = Pattern.compile(regex); //patter이라는 클래스에서 compile라는 메서드가 정규표현식을 해석한다.그리고 pattern이라는 객체에 돌려준다.
		Matcher m = p.matcher(str); //이제 여기에 p.matter()라는 메서드?에 넘겨주게 되면 매치시켜서 맞는지 틀리는지 확인하는게 그게 Matcher라는 객체이다
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
		
		//선생님이 한거
		//아이디 : [a-z0-9 -]{5, 20}
		//전화번호 : ^0\\d{1,3}-\\d{3,4}--\\d{4}
		//이메일주소 : [a-z0-9 -]{5, 20}@[a-zA-Z]+\\.(?i)(com|net|org([a-z]{2}\\.kr))
		
		
		//내가 한거 다만 숫자제한이 안되니 선생님이 하신거 감안해서 만들어야한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이뒤 입력(최대 20자리)>");
		String inputId = sc.nextLine();
		System.out.print("비밀번호 입력(최대10자리)>");
		String inputPw = sc.nextLine();
		System.out.print("닉네임 입력(최대10자리)>");
		String inputName = sc.nextLine();
		
		String regexId ="[a-z]{1,20}"; 
		String regexPw =".*{1,10}"; //이렇게 하게되면 앞에 문자를 2번 정하게 되므로 {1,10}이거는 의마가 없게 된다. 그러니 제한을 주고 싶으면 *를 빼고줘야한다.
		String regexName =".{1,10}";
		
		Pattern id = Pattern.compile(regexId);
		Matcher idM = id.matcher(inputId);
		Pattern pw = Pattern.compile(regexPw);
		Matcher PwM = pw.matcher(inputPw);
		Pattern Name = Pattern.compile(regexName);
		Matcher NameM = Name.matcher(inputName);
		System.out.println(idM.matches());
		System.out.println(PwM.matches());
		System.out.println(NameM.matches());
		
		
		
		
	}
	
	
	

}















