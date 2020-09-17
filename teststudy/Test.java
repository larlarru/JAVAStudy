package teststudy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[4];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random() * 4); 
		}
		System.out.println(Arrays.toString(x));

	}

}
