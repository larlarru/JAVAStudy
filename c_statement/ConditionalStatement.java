package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if(조건식){} :
		 * 다수의 조건이 필요할때 if 뒤에 추가한다. - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해
		 * 추가한다.
		 */

		// 정렬 : Ctrl + Shift + f

		int a = 1;

		if (a == 1) {
			System.out.println("조건식의 연살결과가 true이면 수행된다.");
		}

		if (a == 0) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}

		if (a == 1) {
			System.out.println("a가 1인 경우에 하고 싶은것"); // if 조건식이 한번 실행되면 무조건빠져나가고
													// 밑에거는 실행 안한다.
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고 싶은것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고 싶은것");
		} else {
			System.out.println("이외의 경우에 하고 싶은것");
		}
		/*
		 * if문은 하나하나 별개의 존재이기 때문에 if문이 여러개이면 여러개 실행된다. 그리고 조건이 같은게 여러개이면 그 여러개
		 * 실행한다. 왜냐하면 if문은 별개의 존재들이기 때문이다.
		 */

		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 성적에 등급을 부여하는 프로그램을 작성해주세요.
		score = 80;
		String grade = null; // 이 문장은 null값으로 초기화
		if (score <= 100 && score >= 90) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else if (score >= 60 && score < 70) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
		// null은 값이 없다라는 의미

		score = 97;
		grade = null;

		if (score >= 90) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}

		} else if (score >= 60) {
			grade = "D";
			if (score >= 67) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(grade);

		/*
		 * switch문 - switch(int/String){ case 1: break;} //break 만날때까지 실행 - 조건식의
		 * 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다. - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */

		a = 1;
		switch (a) {
		case 1:
			System.out.println("a가 1인 경우에 하고 싶은것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고 싶은것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고 싶은것");
			break;
		default:
			System.out.println("a가 1,2,3이 아닌 경우에 하고 싶은것");
		}
		// default는 switch에서 if의 else와 같은 역할을 한다. 즉 case외에 경우를 실행할 경우에 쓴다.

		String b = "a";
		switch (b) {
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고 싶은것"); // \"a\" 이거 역할이 ""를
														// 넣어주겠다는 의미이다.
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고 싶은것");
			break;
		default:
			System.out.println("그외의 경우에 하고 싶은것");
			break; // default 다음에 나오는 break는 있어도 그만 없어도 그만이다.
		}

		// 주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}

		System.out.println(month + "월 " + " 계절은 " + season + " 입니다.");

		score = 93;
		grade = null;
		switch (score / 10) { // 범위 설정이 안되서 성적을 할려면 많은 case가 필요하다. 그래서 나누기 10을 해서 구하면된다.
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";

		}
		System.out.println("성적은 " + score + " 등급은 " + grade + " 입니다.");
		
/*		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해 주세요.
		Scanner s =  new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(s.nextLine());
		
		if(num == 0) {
			System.out.println(num);
		} else {
			System.out.println("0이 아니다.");
		}
		
		switch(num){
		case 0:
			System.out.println(num);
			break;
		default:
			System.out.println("0이 아니다.");
		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		Scanner s1 =  new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = Integer.parseInt(s1.nextLine());
		
		String snum = null;
		switch(num/2) {
		case 0:
			snum = "짝수";
			break;
		default:
			snum = "홀수";
		}
		System.out.println(snum);
		
		if(num / 2 == 1) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		if(num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}*/
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		/*Scanner s =  new Scanner(System.in);
		System.out.print("성적1 입력 : ");
		double num1 = Double.parseDouble(s.nextLine());
		System.out.print("성적2 입력 : ");
		double num2 = Double.parseDouble(s.nextLine());
		System.out.print("성적3 입력 : ");
		double num3 = Double.parseDouble(s.nextLine());
		
		num1 = Math.round(num1 * 100) / 100.0;
		num2 = Math.round(num2 * 100) / 100.0;
		num3 = Math.round(num3 * 100) / 100.0;
		double sum = num1 + num2 + num3;
		double avg = sum/3.0;
		grade = null;
		
		avg = Math.round(avg * 100) / 100.0; //반올림 소수점셋째자리에서 반올림
		
		//블록지정하고 ctrl + f 누르면 찾기가 나오는데 find부분은 찾기 밑에 있는 re뭐ㅗ시기 적혀있는게 바꾸는 부분이다. 
		if (avg >= 90) {
			grade = "A";
			if (avg >= 97) {
				grade += "+";
			} else if (avg <= 93) {
				grade += "-";
			}
		} else if (avg >= 80) {
			grade = "B";
			if (avg >= 87) {
				grade += "+";
			} else if (avg <= 83) {
				grade += "-";
			}
		} else if (avg >= 70) {
			grade = "C";
			if (avg >= 77) {
				grade += "+";
			} else if (avg <= 73) {
				grade += "-";
			}

		} else if (avg >= 60) {
			grade = "D";
			if (avg >= 67) {
				grade += "+";
			} else if (avg <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("총점 : " + sum + " 평균 : " + avg + " 등급 : " + grade);
		//String num = null;
*/		
		
		Scanner s =  new Scanner(System.in);
		System.out.print("숫자1 입력 : ");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("숫자2 입력 : ");
		int y = Integer.parseInt(s.nextLine());
		System.out.print("숫자3 입력 : ");
		int z = Integer.parseInt(s.nextLine());		
		
		/*if(x > y) {
			int t= x;
			x = y;
			y = x;
			if(y > z) {
				int q = y;
				y = z;
				z = y;
			} else if(z > y) {
				int q = z;
				z = y;
				y = z;
			}
			if(x > z) {
				int r = z;
				x = z;
				z = x;
			}
		}*/
		
		if(x > y) {
			int t= x; //임시로 저장하는값 그래야 비교할때 문제가 안생긴다.
			x = y;
			y = t;
		}
		if(x > z) {
			int t = x;
			x = z;
			z = t;
		}
		
		if(y > z) {
			int t = y;
			y = z;
			z = t;
		}
		System.out.println(x + " , " + y + " , " + z);
		

	}
}




























