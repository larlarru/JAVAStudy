package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, != //!=는 같지않다 즉 다르다라는 의미이다.
		 * - 문자열 비교 : equals()
		 * */
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean이다.
		System.out.println(b); //true값이 나온다.
		b = 10 <= 20 - 15; //산술연산 후 비교연산을 수행한다.
		System.out.println(b); //false 값이 나온다.
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다.
		/*String도 참조형 타입이다.
		 * 기본형?은 변수에 실제값을 저장한다.
		 * 참조형은 변수에 저장하는게 아니라 따로 저장하는데 그 주소를 변수에 저장한다.
		 * 그래서 str1은 주소가 들어가 있는거다 그래서 str1 str2 이 2개가 주소값이 같기 때문에 출력 값이 true가 나오게 되는거다.*/
		System.out.println(b); //true값이 나온다.
		
		//실제 문자를 비교하게 할려면
		//String의 내용을 비교하기 위해서는 equals()메서드를 사용하나.
		b = str1.equals(str2);
		System.out.println(b); //true
		b = !str1.equals(str2); //!가 부정이기 때문에 str1.equals(str2)는 같으네 부정하게 되서 false 값이 나오게 된다.
		System.out.println(b); //false
		
		//int타입의 x와 y변수를 만들고, 다음의 문장들을 코드로 작성해 주세요.
		int x=0;
		int y=0;
		//boolean z; 굳이 이걸 넣을 필요가 없다.
		
		//1. x가 y보다 크다.
		/*z = x > y;
		System.out.print(z);*/
		//답 : 
		System.out.print(x > y);
		
		//2. x +5 와y는 같다.
		/*z = x + 5 == y;
		System.out.print(z);*/
		//답 : 
		System.out.print(x + 5 == y);
		
		//3. y는 홀수이다.
		/*z = y == 1;
		System.out.print(z);*/
		//답 : 
		System.out.print(y % 2 == 1);
		
		//4. "변수"와 "데이터"는 같다.
		/*x = (char)("변수");
		z = x.equals(y);
		System.out.print(z);*/
		//답 : 
		System.out.print("변수".equals("데이터"));
		
	}

}



























