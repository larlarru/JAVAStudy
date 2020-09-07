package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임
		/*
		 * 3자리 숫자를 생각하고 내가 숫자를 맞추는거다 예를들어 135 숫자를 생가하면 내가 이걸 맞춰야한다. 135인데 123이라고
		 * 하면 위에와 아래숫자 비ㅛㄱ해서 스트라이크 볼 이렇게 판단 숫자오 자릿수가 같으면 스트라이크 숫자는 같은데 자릿수가 다르면
		 * 볼 아예 없는 숫자는 아웃 그래서 135 123 : 1s(1스트라이크) 1B(볼) 1O(아웃) 345라고 예기하면 :
		 * 1s(1스트라이크) 1B(볼) 1O(아웃) 147라고 애기하면 : 1S 0B 2O
		 */

		// 1~9까지 3개 만드는데 중복되지 않게 하기
		// 숫자 맞추기 게임

		int answerNum1 = (int) (Math.random() * 9) + 1;
		int answerNum2 = (int) (Math.random() * 9) + 1;
		int answerNum3 = (int) (Math.random() * 9) + 1;

		// 랜덤 중복 부여(숫자 중복 안되게 부여)
		do {
			if (answerNum1 == answerNum2) {
				answerNum2 = (int) (Math.random() * 9) + 1;
			} else if (answerNum1 == answerNum3) {
				answerNum3 = (int) (Math.random() * 9) + 1;
			} else if (answerNum2 == answerNum3) {
				answerNum3 = (int) (Math.random() * 9) + 1;
			}

		} while (answerNum1 == answerNum2 || answerNum2 == answerNum3
				|| answerNum1 == answerNum3);

		String answer1 = Integer.toString(answerNum1);
		String answer2 = Integer.toString(answerNum2);
		String answer3 = Integer.toString(answerNum3);

		// 숫자야구를 위한 스트라이크, 볼, 아웃 변수 선언
		int strike = 0;
		int ball = 0;
		int out = 0;
		int endStrikeCount = 3; //게임 끝내기 위한 스트라이크 누적수

		// 입력받는 숫자 1,2,3
		int inputNum1 = 0;
		int inputNum2 = 0;
		int inputNum3 = 0;

		Scanner s = new Scanner(System.in);
		do {
			strike = 0;
			ball = 0;
			out = 0;
/*			System.out.print(answerNum1); // 랜덤수 확인하기 위해 넣어둠
			System.out.print(answerNum2); // 랜덤수 확인하기 위해 넣어둠
			System.out.print(answerNum3 + "\n"); // 랜덤수 확인하기 위해 넣어둠
			System.out.println(answer1 + answer2 + answer3); // 랜덤수 확인하기 위해 넣어둠
*/
			System.out.print("숫자 1(1~9까지의 수를 입력해주세요) : ");
			inputNum1 = Integer.parseInt(s.nextLine());
			System.out.print("숫자 2(1~9까지의 수를 입력해주세요) : ");
			inputNum2 = Integer.parseInt(s.nextLine());
			System.out.print("숫자 3(1~9까지의 수를 입력해주세요) : ");
			inputNum3 = Integer.parseInt(s.nextLine());

			//첫번째 숫자 answerNum1 스트라이크, 볼, 아웃 판단 부분
			if (answerNum1 == inputNum1) { //스트라이크 판정
				strike++;
			} else if (answerNum1 == inputNum2) { //볼 판정
				ball++;
			} else if (answerNum1 == inputNum3) { //볼 판정
				ball++;
			} else if (answerNum1 != inputNum1) { //아웃 판정
				out++;
			} else if (answerNum1 != inputNum2) { //아웃 판정
				out++;
			} else if (answerNum1 != inputNum3) { //아웃 판정
				out++;
			}
			
			//두번째 숫자 answerNum2 스트라이크, 볼, 아웃 판단 부분
			if (answerNum2 == inputNum2) { //스트라이크 판정
				strike++;
			} else if (answerNum2 == inputNum1) { //볼 판정
				ball++;
			} else if (answerNum2 == inputNum3) { //볼 판정
				ball++;
			} else if (answerNum2 != inputNum1) { //아웃 판정
				out++;
			} else if (answerNum2 != inputNum2) { //아웃 판정
				out++;
			} else if (answerNum2 != inputNum3) { //아웃 판정
				out++;
			}
			
			//세번째 숫자 answerNum3 스트라이크, 볼, 아웃 판단 부분
			if (answerNum3 == inputNum3) { //스트라이크 판정
				strike++;
			} else if (answerNum3 == inputNum1) { //볼 판정
				ball++;
			} else if (answerNum3 == inputNum2) { //볼 판정
				ball++;
			} else if (answerNum3 != inputNum1) { //아웃 판정
				out++;
			} else if (answerNum3 != inputNum2) { //아웃 판정
				out++;
			} else if (answerNum3 != inputNum3) { //아웃 판정
				out++;
			}
			System.out.println("내가 입력한 숫자 : " + inputNum1 + inputNum2 + inputNum3);
			System.out.println("내가 입력한 숫자 결과 : " + strike + "S " + ball + "B " + out + "O");
			
			//end를 위한 부분
			if(strike == 3) {
				System.out.println("정답입니다.");
				System.out.println("문제낸 숫자 : " + answer1 + answer2 + answer3); // 랜덤수 확인하기 위해 넣어둠
			}
		} while (strike != endStrikeCount); //숫자 맞추면 3스트라이크가 되서 끝나는거니 그거에 맞게 적기 스트라이크 누적수

	}
}
