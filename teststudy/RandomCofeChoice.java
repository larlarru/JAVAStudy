package teststudy;

import java.util.Arrays;
import java.util.Scanner;

public class RandomCofeChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//순서 정하기
		int[] num = new int[4];
		String[] name = new String[4];
		int[] res = new int[4];
		int money = (int)(Math.random() * 10000)+1;
		
		
		
		
		// 이름 입력
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 입력 >");
			String input = sc.nextLine();
			name[i] = input;
		}
		
			
		//랜덤 숫자 부여
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 4);
		}

		do {
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 4);
			}

		} while (num[0] == num[1] || num[0] == num[2] 
				|| num[0] == num[3] || num[1] == num[2]
				|| num[1] == num[3] || num[2] == num[3]);
		
		//결과 부여
		for (int i = 0; i < num.length; i++) {
			res[i] = (int) (Math.random() * 4);
		}
		
		
		

		
		
		//결과
		
		//커피값 범위
		do {
			money = (int)(Math.random() * 10000)+1;
		} while(money < 5000);
		
		money = Math.round((float)money / 100f) * 100;
		
		System.out.println("랜덤순서 : " + Arrays.toString(num));
		System.out.println("입력된 이름" + Arrays.toString(name));
		System.out.println("돈 범위" + money);
		System.out.println("결과 : " + Arrays.toString(res));

	}

}
