package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba alba = new Alba(); //변수 선언
		
		//알바가 주문을 바음
		String[] order = alba.order(); //String타입이라서 String로 받아줌
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리를 만드는 중....완성!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"};
		
		System.out.println(Arrays.toString(foods));//이 값은 위에 String[] foods = {"완성된 짜장면", "완성된 탕수육"};이거
		alba.serve(foods); //String 타입의 배열을 이렇게 넘겨준다.
		
		alba.pay(order);
		
		
		
		
		
	}

}









