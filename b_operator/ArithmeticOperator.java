package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사직연산자 : +, -, *, /, %(나머지) //%는 몫 빼고 나머지 구해주는거
		 * - 복합연산자  : +=, -=, *=, /=, %=
		 * - 중간연산자 : ++, -- //1를 증가시키거나 감소시키겠다 라는 의미이다.
		*/
		
		int result = 10 + 20 - 30 * 40 / 50 % 60; //%도 나누기때문에 * / % 이걸 먼저 연산한다. 이거 다 연산하면 6 나온다.
		//곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		
		//나머지 연산
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해 주세요.
		//작성은 했는데 조금 복잡하게 했음
		/*int test1 = 10 + 5;
		System.out.println(test1);
		
		int test2 = 12 - 9;
		System.out.println(test2);
		
		int test3 = 10 * 5;
		System.out.println(test3);
		
		int test4 = 18 / 6;
		System.out.println(test4);
		
		int test5 = 15 % 8; //이렇게 연산하면 값이 7나옴 나머지값이니
		System.out.println(test5);
*/		
		//단순하게 5개 문장 작성할 경우(단 이렇게 쓸려면 int result라던지 변수 선언 해줘야 한다.)
		result = 10 + 3;
		System.out.println(result);
		result = 10 - 3;
		System.out.println(result);
		result = 10 * 3;
		System.out.println(result);
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		//이항연산자 : 양쪽에 있는 데이터 타입이 같아야만 연산을 할 수가 있다. 예를들어 10 % 3L이나 3f하면 안된다.(이항연산자는 3 +3 같은 2개가 있는 식?을 애기한다.)
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3; //result값을 3만큼 증가시키겠다?라는 의미다
		System.out.println(result);
		
		result += 3; //result = result + 3 나 result += 3; 이나 같다.
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		//이 연산값은 result = result +3;이거 시작전에 나오던 값으로 시작해서 계산한다.
		

		System.out.println("_________________________________________");
		
		//아래의 문장을 복합연사자를 사용한 문장으로 만들어 주세요.
		//result = result + 10;
		result += 10;
		System.out.println(result);
		
		//result = result - 2 * 3;
		/*result -= 2;
		result *=3;
		이렇게 만들면 안된다.*/
		result -= 2 * 3; //이렇게 만들면된다.
		System.out.println(result);
		
		//result = result % 5;
		result %= 5;
		System.out.println(result);
		
		//증감연산자
		//증감연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소 시킨다.
		int i = 0;
		
		//밑에처럼 ++i 앞이나 i++ 뒤처럼 붙이는 방법이 있다.
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i; //먼저 1 감소시키고 읽는다.
		i--; //읽고나서 1 감소시킨다.
		
		i = 0;
		System.out.println("++i : " + ++i); //먼저 1의 값을 증가시키고 읽는다.
		i = 0;
		System.out.println("i++ : " + i++); //읽고 출력한 후에 1을 증가시킨다. 즉 다음문장에서는 1이 증가된다.
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		//double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		//데이터가 작은쪽에서 더큰 쪽으로 형변환할때 문제가 없다.
		double result2 = (double)_int + _double; //이렇게 하면 둘다 double 타입이 된다.
		System.out.println(result2);
		
		byte _byte = 5;
		short _short = 10;
		//int result3 = _byte + _short; //int보다 작은 타입은 int로 형변환된다.
		//byte short는 1바이트 2바이트 인데 byte byte나 short short나 4바이트가 안되면 무족건 4바이트로 맞춰서 출력한다.
		int result3 = (int)_byte + (int)_short;
		System.out.println(result3);
		
		//오버플로우, 언더플로우
		//오버플로우 : 가장 큰값을 벗어나는것
		//언더 플로우 : 가장 작은값을 벗어나는것
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127; // byte : -128~127까지 표현이 가능하다
		b++;
		System.out.println(b); //127이 최대인데 1증가시켰기 때문에 매우 작은 값인 -128이 출력된다.(오버플로우)
		b--;
		System.out.println(b); //근데 앞에서 -128에서 -1시켰는데 그러면 -129인데 이럴경우 매우 큰 값으로 바뀌기 때문에 최대값인 127로 한다.(언더플로우)
		//타입을 선택할 때는 연산의 범위를 고려해야 한다.
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해 주세요.
		//1. 123456 + 654321
		//2. 1번 결과값 * 123456
		//3. 2번 결과값 / 123456
		//4. 3번 결과값 - 654321
		//5. 4번 결과값 % 123456
		
		//int로 할경우 0값이 안나오고 double로 해야지 제값이 나온다. 그 이유가 int는 7자리인가 까지만 되는데 연산값이 오버하기 때문에 int로 하면 안된다.
		double testResult = 0;
		testResult = 123456 + 654321;
		System.out.println("1번 값 :  " + testResult);
		testResult = testResult * 123456;
		System.out.println("2번 값 :  " + testResult);
		testResult = testResult / 123456;
		System.out.println("3번 값 :  " + testResult);
		testResult = testResult - 654321;
		System.out.println("4번 값 :  " + testResult);
		testResult = testResult % 123456;
		System.out.println("5번 값 :  " + testResult);
		
		//선생님이 한 소스
		double res = 123456 + 654321;
		res = res * 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		res %= 123456;
		System.out.println("res 값 : " + res);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int a1 = 2;
		int b1 = 3;
		int c1 = 4;
		a1 += b1 + c1;
		System.out.println(a1);
		a1 /= (a1 + b1 + c1);
		System.out.println(a1);
		
		//선생님이 한 소스
		int num1 = 15;
		int num2 = 34;
		int num3 = 49;
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;
		System.out.println(" 합계 : " + sum + " 평균 : " + avg);
		
		//반올림
		//avg = Math.round(avg);
		//System.out.println("반올림한값 : " + avg); //이렇게 하면 소수점 첫번째 자리에서 반올림하게 된다.
		//소수점을 땡겨서 반올림하고 다시 나누기해서 소수점을 뒤로 보내버리면 첫번째 자리수까지 표현된다.
		avg = Math.round(avg * 10) / 10.0; //근데 이렇게하면 둘다 int이기 때문에 소수점 첫번째 자리까지 안나온다.
		System.out.println(avg);
		
		//랜덤
		System.out.print((int)(Math.random() * 100) + 1);
		//Math.random() : 0.0 ~ 1.0미만
		/*1에서 부터 100까지의 수를 랜덤으로 발생시킨다. Math.random은 0에서 0.9999~까지 랜덤을 발생시켜준다.
		그래서 100을 곱하면 0~99까지 수가 되므로 여기다가 +1 하게 되면 1~100까지 된다. */
		
		
	}

}































