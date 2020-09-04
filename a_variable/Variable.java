package a_variable;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		/*// 클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		// 메서드 : 명령문의 집합
		// main메서드 : 프로그램의 시작과 끝

		// 주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
		// 한줄 주석 : CTRL + SHIFT + c 블럭지정하고 이 키를 누르면 여러개 한줄 주석이 만들어진다.
		
		 * 범위 주석 : Ctrl + Shift + /(해제할 경우 \ 누르면된다.) 다만 블럭 지정하고 해당키를 눌러야만 만들어진다.
		 * 범위주석
		 * 범위주석
		 * 범위주석
		 
		
		
		 * 데이터 종류
		 * - 정수 : 10, -5
		 * - 실수 : 3.15. -1.5
		 * - 문자 : 'a', '3'
		 * - 논리 : true, false
		 * 
		 * 프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여놓았다.
		 * (자료형/Data Type)
		 * 
		 * 기본형 타입
		 * - 정수 : byte(1), short(2), *int(4), long(8)
		 * - 실수 : float(4), *double(8) //숫자 정확하게 포현 못하게 근사치로 표현한다. float는 7자리 double는 15자리를 표현
		 * - 문자 : char(2) //글자 한글자 표현
		 * - 논리 : boolean(1) //true 혹은 false 표현
		 * 
		 * 데이터 타입은 변수를 만들때 주로 사용한다.
		 * 
		
		//상수 : 값이 변하지 않는 데이터(예 : 10, -5)
		//변수 : 값이 변하는 데이터(예 : x, y)
		//변수를 만들고 변수를 조작해서 원하는 결과를 만들어내는 것이 프로그래밍의 전부라 할 수 있다.
		
		//변수를 만드는 것 : 변수 선언
		//변수를 만드는 방법 : 데이터타입 변수이름(데이터 타입 쓰고 변수이름 넣어주면 변수를 만드는것이다.)
		int name; //(예를들어 이렇게 데이터 타입 인트인 name이라는 변수를 만들 수 있다.)
		
		//데이터타입을 선택할 때는 표현하고자 하는 데이터에 맞는 타입을 선택해주면 된다.
		//변수 이름을 정할때는 표현하고자 하는 데이터의 의미와 부합하는 이름을 지어주면 된다.
		double pi; //예시
		
		//long name; //한 블럭({}) 안에서 변수의 이름은 중복될 수 없다.
		//빨간줄이 생긴거면 뭔가 문제가 있는거다. 컴파일 문제인데 컴파일은 컴터가 알아먹게 번역해주는것 문제는 같은 변수 이름 중복이라서 문제이다.
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		pi = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30; //보통 선언과 초기화를 동시에 한다.
		long l = 40L; //접미사 L을 붙여야 long타입이 된다. L을 안붙이면 int타입이 된다. 헷갈릴 수도 있기 때문에 대문자 사용한다.
		//40뒤에 있는 L이 접미사라고 롱타입이라고 알려주는거다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; //따옴표 안에 한글자만 넣어야 한다.
		//만약 char c = '한글'; 이렇게 두글자 넣으면 오류가 나게되니 한글자만 넣어줘야한다.
		boolean b = true; //true, false
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		int a = 1;
		long a1 = 5L;
		double b1= 1.0;
		float c1 = 4.0F;
		char d = 'a';
		boolean e = false;
		float e1 = 12f;
		boolean t = true;
		
		byte _byte = 20;
		short _short = 10;
		
		System.out.println(name); //가로안에 있는 값을 출력 그래서 name이라는 값을 출력
		//실행 : Ctrl + F11
		
		name = 100; //기존의 10값이 사라지고 100이라는 값이 들어가게됨
		System.out.println(name); //그리고 name값이 100으로 출력됨
		
		//위에서 만든 8개의 변수에 새로운 값을 저장하고 출력
		System.out.println(a);
		a = 5;
		System.out.println(a);
		
		System.out.println(a1);
		a1 = 8L;
		System.out.println(a1);
		
		System.out.println(b1);
		b1 = 3.5;
		System.out.println(b1);
		
		System.out.println(c1);
		c1 = 5.0F;
		System.out.println(c1);
		
		System.out.println(d);
		d = 'd';
		System.out.println(d);
		
		System.out.println(e);
		e = true;
		System.out.println(e);
		
		System.out.println(e1);
		e1 = 2F;
		System.out.println(e1);
		
		System.out.println(t);
		t = false;
		System.out.println(" 바꾼 후 " + t);
		
		
		 * 타입의 선택 기준
		 * 
		 * 정수
		 * - byte, short : 메모리를 절약해야 할때
		 * - int : 기본 (int 범위 : -20억 정도까지 표현한다.)
		 * - long : int의 범위를 벗어날 때(범위가 -20억이 넘어갈때 long 씀) long 범위도 있는데 약 900경 정도이다.
		 * 
		 * 실수
		 * - float : 메모리를 절약해야 할때 (정확도보다 메모리를 절약하고 싶을 때) int보다 더 큰 숫자를 표현할 수 있다. 같은 4byte인데 그리고 long보다 더 크게 표현한다.
		 * 				소수점 위치가 어디인지 따로 저장한다. 그래서 굉장히 큰 숫자를 저장 할 수 있다.
		 * - double : 기본
		
		
		//문자열
		String str = "문자 여러개를 표현"; //String이라는 클래스
		System.out.println(str);
		
		//클래스는 반드시 앞에 대문자로 표현한다.
		
		
		//형변화
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변견ㅇ해 주어야 한다.
		//이름 형변환(type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		//small = big; //small는 int타입인데 big은 롱타입으로 타입이 안맞아서 오류가 난다.
		small = (int)big; //타입이 다른 2개를 쓰면 오류가 나니 오른쪽 변수 앞에다가 ()하고 왼쪽 변수와 같은 타입을 써준다.
		big = small; //표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다. 
		//더 작은 타입의 값을 더 큰 타입에 변수를 저장할때는 형변화를 생략할 수 있다.
		//큰 타입이 작은 타입으로 가게되면 데이터 손실이 있을 수 있기 때문에 반드시 형변환해서 넣어줘야한다.
		
		
		 * 명명 규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [낙타식 표기볍을 사용한다.(mySampleVariable)] //낙타식이란 새로운 글자가 시작할때마다 대문자를 써주는거다.
		 * 	[] 이거는 개발자가 암묵적으로 이렇게 쓴다고 정하는거다.
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)] //즉 클래스는 대문자로 시작하고 아닌건 소문자로 시작한다.
		
		
		int test1 = 1; //예약어는 그러니까 int처럼 찐한게 예약어이다.
		
		
		 * 상수
		 * - 처음 담긴 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다. //리터럴이라는 변경되지 않는 상수?를 의미한다.
		
		
		//리터럴은 수학에서 사용하는 상수 (변하지 않는) 데이터 그 자체 값
		final int MAX_NUMBER = 10; //10이라는 숫자의 의미를 알려주는 MAX_NUMBER 붙여주면 최대값을 알수 있는데 그럴걸 위해 상수 사용
		//상수는 구별하기 위해 모두 대문자를 사용
		//MAX_NUMBER = 100; //이렇게 입력하면 컴파일러 에러 발생
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.");
		System.out.print("\n 이걸 넣으면 줄바꿈이 된다."); //\n은 줄바꿈
		System.out.println("줄바꿈을 한다. \td" + name); //\t는 탭이다. + 변수하면 출력하는 변수가 추가된다.
		System.out.printf("문자열 : %s, 숫자 : %d", "Hello", 10); //출력 포멧을 지정한다. %는 이 위치에 뭔가를 넣겠다는 의미이다.
		//이 printf도 따로 줄바꿈을 해주지 않는다.
		
		System.out.println();
		System.out.println("A" + 100); //문자와 숫자를 같이 사용할때 주의할점이 다른 타입들이 문자열을 만나게 되면 모든 타입은 문자열로 바꾼다.
		//즉 100이라는 숫자가 문자열 A 만나게 되면 문자열 100으로 바뀌게 된다. 그래서 출력하면 A100이 나오는데 이게 A100이라는 문자열이 된다.
		
		//뭐가 먼저냐에 따라 값이 달라진다 밑에 처럼
		System.out.println(10 + 20 + "30");
		System.out.println("10" + 20 + 30);
		System.out.println("10" + (20 + 30)); //가로를 쳐주면 가로부터 먼저 계산한다.
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스 	//에러 발생할 이유가 어디에 있는 클래스인지 모르기 때문에 오류가남
		//그래서 import java.util.Scanner; 추가해주면된다. package와 public class 사이에
		//import 단축키 : Ctrl + Shift + o 누르면 생긴다.
		System.out.println("아무거나 입력해주세요.>>"); //이거쓰면 입력을 할 수가 있다.
		//sc.nextLine(); //nextLine이라는 메소드 호출 //사용자가 입력을 하고 엔터를 치면 여기서부터 다시 시작한다.
		//sc.nextLine이 입력을 받으면 문자열로 돌아온다.
		String str2 = sc.nextLine(); //입력받은거다. 입력받은거 저장?
		System.out.println("입력 받은 내용 : " + str2);
		
		//int nextInt = sc.nextInt();
		//double nextDouble = sc.nextDouble();
		//이런것들이 있지만 버그로 인해 사용하지 않는다.
		
		System.out.println("int 입력>");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		System.out.println("문자열 입력>");
		String nextLine = sc.nextLine(); //문자를 입력받는곳 여기서 엔터가 사용도기ㅣ 때문에 다음게 입력이 안됨 그래서 문자열이 입력이 안됨
		System.out.println(nextLine);
		System.out.println("입력끝");
		//그래서 nextInt쓰지 않는게 좋고 그냥 문자열을 숫자로 바꿔준다.
		
		System.out.println("int 입력>");
		int number = Integer.parseInt(sc.nextLine()); //숫자는 이렇게 받는다. 그래서 문자로 받은걸 숫자로 바꿔준다.
		//double.parseDouble(sc.nextLine()); 로 해주면 double를 쓸 수 있다.
		System.out.println(number); //그래서 숫자로 바꿔진걸 출력한다.
*/		
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		String myName;
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아 주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 해주세요. >"); //입력할때 주의점이 println이라서 커서가 밑에쪽에 있는거라 위에다가 하면 오류가 날 수 있느이 println는 주의하는ㄱ 좋다.
		myName = sc.nextLine();
		System.out.println("입력받은 내용 : " + myName);
		
		//자신의 나이를 저장할 변수를 선언해 주세요.
		int myAge;
		
		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아 주세요
		//Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 >> ");
		myAge = Integer.parseInt(sc.nextLine()); //Integer.parseInt(); 이거 찾아서 내용정리하기
		
		//위에서 입력받은 이름과 나이를 출력해 주세요.
		System.out.println("이름 : " + myName + " " +  "입력 받은 나이 : " + " " + myAge);
		System.out.println("이름 : " + myName + "\n" +  "입력 받은 나이 : " + " " + myAge);
		
		
		
	}

}





























