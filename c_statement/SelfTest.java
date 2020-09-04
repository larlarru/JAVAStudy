package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		//탄수화물 중독 자가진단 테스트 체크 갯수에 따라 주의 위험 중독 ㅍ현하기 즉 자가진단 만들기

		System.out.println("탄수화물 중독 자가진단 테스트");
		
/*		Scanner sc =  new Scanner(System.in);
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다 \n o x 입력해 주세요 : ");
		String num1 = sc.nextLine();
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다 \n1.예 0번 아니오 :");
		String num2 = sc.nextLine();
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다 \n1.예 0번 아니오 :");
		String num3 = sc.nextLine();
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다 \n1.예 0번 아니오 :");
		String num4 = sc.nextLine();
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다 \n1.예 0번 아니오 :");
		String num5 = sc.nextLine();
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다 \n1.예 0번 아니오 :");
		String num6 = sc.nextLine();
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다. \n1.예 0번 아니오 :");
		String num7 = sc.nextLine();
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다 \n1.예 0번 아니오 :");
		String num8 = sc.nextLine();
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다 \n1.예 0번 아니오 :");
		String num9 = sc.nextLine();
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못 간다 \n1.예 0번 아니오 :");
		String num10 = sc.nextLine();
		
		String sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;*/
		
		int sum = 0;
		
		Scanner sc =  new Scanner(System.in);		
/*		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다 \n o x 입력해 주세요 : ");
		String ans1 = sc.nextLine();
		if (ans1.equals("o")){ sum++; } else if (ans1.equals("x")) { sum = sum + 0;}
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다 \no x 입력해 주세요 :");
		String ans2 = sc.nextLine();
		if (ans2.equals("o")) { sum++;} else if (ans2.equals("x")) { sum = sum + 0;}
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다 \no x 입력해 주세요 :");
		String ans3 = sc.nextLine();
		if (ans3.equals("o")) { sum++; } else if (ans3.equals("x")) { sum = sum + 0;}
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다 \no x 입력해 주세요 :");
		String ans4 = sc.nextLine();
		if (ans4.equals("o")) { sum++; } else if (ans4.equals("x")) { sum = sum + 0;}		
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다 \no x 입력해 주세요 :");
		String ans5 = sc.nextLine();
		if (ans5.equals("o")) { sum++; } else if (ans5.equals("x")) { sum = sum + 0;}
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다 \no x 입력해 주세요 :");
		String ans6 = sc.nextLine();
		if (ans6.equals("o")) { sum++; } else if (ans6.equals("x")) { sum = sum + 0;}
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다 \no x 입력해 주세요 :");
		String ans7 = sc.nextLine();
		if (ans7.equals("o")) { sum++; } else if (ans7.equals("x")) { sum = sum + 0;}
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다 \no x 입력해 주세요 :");
		String ans8 = sc.nextLine();
		if (ans8.equals("o")) { sum++; } else if (ans8.equals("x")) { sum = sum + 0;}
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다 \no x 입력해 주세요 :");
		String ans9 = sc.nextLine();
		if (ans9.equals("o")) { sum++; } else if (ans9.equals("x")) { sum = sum + 0;}		
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못 간다 \no x 입력해 주세요 :");
		String ans10 = sc.nextLine();
		if (ans10.equals("o")) { sum++; } else if (ans10.equals("x")) { sum = sum + 0;}
*/			
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다 \n o x 입력해 주세요 : ");
		String ans1 = sc.nextLine();
		if (ans1.equals("o")) {
			sum++;
		} else if (ans1.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다 \no x 입력해 주세요 :");
		String ans2 = sc.nextLine();
		if (ans2.equals("o")) {
			sum++;
		} else if (ans2.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다 \no x 입력해 주세요 :");
		String ans3 = sc.nextLine();
		if (ans3.equals("o")) {
			sum++;
		} else if (ans3.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다 \no x 입력해 주세요 :");
		String ans4 = sc.nextLine();
		if (ans4.equals("o")) {
			sum++;
		} else if (ans4.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다 \no x 입력해 주세요 :");
		String ans5 = sc.nextLine();
		if (ans5.equals("o")) {
			sum++;
		} else if (ans5.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다 \no x 입력해 주세요 :");
		String ans6 = sc.nextLine();
		if (ans6.equals("o")) {
			sum++;
		} else if (ans6.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다 \no x 입력해 주세요 :");
		String ans7 = sc.nextLine();
		if (ans7.equals("o")) {
			sum++;
		} else if (ans7.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다 \no x 입력해 주세요 :");
		String ans8 = sc.nextLine();
		if (ans8.equals("o")) {
			sum++;
		} else if (ans8.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다 \no x 입력해 주세요 :");
		String ans9 = sc.nextLine();
		if (ans9.equals("o")) {
			sum++;
		} else if (ans9.equals("x")) {
			sum = sum + 0;
		}
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못 간다 \no x 입력해 주세요 :");
		String ans10 = sc.nextLine();
		if (ans10.equals("o")) {
			sum++;
		} else if (ans10.equals("x")) {
			sum = sum + 0;
		}
		

		String res = null;
		
	
/*		if(sum == 3) {
			res = "주의! 위험한 수준은 아니지만 관리 필요";			
		} else if(sum >= 4 && sum <= 6) {
			res = "위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함";
		} else if(sum >= 7) {
			res = "중독! 전문의 상담이 필요함";
		} else {
			res = "문제 없습니다.";
		}*/
		
		switch(sum){
		case 0: case 1: case 2:
			res = "문제 없습니다.";
			break;
		case 3:
			res = "위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함";
			break;
		case 4: case 5: case 6:
			res = "주의! 위험한 수준은 아니지만 관리 필요";
		break;
		case 7: case 8: case 9: case 10:
			res = "중독! 전문의 상담이 필요함";
			break;
		}
		
		System.out.println(res);
	}

}
