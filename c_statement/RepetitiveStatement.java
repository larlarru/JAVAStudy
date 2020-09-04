package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for 문
		 * - while 문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하게 해주는 무장
		*/
		
		for(int i = 1; i <= 10; i++) { //for문 안에 있는 변수 그래서 밖으로 나가게 되면 끝난다.
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i + "번째 반복");
			//초기화한 변수를 블럭안에서 사용할 수 있다.
		}
		
		//규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다.
		
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int i =1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >=1; i--) { //i가 1이상이 될때까지라는 증가이다
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지 짝수의 합을 출력해 주세요.
		sum=0; //그 값이 이상하게 크게 나오는데 그 이유는 위에서 나온 값 sum에다가 현재 식을 더하는것이기 때문에 0으로 초기화 시켜주고 다시 돌려야한다.
		/*for(int i = 1; i <= 100; i ++) {
			if(i%2 == 0) {
			sum += i;
			}
		}*/
		for(int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지의 홀수의 합을 출력
		sum = 0;
		/*for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}*/
		for (int i = 1; i <= 100; i += 2) {
				sum += i;
		}
		System.out.println(sum);
		
		//구구단 출력
		/*
		 * 2*1=2
		 * 2*2=4
		 * ...
		 * 
		*/
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + i * 2);
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("7 * " + i + " = " + i * 7);
		}
		
		//구구단 2단부터 9단까지 출력
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		for(int i = 1; i <= 9; i++) { 
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");				
			}
			System.out.println();
		}
		
		/*
		 * while문
		 * - while(조건식) {}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		*/
		
		int a = 1;
		//a에 2씩 몇번 곱해야 100이상이 되는지 알아봅시다.
		int count = 0;
		while(a < 1000) {
			a *= 2;
			count++;
			System.out.println(count + " : " + a);
		}
		
		/*
		 * do-while문
		 * - do{}while(조건식);
		 * - 최소한 한번의 수행을 보장한다.
		*/
		
/*		//숫자 맞추기 게임
		int answer = (int)(Math.random() * 100) + 1; //1~100 랜덤수
		int input = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("1 ~ 100 사이의 수를 입력해주세요>");
			input = Integer.parseInt(s.nextLine());
			
			if (answer < input) {
				System.out.println(input + "보다 작습니다.");
			} else if(input < answer) {
				System.out.println(input + "보다 큽니다.");
			} else {
				System.out.println("정답입니다.");
			}
		} while(input != answer);
*/		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		} //while문으로 바꾸기
			
		int i = 1;
		while(i <= 9) {
			int j =2;
			while(j <= 9) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
		//이름 붙은 반복문
		outer : for(i = 2; i <= 9; i++){ //for문에 outer라는 이름을 붙여준거다. 
			//이름 붙인 이유는 break outer;와 같이 사용하기 위해 붙이는 거다. 왜냐  j말고 i가 빠져나가게 하고 싶을때 break outer; 쓰면된다.
			for(int j = 1; j <= 9; j++){
				if(j == 5) { //이거 5는 j가 5가 되면 빠져나가라는 의미이다 그래서 반복문 돌리게 되면 j가 4까지만 나오고 빠져나가서 i를 증가시키고 다시 돌리고 빠져나가고 반복하게 된다.
					break;//가장 가까운 반복문 하나를 빠져나간다.
//					break outer; //outer라는 이름의 반복문을 빠져나간다.
//					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다. (현재 돌고 있는것만 빠져나간다. 예를들어 5만 건너뛰고 6,7,8,9뭐 이것만 실행시키겠다는 의미이다)
//					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
		for(i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1; i <= 5; i++) { //이 for문은 하나씩 증가시켜야하는데 j쪽 for문은 숫자를 정해주면 계속 그 숫자만큼 증가시켜서 하므로 하나씨 증가시키고 싶으면 계속 돌려야하니 i로 해줘야한다. j말고
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 5; i >= 1; i--) { //이 for문은 하나씩 증가시켜야하는데 j쪽 for문은 숫자를 정해주면 계속 그 숫자만큼 증가시켜서 하므로 하나씨 증가시키고 싶으면 계속 돌려야하니 i로 해줘야한다. j말고
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}












































