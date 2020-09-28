package i_api;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
		 * - boolean : Boolean
		 * - char : Character
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 */
		
		Integer iw = new Integer(20);
		
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit"); // integer의 타입과 크기를 표현
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); //int타입의 최소~최대 범위
		
		int parseInt = Integer.parseInt("20"); //integer에 20이라는 문자를 넘김 int parseInt는 반드시 문자열안에 숫자가 포함되어야 한다. 다른게 들어 있으면 안됨
		
		ArrayList<Integer> list = new ArrayList<>(); 
		/* 
		 * ArrayList 배열인데 조금더 사용하기 편한 배열이라고 알면된다. 배열하고 똑같이 생겼으나 처음에 길이 지정을 하지않고 저장하면 저장한 만큼 길이가 늘어난다.
		 * ArrayList에는 객체만 저장이 가능하다. <>화살괄호안에 Integer가 들어가 있는데 제네럴?인데 어떤 데이터를 저장할 것인가하고 지정해주는거다.
		 * 그래서 ArrayList<Integer>는 Integer만 저장하게 된다.
		 * 배열의 길이도 한계가 있는데 인덱스를 지정할때 사용하는게 int인데 이는 int범위만 사용가능 그래서 int범위길이만큼 배열도 그 길이범위만 된다.
		 * 배열 크기를 지정할 수는 있는것 같은데 굳이 할 필요가 없다.
		 * Integer말고도 다른 타입도 다 같은 방법으로 사용이 가능하다.
		 * 
		 */
		
		list.add(new Integer(10));
		list.add(10); //오토박싱 : 기본형타입이 wrapper클래스로 자동 변환
		//int로도 저장할수 있다. 근데 int를 integer로 바꾸어서 저장 다만 생략해서 int를 저장하는것처럼 보인다.
		
		Integer integer = list.get(0); //해당 저장된? 값을 가져올수 있다.
		int i = list.get(0); //언박싱 : wrapper클래스가 기본형타입으로 자동 변환
		// get은 가져오는건데 get(0)은 파라미터 넘기는게 0 즉 0번 인덱스에 있는 값을 가져와라 의미이다.
		
		System.out.println(list);
		System.out.println(integer); // integer에 저장된 list값 출력
		System.out.println(i); // i에 저장된 list값을 출력
		
		
		
		
	}
	
	
	
	
	

}
















