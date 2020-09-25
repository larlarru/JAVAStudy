package randomlunch;

public class Randomlunch {
	
	int input;
	
	Menu menu;
	
	Randomlunch() {
		
		menu = new Menu();
		
		
	}

	public static void main(String[] args) {
		new Randomlunch().start();
	}
	
	void start() {
		
		start : while(true) {
			
			System.out.print("입력(1.시작 그외는 종료) >");
			input = ScanUtil.nextInt();
			
			
			
			switch (this.input) {
			case 1:
				System.out.println("메뉴 선택창으로 이동합니다.");
				menu.menuStart();
				break;

			default:
				System.out.println("죵료");
				System.exit(0);
				break;
			}
			
		}
		
	}

}
