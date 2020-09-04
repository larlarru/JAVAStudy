package teststudy;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//2개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자 입력 : ");
		//double num1 = Integer.parseInt(sc.nextLine());
		double num1 = Double.parseDouble(sc.nextLine());

		System.out.print(" 연산자 입력(+, -, *, /) : ");
		String s = sc.nextLine();

		System.out.print(" 숫자 입력 : ");
		//double num2 = Integer.parseInt(sc.nextLine());
		double num2 = Double.parseDouble(sc.nextLine());

		/*String res = s.equals("+") ? num1 + num2 + "" 
				: (s.equals("-") ? num1 - num2 + "" 
						: (s.equals("*") ? num1*num2 + "" 
						: (s.equals("/") ? num1/num2 + "" 
						: "오류" ) ) );*/
		double res = s.equals("+") ? num1 + num2
				: s.equals("-") ? num1 - num2
				: s.equals("*") ? num1 * num2
				: num1 / num2;
		System.out.print("연산 결과 : " + res);
	}

}