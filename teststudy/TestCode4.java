package teststudy;

import java.util.Arrays;

public class TestCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순서
		int[] num = new int[4];
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			temp = (int) (Math.random() * 4);
			for (int j = 0; j < num.length; j++) {
				num[j] = (int) (Math.random() * 4);
				if (num[j] == num[0]) {
					num[0] = (int) (Math.random() * 4);
				} else if (num[j] == num[1]) {
					num[1] = (int) (Math.random() * 4);
				} else if (num[j] == num[2]) {
					num[2] = (int) (Math.random() * 4);
				} else if (num[j] == num[3]) {
					num[3] = (int) (Math.random() * 4);
				}
			}

		}

/*		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 4);
			if(num[i]==num[i]) {
				num[i] = (int) (Math.random() * 4);
			}
		}
		*/

	/*	do {

			for (int i = 0; i < num.length; i++) {

				num[i] = (int) (Math.random() * 4);

			}

		} while (num[0] == num[1] || num[1] == num[2] || num[2] == num[3]

		|| num[3] == num[0]);
*/
		System.out.println(Arrays.toString(num));

	}
}
