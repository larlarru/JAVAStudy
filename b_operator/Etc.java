package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 *  
		 * 기타 연산자
		 * - .(참조연산자) : 특정 범위 내에 속해 있는 맴버를 지칭할 때 사용한다.(예를들어 .out이면 out에 속해있다 라는것이다.)
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 : 조건식이 거짓일 경우(문장 ? 문장 : 문장 으로 앞에 내용대로 조건식이 true면 ? 조건식이 참일 경우인 
		 * 2번째 문장을 하고 첫번째 문장이 false이면 : 조건식이 거짓일 경우에 있는 세번째 문장을 한다.)
		*/
		
		//비트는 컴퓨터가 표현하는 가장 작은 단위
		//1byte : 01010101
		
		System.out.println(10 | 15); //| : 둘다 0인 경우 0 그외 1
		//10 : 00001010
		//15 : 00001111
		//     00001111 이렇게 두개의 숫자(10 과 15)를 비교해서 둘다 0이면 0 그외1는 일로해서 00001111로 값이 15가 나오게된다.
		
		int x = 10;
		int y = 20;
		int result = (x < y) ? x : y;
		System.out.println(result); // x < y가 true이기 때문에 x값인 10이 출력된다.
		
		//주민등록번호 뒷자리의 첫뻔째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = (regNo == 1) ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		/*int _a = 0;
		int _b = 0;
		int _result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 입력 : ");
		_a = Integer.parseInt(sc.nextLine());
		System.out.print("2번 입력 : ");
		_b = Integer.parseInt(sc.nextLine());
		_result = (_a < _b) ? _a : _b; //잘못됨
		// int _resut1_1 = int _result1 == (_c < _d) ? ((_c < _d) ? _c : "오류") : ((_c > _d) ? _d : "오류"); //이것도 아님
		System.out.println(_result);
		
		//답 : 
		System.out.print("1번 숫자 입력 : ");
		int _c = Integer.parseInt(sc.nextLine());
		System.out.print("2번 숫자 입력 : ");
		int _d = Integer.parseInt(sc.nextLine());
		System.out.println(_c > _d ? _c : _d);*/
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해 주세요.
		//그외에는 숫자를 입력하면 확인불가를 출력해주세요.
				
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		//gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		
		//String gender1 = (num1 == 1) ? "남자" : "여자";
		int gender2 = 3;
		int gender3 =2;
		int gender4 =4;
		String gender1 = (num1 == 1) ? "남자" : (gender2 == 3 ? "남자" : (gender3 == 2 ? "여자" : (gender4 == 4 ? "여자" : "확인불가")) );
		System.out.println(gender1); //제대로 안나옴
		
		//답 : 
		gender = num1 == 1 || num1 == 3 ? "남자" :
			(num1 == 2 || num1 == 4 ? "여자" : "확인불가");
		System.out.println(gender);
		

	}

}































