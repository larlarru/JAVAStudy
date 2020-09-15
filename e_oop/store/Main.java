package e_oop.store;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Store alba = new Store(); //변수 선언
		Scanner s = new Scanner(System.in);
		
		//알바가 주문을 바음
		String[] order = alba.order(); //String타입이라서 String로 받아줌
		System.out.println(Arrays.toString(order));
		System.out.print("물품 번호 입력 : ");
		int resList = Integer.parseInt(s.nextLine());
		System.out.println(resList);
		
		
		System.out.println("고른신 품목 확인중...");
		if(resList == 1) {
			System.out.println(" 연필 ");
		} else if(resList == 2) {
			System.out.println(" 팬 ");
		} else if(resList == 3) {
			System.out.println(" 종이 ");
		}
		
		String[] sums = {};
		
		alba.serve(sums); //String 타입의 배열을 이렇게 넘겨준다.
		
		alba.pay(order);
		
		
		
		
		
	}

}









