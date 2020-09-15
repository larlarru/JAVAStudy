package e_oop.test;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Run alba = new Run(); //변수 선언
		
		//알바가 주문을 바음
		String[] order = alba.order(); //String타입이라서 String로 받아줌
		System.out.println(Arrays.toString(order));
		
		System.out.println("종합 교과목 준비 중....준비 완료!");
		String[] products = {};
		
		alba.serve(products); //String 타입의 배열을 이렇게 넘겨준다.
		
		alba.pay(order);
		
		
		
		
		
	}

}









