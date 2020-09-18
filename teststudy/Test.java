package teststudy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ranArr = new int[5];
		int[] tempArr = new int[5];
		
		/*for (int i = 0; i < tempArr.length; i++) {
			
			tempArr[i] = (int)(Math.random() * 5);
			
			for (int j = 0; j < ranArr.length; j++) {
				ranArr[j] = (int)(Math.random() * 5);
				while(tempArr[i] == ranArr[j]) {
					ranArr[j] = (int)(Math.random() * 5);
				}
				
			}
		}*/
/*		
		for (int i = 0; i < ranArr.length; i++) {
			for (int j = 0; j < ranArr.length; j++) {
				ranArr[j] = (int)(Math.random() * 5);
				while(tempArr[i] == ranArr[j]) {
					ranArr[j] = (int)(Math.random() * 5);
				}
			
		}*/
		do {
			for (int i = 0; i < ranArr.length; i++) {
				ranArr[i] = (int)(Math.random() * 5);
			}
		} while (ranArr[0] == ranArr[1] || ranArr[0] == ranArr[2]
				|| ranArr[0] == ranArr[3] || ranArr[0] == ranArr[4]
				|| ranArr[1] == ranArr[2] || ranArr[1] == ranArr[3]
				|| ranArr[1] == ranArr[4] || ranArr[2] == ranArr[3]
				|| ranArr[2] == ranArr[4] || ranArr[3] == ranArr[4]);
		
	/*	for (int j = 0; j < ranArr.length; i++) {
			
			ranArr[j] = (int)(Math.random() * 5);
			
		}
	*/
		System.out.println(Arrays.toString(ranArr));
//		int a = (int)(Math.random() * 5);
//		System.out.println(a);
		
		

	}

}
