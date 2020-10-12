package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		*/
		
		//2차원 배열
		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		int[][] arr = new int[2][3]; //2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}}; //값의 개수로 배열의 길이가 정해진다.
		int[] arr3[] = {{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}}; //선언과 초기화를 동시에 해야한다.
		int[][] arr4 = new int[3][]; //가변 배열 
		//밑에 있는 차원의 배열의 길이는 정해주지 안흔다. 내가 사용할 시점에 배열 길이를 가각 맘대로 다르게 지정할 수 있다.
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		//2차원 인덱스까지 접근하여 사용할 수 있다.
		System.out.println(arr[0][1]);
		
//		arr[0] = 10; //값을 저장할 수 없다.
		arr[0] = new int[5]; //배열을 저장해야한다. 1차원에는 배열을 저장 할 수 가 있는데 1차원 배열이다.
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println("1차원 배열 길이 : " + arr.length); //1차원 배열의 길이
		System.out.println("2차원 배열 길이 : " + arr[0].length); //2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++) { //1차원 배열을 위해 만듬
			for(int j = 0; j < arr[i].length; j++) { //2차원 배열을 위해 만듬
				System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
			}
		}
		
		//여기서 부터
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; //평균
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println("scores[i] :" + Arrays.toString(scores[i]));
			System.out.println("scores :" + Arrays.toString(scores));
			System.out.println("scores.length 길이 :" + scores.length);
			System.out.println("scores[i].length 길이 :" + scores[i].length);
			System.out.println("sum.length 길이 :" + sum.length);
		}
		
		//합계와 평균 구하기
		//scores[i].length하고 scores[j].length이렇게 하면 오류가 나기 때문에 하면 안된다.
		for (int i = 0; i < scores.length; i++) { //이 길이값은 3
			for (int j = 0; j < scores[i].length; j++) { //이 길이값은 5
				sum[i] += scores[i][j];
			}
			//선생님이 짠 소스 내꺼하고 비슷함 그래서 빠진것만 추가한거
			avg[i] = (double)sum[i] / scores[i].length; 
			//sum[i] / scores[i].length는 둘다 int형이기 때문에 double로 바꿔주기 위해 (double)sum[i] / scores[i].length;로 한다.

			System.out.println("scores.length 길이 :" + scores.length);
			System.out.println("scores[i].length 길이 :" + scores[i].length);
			System.out.println("학생 1명당 5과목 점수 합:" + Arrays.toString(sum));
			System.out.println(" 점수 합:" + sum[i]);
			System.out.println("합계 : " + sum[i] + " / 평균 : " + avg[i]);
		}
		
/*		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				avg[i] = sum[];
			}

			System.out.println("scores.length 길이 :" + scores.length);
			System.out.println("scores[i].length 길이 :" + scores[i].length);
			System.out.println("학생 5과목 점수 합:" + Arrays.toString(sum));
		}
	
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}












