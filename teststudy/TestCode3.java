package teststudy;

import java.util.Arrays;

public class TestCode3 {

	public static void main(String[] args) {
		int[] count = new int[10]; //10개짜리 배열 추가
		for(int i = 0; i < 500; i++) {
			int random = (int)(Math.random() * 10) + 1; //1부터 10까지 랜덤숫자
			count[random - 1]++;
			
		}
		
		System.out.println("횟수 : " + Arrays.toString(count));//1~10까지 발생된 숫자 횟수 부여

	}

}
