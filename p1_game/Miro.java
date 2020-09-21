package p1_game;

import java.util.Arrays;

//import e_oop.ScanUtil;
import p1_game.ScanUtil;

public class Miro {
	
	
	int chioce1;
	int chioce2;
	int chioce3;
	int chioce4;
	int chioce5;
	int[] ranArr;
	int[] tempArr;
	int ranNum1;
	int ansNum;

	Miro() {
		this.ranArr = new int[5];
		this.tempArr = new int[5];
//		this.ranNum1 = (int)(Math.random() * 101);
		this.ansNum = (int)(Math.random() * 5);

	}
	
	void start() {
		int input = 0;
/*		do {
			for (int i = 0; i < this.ranArr.length; i++) {
				this.ranArr[i] = (int)(Math.random() * 5);
			}
		} while (this.ranArr[0] == this.ranArr[1] || this.ranArr[0] == this.ranArr[2]
				|| this.ranArr[0] == this.ranArr[3] || this.ranArr[0] == this.ranArr[4]
				|| this.ranArr[1] == this.ranArr[2] || this.ranArr[1] == this.ranArr[3]
				|| this.ranArr[1] == this.ranArr[4] || this.ranArr[2] == this.ranArr[3]
				|| this.ranArr[2] == this.ranArr[4] || this.ranArr[3] == this.ranArr[4]);
		
		do {
			for (int i = 0; i < this.tempArr.length; i++) {
				this.tempArr[i] = (int) (Math.random() * 5);
			}
		} while (this.tempArr[0] == this.tempArr[1]
				|| this.tempArr[0] == this.tempArr[2]
				|| this.tempArr[0] == this.tempArr[3]
				|| this.tempArr[0] == this.tempArr[4]
				|| this.tempArr[1] == this.tempArr[2]
				|| this.tempArr[1] == this.tempArr[3]
				|| this.tempArr[1] == this.tempArr[4]
				|| this.tempArr[2] == this.tempArr[3]
				|| this.tempArr[2] == this.tempArr[4]
				|| this.tempArr[3] == this.tempArr[4]);
		
		
		System.out.println(Arrays.toString(this.ranArr));
		System.out.println(Arrays.toString(this.tempArr));
		System.out.println(this.ansNum);
		*/
		miro : while (true) {
			do {
				for (int i = 0; i < this.ranArr.length; i++) {
					this.ranArr[i] = (int)(Math.random() * 5);
				}
			} while (this.ranArr[0] == this.ranArr[1] || this.ranArr[0] == this.ranArr[2]
					|| this.ranArr[0] == this.ranArr[3] || this.ranArr[0] == this.ranArr[4]
					|| this.ranArr[1] == this.ranArr[2] || this.ranArr[1] == this.ranArr[3]
					|| this.ranArr[1] == this.ranArr[4] || this.ranArr[2] == this.ranArr[3]
					|| this.ranArr[2] == this.ranArr[4] || this.ranArr[3] == this.ranArr[4]);
			
			do {
				for (int i = 0; i < this.tempArr.length; i++) {
					this.tempArr[i] = (int) (Math.random() * 5);
				}
			} while (this.tempArr[0] == this.tempArr[1]
					|| this.tempArr[0] == this.tempArr[2]
					|| this.tempArr[0] == this.tempArr[3]
					|| this.tempArr[0] == this.tempArr[4]
					|| this.tempArr[1] == this.tempArr[2]
					|| this.tempArr[1] == this.tempArr[3]
					|| this.tempArr[1] == this.tempArr[4]
					|| this.tempArr[2] == this.tempArr[3]
					|| this.tempArr[2] == this.tempArr[4]
					|| this.tempArr[3] == this.tempArr[4]);
			
			
			System.out.println(Arrays.toString(this.ranArr));
			System.out.println(Arrays.toString(this.tempArr));
			System.out.println(this.ansNum);
			System.out.println("1.미로선택1\t2.미로선택2\t3.미로선택3\t4.미로선택4\t5.미로선택5\t6.종료");
			input = ScanUtil.nextInt();
			int temp =0;
	/*		if (this.ansNum == this.ranArr[0] 
				|| this.ansNum == this.ranArr[1]
				|| this.ansNum == this.ranArr[2]
				|| this.ansNum == this.ranArr[3]
				|| this.ansNum == this.ranArr[4]) {
				break miro;
			}*/

			switch (input) {
			case 1:
				temp = this.tempArr[0];
				if (this.ansNum == this.ranArr[temp]) {
					System.out.println("맞췄습니다.");
						break miro;
					} else if (this.ansNum != this.ranArr[temp]) {
					System.out.println("실패했습니다.");
					} 
				break;
			case 2:
				temp = this.tempArr[1];
				if (this.ansNum == this.ranArr[temp]) {
					System.out.println("맞췄습니다.");
						break miro;
					} else if (this.ansNum != this.ranArr[temp]) {
					System.out.println("실패했습니다.");
					} 
				break;
			case 3:
				temp = this.tempArr[2];
				if (this.ansNum == this.ranArr[temp]) {
					System.out.println("맞췄습니다.");
						break miro;
					} else if (this.ansNum != this.ranArr[temp]) {
					System.out.println("실패했습니다.");
					} 
				break;
			case 4:
				temp = this.tempArr[3];
				if (this.ansNum == this.ranArr[temp]) {
					System.out.println("맞췄습니다.");
						break miro;
					} else if (this.ansNum != this.ranArr[temp]) {
					System.out.println("실패했습니다.");
					} 
				break;
			case 5:
				temp = this.tempArr[4];
				if (this.ansNum == this.ranArr[temp]) {
					System.out.println("맞췄습니다.");
						break miro;
					} else if (this.ansNum != this.ranArr[temp]) {
					System.out.println("실패했습니다.");
					} 
				break;
			case 6:
				System.out.println("미로게임 종료");
				break miro;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				
			}
		}
	}
	


}
