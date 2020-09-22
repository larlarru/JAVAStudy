package teststudy;

import java.util.Arrays;

public class Index {
	private int[] unsortedArr = new int[]{56, 50, 45, 30, 25, 4, 2, 30, 1, 55, 20};
	private int[] sortedArr = new int[]{1, 2, 4, 20, 25, 30, 30, 35, 45, 50, 55, 56};
	int count;
	
	public static void main(String[] args) {
		Index index = new Index();
		
		index.unsortedArray(30);
		index.sortedArray(30);
	}

	private void sortedArray(int value) {
		//sortedArr에서 value 값이 있는지 찾고, 몇번 등장하는지 결과출력
		count = 0;
		for(int i = 0; i < sortedArr.length; i++) { //최악의 경우 value값이 맨 마지막에 있는 경우
			if(value == sortedArr[i]) {
				count++;
			} else if(value < unsortedArr[i]) {
				break;
			}
		}
		System.out.println("sortedArray : " + count);
	}

	private void unsortedArray(int value) {
		//unsortedArr에서 value 값이 있는지 찾고, 몇번 등장하는지 결과출력
		count = 0;
		for(int i = 0; i < unsortedArr.length; i++) {
			if(value == unsortedArr[i]) {
				count++;
			} 
		}
		System.out.println("unsortedArr : " + count);
	}

}
