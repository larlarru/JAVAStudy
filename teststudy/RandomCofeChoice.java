package teststudy;

import java.util.Arrays;

public class RandomCofeChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서
		int[] num = new int[4];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 4);
		}

		do {
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 4);
			}

		} while (num[0] == num[1] || num[1] == num[2] || num[2] == num[3]
				|| num[3] == num[0]);
		
		
/*		for (int i = 0; i < num.length; i++) {
			for (int j = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 4);
				if (i == 1 && num[i] == num[j]) {
					do {
						num[i] = (int) (Math.random() * 4);
						if(num[i] != num[j]) {
							break;
						}
					} while (num[i] == num[j]);
				}
			}
		}
		*/
		
		
		
		
/*		for (int i = 0; i < 4; i++) {
			
			for (int j = i+1; j < 4; j++) {
				if (num[i] == num[j]) {
					num[j] = (int) (Math.random() * 4);
				}
			}
		}
		*/
/*		if(num[0]==num[1]) {
			num[0] = (int) (Math.random() * 4);
		}
		if(num[1]==num[2]) {
			num[1] = (int) (Math.random() * 4);
		}
		if(num[2]==num[3]) {
			num[2] = (int) (Math.random() * 4);
		}
		if(num[0]==num[3]) {
			num[3] = (int) (Math.random() * 4);
		}
		

	*/
		
	/*	do {
			if (num[0] == num[1]) {
				num[0] = (int) (Math.random() * 4);
			} else if (num[1] == num[2]) {
				num[1] = (int) (Math.random() * 4);
			} else if (num[2] == num[3]) {
				num[2] = (int) (Math.random() * 4);
			} else if (num[0] == num[3]) {
				num[3] = (int) (Math.random() * 4);
			}

		} while (num[0] == num[1] && num[1] == num[2]
				&& num[2] == num[3] && num[3] == num[0]);
		*/
	
/*		while(num[0] == num[1] && num[1] == num[2]
				&& num[2] == num[3] && num[3] == num[0]) {
			if (num[0] == num[1]) {
				num[0] = (int) (Math.random() * 4);
			} else if (num[1] == num[2]) {
				num[1] = (int) (Math.random() * 4);
			} else if (num[2] == num[3]) {
				num[2] = (int) (Math.random() * 4);
			} else if (num[0] == num[3]) {
				num[3] = (int) (Math.random() * 4);
			}
			
		}
		*/
	/*	do {
			if (num[0] == num[1]) {
				num[0] = (int) (Math.random() * 4);
			} else if (num[1] == num[2]) {
				num[1] = (int) (Math.random() * 4);
			} else if (num[2] == num[3]) {
				num[2] = (int) (Math.random() * 4);
			} else if (num[0] == num[3]) {
				num[3] = (int) (Math.random() * 4);
			}

		} while (num[0] == num[1] && num[1] == num[2]
				&& num[2] == num[3] && num[3] == num[0]);*/
		
		System.out.println(Arrays.toString(num));
		
		//결과
		int[] res = new int[4];
		
		//커피값 범위
		int money = (int)(Math.random() * 10000)+1;
		
		do {
			money = (int)(Math.random() * 10000)+1;
		} while(money < 5000);
		
		money = Math.round((float)money / 100f) * 100;
		
		/*for(int i = 0; i < testintarr.length; i++) {
			testintarr[i] = (int)(Math.random() * 4) + 1;
		}*/
		
		System.out.println(money);

	}

}
