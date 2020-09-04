package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피로연산자로 boolean만 허용한다.
		*/
		
		boolean b = 5 < 20 && 15 % 2 == 0 || 0 >= 5; //비교연산이 먼저 되고 그다음에 논린연산이 연산된다.
		//&&(AND)가 ||(OR)보다 먼저 수행된다.
		// ||보다 &&의 우선순위가 높다.
		
		b = !(10 < 20); //조건식의 결과를 반대로 저장한다. !10 < 20 하게 되면 연산에 !가 붙어있는게 아니라 10에 !가 붙어 있게 된다(근데 숫자에는 붙을 수가 없다.).
		System.out.println(b);
		
		//효율적 연산
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		//왼쪽에서 false 결과가 나오면 오른쪽은 수행하지 않고 false로 정해진다.

		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		
		//int타입의 x와 y 변수를 만들고, 다음의 무장들을 코드로 작성해주세요.
		int x = 1, y = 2;
		
		//1. x가 y보다 크고, x가 10보다 작다.
		System.out.println(x > y && x < 10);
		
		//2. x가 3의 배수이거나, x가 5의 배수이다.
		System.out.println(x % 3 == 0 || x % 5 == 0);
		

	}

}











































