package e_oop;

public class Static {
	
	/*
	 * - static을 붙이면 프로그램 실행시 메모리에 올라간다.(객체생성전에 메모리에 올라간다)
	 * - 객체생성을 하지 않아도 사용할 수 있다.
	 * - static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * - static이 붙은 맴버의 명칭 : 클래스 변수, 클래스 메서드
	 * - static이 붙이 않은 맴버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	*/
	
	//변수에 static를 붙이는 이유는 값을 공유하기 위해 static을 붙인다.
	static int var;

	public static void main(String[] args) {
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDateMoney(200000);
		영희.saveDateMoney(200000); //위에 철수가 20만원 넣고 영희도 20만원 넣어서 20만 + 20만 = 40만으로 출력된다.
		
		System.out.print("문자열 입력> ");
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.print("숫자 입력> ");
		int num = ScanUtil.nextInt();
		System.out.println(num);
		
		/* Static 안붙은 변수? 경우 객체를 통해서 접근
		 * 예 : new Scanner(SYstem.in);이거는 Scanner객체
		 * 그래서 new Scanner(SYstem.in).nextLine();이렇게 해야 접근이 가능한데 <-객체 메서드?
		 * Static가 붙은 경우 객체가 아닌 클래스를 통해 접근한ㄷ.
		 * 예 : ScanUtil.nextLine(); <-클래스 메소드
		*/
		
	}

}


class Human{
	
	int account; //변수
	
	void saveMoney(int money){ //메서드, 저금하는 메서드
		account += money; //금액만큼 계좌 account에 적용
		System.out.println("통장 잔고 : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney(int money) { //값이 공유됨
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount);
	}
	
	
}





















