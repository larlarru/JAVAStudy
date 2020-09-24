package i_api;

import java.util.Arrays;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해 주세요.
		//1,000,000
		
		//선생님의 답
		System.out.print("숫자 입력 >");
		String number = ScanUtil.nextLine();
		String comma = "";
		int count = 0;
		
	/*	for (int i = number.length() - 1; i >= 0; i--) {
//			comma += number.charAt(i);
			//comma = comma + number.charAt(i);
			comma = number.charAt(i) + comma;
			count++;
			if (count %3 == 0 && count != number.length()) {
				comma = "," + comma;
			}
			
		}
		System.out.println(comma);*/
		System.out.println(comma);
		
		
		
/*		//밑에는 내가 한거
		System.out.print("숫자 입력 >");
		String input = ScanUtil.nextLine();
		
		System.out.println(input);
//		String s =  Integer.toString(input);
		String[] sa =new String[input.length()];
		String x = input;
//		boolean x = (input.length()%3 == 1);
		String sub = input.substring(0);
		System.out.println(sub.length());
		for (int i = 0; i < sa.length; i++) {
			if(input.length() >= 4) {
				sa[i] =  "," + input.substring(i);
			}			
		}
		System.out.println(Arrays.toString(sa));
		
		String rev = "";
		for (int i = input.length() - 1; 0 <= i; i--) {
			rev += input.charAt(i);
			if(input.length()%3 == 1) {
			rev += input.charAt(i) + ",";
			}
		for (int i = 0; i < input.length(); i++) {
			if(input.length() > 4) {
				if(input.length()%3 == 1 || input.length()%3 == 2) {
					sa[i] = input.substring(i+3) + ",";
				}
			}
			
			sa[i] = ;
		}
		String rev = "";
		for (int i = input.length() - 1; 0 <= i; i--) {
			rev += input.charAt(i);
			if(i%3 == 1 || i%3 == 2) {
				rev += "," + input.charAt(i);
			}
			}
//		System.out.println(sub);
//		System.out.println(Arrays.toString(sa));
		
		
		System.out.println(rev);
		
*/		
		
		
	}
	
	
	
	
	
	

}









