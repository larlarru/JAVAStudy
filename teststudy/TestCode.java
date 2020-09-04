package teststudy;

import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
		
		//숫자 맞추기 게임
				int answer = (int)(Math.random() * 100) + 1; //1~100 랜덤수
				int input = 0;
				Scanner s = new Scanner(System.in);
				do {
					System.out.println(answer);
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
