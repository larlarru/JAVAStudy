package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임
		/*3자리 숫자를 생각하고 내가 숫자를 맞추는거다
		 * 예를들어 135 숫자를 생가하면 내가 이걸 맞춰야한다.
		 * 135인데 123이라고 하면 위에와 아래숫자 비ㅛㄱ해서 스트라이크 볼 이렇게 판단
		 * 숫자오 자릿수가 같으면 스트라이크
		 * 숫자는 같은데 자릿수가 다르면 볼
		 * 아예 없는 숫자는 아웃
		 * 그래서 
		 * 135
		 * 123 : 1s(1스트라이크) 1B(볼) 1O(아웃)
		 * 345라고 예기하면 : 1s(1스트라이크) 1B(볼) 1O(아웃)
		 * 147라고 애기하면 : 1S 0B 2O  
		*/
		
		//1~9까지 3개 만드는데 중복되지 않게 하기
		//숫자 맞추기 게임
				int answer = (int)(Math.random() * 100) + 1; //1~100 랜덤수
				int input = 0;
				Scanner s = new Scanner(System.in);
				do {
					System.out.println(answer); //랜덤수 확인하기 위해 넣어둠
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

	}

}
