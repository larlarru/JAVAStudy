package 김강영;

import java.util.Scanner;

public class ScanUtil {
	
	//메서드에 static 붙이는 경우 utill일 경우
	//어떤 기능을 좀더 편하게 만들어 주는걸 utill메서드(?)
	//nextInt같은걸 오류나니 좀더 편하게 사용하기 위해 utill?사용
	
	private static Scanner s = new Scanner(System.in);
	
	/*유틸리티성향 : 숫자를 입력받을 때 Scanner 생성해서 숫자로 형변화 해야 숫자를 입력받을 수 있는데 public static int nextInt()메서드를 선언하고 
	 * int num = ScanUtil.nextInt();
	 * System.out.println(num);
	 * 이렇게 선언해서 사용하는데 즉 자주 사용되고 많이 사용되는 어떤 기능들
	*/
	//유틸리티 성향의 메서드인 경우 static을 붙인다
	public static String nextLine() { //객체 생성을 하지않고 사용할려고
		return s.nextLine(); //nextLine실행 입력받은것을 문자열로 출력
	}
	
	public static int nextInt() {
//		Math.random()
//		Math.round(a)
		return Integer.parseInt(s.nextLine());
	}

}



















