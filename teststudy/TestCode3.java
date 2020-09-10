package teststudy;

import java.util.Arrays;

public class TestCode3 {

	public static void main(String[] args) {
		//quiz1(); //퀴즈1번 메소드, 거스름돈의 동전 개수
		//quiz2(); //그래프 그리기
		quiz3(); //같은 숫자는 싫어
		//만약 복습할게 없어서 할게 없을 경우 quiz4(); //나누어 떨어지는 숫자 배열

		
	}

	private static void quiz4() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		/*
		 * 2 ~ 5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 따로 나누어진 값만 구함
		 * 5
		 * [5, 10, 15, 15, 20 , 25]
		 * 그다음에 구해진 배열 값을 정렬 시켜서 출력
		*/
		
	}

	// 같은 숫자는 싫어
	private static void quiz3() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println("랜덤 숫자 : " + Arrays.toString(arr));

		/*
		 * 1 ~ 5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		*/
		//선생님이 작성해주신 값
		int[] temp = new int[5];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < temp.length; j++) {
				if (arr[i] == temp[j]) { // 같은게 있는지 확인하기 위한 조건
					flag = true; // 같은게 하나라도 있으면 true선언
				}
			}
			if (!flag) { // 중복되지 않는 경우
				temp[count++] = arr[i]; // 임시로만든 배열 temp에다가 arr[i]값을 넣음
				// 위에 temp에 i와 j를 사용할 수 없으니 또다른 변수를 만들어줘야함
				// 그래서 중복되지 않는 값이 증가할때마다 count가 1씩 증가함
			}
		}
		System.out.println("중간 결과 : " + Arrays.toString(temp));
		System.out.println("중복 횟수 : " + count);

		// 위에처럼 하면 0값이 나오는데 이것을 처리하기 위해 배열 하나 새로 만듬
		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println("결과 : " + Arrays.toString(result));
	}

	//그래프 그리기
	private static void quiz2() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println("랜덤 숫자 : " + Arrays.toString(arr));

		/*
		 * 1 ~ 5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 각 숫자의 갯수를 세어서 *를 찍는다 숫자 표시도
		 * 
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2
		 * 4 : ***** 5
		 * 5 : * 1
		*/

		
		// 선생님의 답 코드
		// count 배열에 같은 숫자가 몇개인지 구하는 부분
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}

		// 그 같은 숫자가 몇개인지 출력 및 같은 숫자 갯수만큼 *표시하기
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + 1 + " : ");
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" " + count[i]);
		}
	}

	 //퀴즈1번 메소드, 거스름돈의 동전 개수
	private static void quiz1() {
		int money = (int)(Math.random() * 500) * 10; //0~499까지 랜덤숫자 0 ~ 4990까지 10곱해서 10 단위로 끊어져서 나옴
		int[] coin = { 500, 100, 50, 10 };
		System.out.println("거스름돈 : " + money);
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		*/
		
		//선생님이 하신 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력코드 내가 한것보다 단순하다
		//이렇게 변수하고 반복문 for문 쓰면 굳이 if문 쓸 필요없고 코드도 단순해짐 
		for(int i = 0; i < coin.length; i++) {
			int count = money / coin[i];
			System.out.println(coin[i] + "원 : " + count + "개");
			money = money % coin[i];
		}
/*		//선생님이 작성하신 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력코드 내가 한것보다 단순하다 이렇게 출력도 된다.
		int count = money / coin[0];
		System.out.println(coin[0] + "원 : " + count + "개");
		money = money % coin[0];
		count = money / coin[1];
		System.out.println(coin[1] + "원 : " + count + "개");
		money = money % coin[1];
		count = money / coin[2];
		System.out.println(coin[2] + "원 : " + count + "개");
		money = money % coin[2];
		count = money / coin[3];
		System.out.println(coin[3] + "원 : " + count + "개");
		*/

	}

}

















