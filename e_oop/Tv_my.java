package e_oop;

import java.util.Scanner;

public class Tv_my {
	
	/*
	 * Tv 여러 속성이 있는데 속성을 변수로 만들면 됨 
	 * Tv 속성 : 채널, 음향, tv전원
	 * 
	 * 속성을 변수로 만들고 그걸 조작할 메소드 만들기
	 * 전원 변경 메소드 : 전원 버튼 하나 메소드 하나 만들어서 전원 껏다켜기 만들기
	 * 채널 매소드 : 변경 방법은 3가지 1. 채널 직접 입력해서 변경, 2. 채널을 1씩 증가, 3. 채널을 1씩 감소
	 * 볼륨 즉 음향 : 음향을 올리거나 내리거나 2개 버튼 그래서 2개 메소드 만들기
	 * 
	 * 그래서 6개 메소드 만들면 됨
	*/
	
	//채널
	
	//음향
	
	//tv전원



	public static void main(String[] args) {
		String p;
		String a;
		String b;
		int soundInput = ScanUtil.nextInt();
		System.out.print("TV 전원 여부(키기(start), 끄기(end))> ");
			
			String powerInput = ScanUtil.nextLine();
			System.out.print("채널 입력> ");
			int chInput = ScanUtil.nextInt();
			System.out.print("음향 크기 입력> ");
			//System.out.println("채널 입력 확인 " + chInput);

			// 채널
			ch ch = new ch();
			ch.chNum(chInput);
			sound sound = new sound();
			sound.soundVal(soundInput);
			/*if(chInput.equals('+')) {
				ch.chNum++;
			} else if(chInput.equals('-') && ch.chNum > 0) {
				ch.chNum--;
			}*/
			//System.out.println("확인 : " + ch.chNum);
			a = "start";
			b = "end";
			p = powerInput;
			//if()
		
	}
	
	
	
	
	
}


class ch {
	int chNum = 0;
	void chNum(int chNumber){ 
		chNum += chNumber; 
		System.out.println("채널 " + chNum + "번 으로 이동");
	}
	
}

class sound {
	int soundVal = 0;
	void soundVal(int soundValNum){ 
		soundVal += soundValNum; 
		System.out.println("음향 크기 " + soundVal + "으로 설정");
	}
	
}











