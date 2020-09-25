package randomlunch;

public class Menu {
	
	int input;
	int ranNum;
	
	Menu() {
		
		this.ranNum = (int)(Math.random() * 100) + 1;
		
	}
	
	void menuStart() {
		
		menu : while(true) {
			
			System.out.print("선택할 메뉴 입력(1.시작 그외는 종료) >");
			input = ScanUtil.nextInt();
			
			
			
			switch (this.input) {
			case 1:
				System.out.println("확인중");
				System.out.println(this.ranNum);
				break menu;

			default:
				System.out.println("죵료");
				System.exit(0);
				break;
			}
			
		}
		
	}

}
