package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식 
		 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		/*
		 * 큌 정렬 빠른 정렬
		 */

		// 1~100까지 랜덤숫자 부여해서 10개 출력
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));

		// 석차구하기
		// printRank(arr); //석차구하기, 석차를 구하는 코드를 묶어놓는 메소드
		// printRank(arr);에 있는 배열 arr는 밑에 있는 메소드에 있는 int[] arr로 넘긴거다.
		/*
		 * printRank(arr);로 인해 만들어진 printRank()메소드를 만들고 그거 작업한 후에 다시 main 메소드에
		 * 있는 printRank(arr);로 돌아와서 그 밑에 있는 나머지 main 메소드에 있는 내용물을 작업한다.
		 */

		// 메소드 만들때 Ctrl+1누르면 된다.
		// selectSort(arr); //선택 정렬
		// bubbleSort(arr); //버블 정렬
		insertSort(arr); // 삽입 정렬

	}

	// 삽입 정렬
	/*
	 * 2번째 수부터 하나씩 배교해서 큰수는 뒤로 보내버리기 결과는 가장 작은수 ~ 가장 큰수 나열하는건데 다만 그렇게 하기 위한 과정이
	 * 2번째수가 첫번째수랑 비교해서 첫번째 수가 크면 뒤로 밀어서 2번째 수로 보내버리고 2번째수를 첫번째 수로 바꿔버린다. 
	 * 이 과정을 더이상 비교가 안될때까지 반복하기
	 */
	private static void insertSort(int[] arr) {
		/*
		 * 참고 이거는 감소하는 문장 그래서 0이 될떄까지 감소 i, j 1,0 2,1 2,0
		 */
		System.out.println("바꾸기 전 : " + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i]; // 임시로 값 보관
			int j = 0; // for문 for(j =i -1; j>=0; i--) 밖에다가 arr[j + 1] = temp; 선언해줘야하기 때문에 변수 선언한다.
			for (j = i - 1; j >= 0; j--) { // 이거는 감소하는 문장 그래서 0이 될떄까지 감소
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
				} else { // 더 작은 값을 만나는 경우 이지만 더 큰 값만 만나는 경우도 있기 때문에 굳이 채울 필요없다. 그래서 break라고 빠져나가라고 하면된다.
					break;
				}
			}
			arr[j + 1] = temp; // 이공간이 큰 숫자로 뒤로 밀어버리고 비어버리는 자리이다.
		}
		
/*		 for (int i = 0; i < arr.length-1; i++) { 
		 // 여기 부분 즉 버블정렬에서 for문에 있는 i의 의미는 한바퀴가 아니라 세로로 9번째 까지 출력을 하겠다는건데 만약에 9번째 도중에 완료되면 종료되게 한거다. 반복을
		 //arr.length -1 해주는 이유는 마지막에 비교할 대상이 없기 때문이다. 
		 //그래서 arr.length -1 값은 9가 된다 arr.length=10이라서 boolean changed = false; 
		 //중간에 바꾸는게 없으면 그만두기 위해 변수 선언 
		 System.out.println(i+1 + " 번째 출력"); 
		 for (int j = 1; j <arr.length-(arr.length-j); j++) { //j = i+1로 지정한 이유는 정렬된 i번째 다음부터 실행되야되서
		  //arr.length-1-is는 반복 횟수 줄이려고 
		  if(arr[j] > arr[j + 1]){ 
			  int temp = arr[j]; 
			  arr[j] = arr[j + 1]; 
			  arr[j + 1] = temp; 
			  changed = true; 
			  } 
		  } if(!changed) { //changed를 맨 처음에 false로 선언했는데 arr[j + 1] = temp; changed = true;일 경우 true니 true값이 오게 되어 이 반복문을 멈추게 한다.
		 //!changed는 바뀌지 않았다. changed == true는 changed가 true값이라는 의미 즉 표현의  차이이다. 
			  break; 
			  }
		 
		 
		 System.out.println("돌아가는지 판단하기 : " + Arrays.toString(arr)); }
		*/ 
		Arrays.sort(arr); // 정렬
		System.out.println("결과 : " + Arrays.toString(arr));
	}

	// 버블정렬
	// 가장작은수----가장큰수 이렇게하기
	private static void bubbleSort(int[] arr) {
		// 비교과정
		/*
		 * 밑에 0,1 ~ 8.9 부터 0,1 까지 반복하게 되는건 arr.length-1 이다. 0,1 1,2 2,3 3,4 4,5
		 * 5,6 6,7 7,8 8,9 한게 for문 한반퀴 돈거 arr.length-1하게되면 8번에서 비교하는게 끝나게 된다. 그래서 9번만 돌려주면 되기 때문에 arr.length-1 하게 해준거다. 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 
		 * 0,1 1,2 2,3 3,4 4,5 
		 * 0,1 1,2 2,3 3,4 
		 * 0,1 1,2 2,3 
		 * 0,1 1,2 
		 * 0,1 
		 * arr.length-1-i 끝나게 되면 주는데 도는 횟수를 줄이기 위해 - i 해준거다. 
		 * 그래서 i가 증가 할수록 도는 횟수를 줄여줌 i는(i값은) for문 도는 횟수 그래서 총 9번 돈다.
		 */
		// 선생님이 한거 답 :

		for (int i = 0; i < arr.length - 1; i++) {
			// 여기 부분 즉 버블정렬에서 for문에 있는 i의 의미는 한바퀴가 아니라 세로로 9번째 까지 출력을 하겠다는건데 만약에
			// 9번째 도중에 완료되면 종료되게 한거다. 반복을
			// arr.length -1 해주는 이유는 마지막에 비교할 대상이 없기 때문이다. 
			//그래서 arr.length -1 값은 9가 된다 arr.length=10이라서
			boolean changed = false; // 중간에 바꾸는게 없으면 그만두기 위해 변수 선언
			System.out.println(i + 1 + " 번째 출력");
			for (int j = 0; j < arr.length - 1 - i; j++) { 
				// j = i+1로 지정한 이유는 정렬된 i번째 다음부터 실행되야되서
				//arr.length-1-is는 반복 횟수 줄이려고
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			if (!changed) {
				// changed를 맨 처음에 false로 선언했는데 arr[j + 1] = temp; changed = true;일 경우 true니 true값이 오게 되어 이 반복문을 멈추게 한다.
				// !changed는 바뀌지 않았다. changed == true는 changed가 true값이라는 의미 즉 표현의 차이이다.
				break;
			}

			System.out.println("돌아가는지 판단하기 : " + Arrays.toString(arr));
		}

		/*
		 * //비교하면서 큰 수를 구하고 그리고 자리를 바꾸게 하여 정렬하게 하는 부분 
		 * //중간에 정렬이 완성되면 그만두게 하는걸 실패함 
		 * for (int i = 0; i < arr.length-1; i++) { //arr.length -1 해주는 이유는 마지막에 비교할 대상이 없기 때문이다. 
		 * //그래서 arr.length -1 값은 9가 된다 arr.length=10이라서
		 * int max = i; 
		 * for (int j = i+1; j < arr.length; j++) { //j = i+1로 지정한 이유는 정렬된 i번째 다음부터 실행되야되서 
		 * if(arr[j] < arr[max]){ 
		 * max = j; 
		 * } 
		 * } //자리 바꾸기
		 * //계속 큰수를 구하게 되면 그 자리에 맞게 바꿔야하기 때문에 for문 돌릴수록 큰수가 내가 의도한 위치로 가게 된다.
		 * int temp = arr[i]; 
		 * arr[i] = arr[max]; 
		 * arr[max] = temp;
		 * System.out.println("돌아가는지 판단하기 : " + Arrays.toString(arr));
		 * 
		 * }
		 */
		
		System.out.println("결과 : " + Arrays.toString(arr));

	}

	// 선택 정렬
	private static void selectSort(int[] arr) {
		// 선생님이 해주신 답
		// 작은 숫자 구하기
		for (int i = 0; i < arr.length - 1; i++) { 
			// arr.length -1 해주는 이유는 마지막에 비교할 대상이 없기 때문이다. 
			//그래서 arr.length -1 값은 9가 된다 arr.length=10이라서
			int min = i;
			for (int j = i + 1; j < arr.length; j++) { 
				// j = i+1로 지정한 이유는 정렬된 i번째 다음부터 실행되야되서
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// 자리 바꾸기
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));

		
	/*	int smallNum = 0;
		int[] minStart = new int[10];
		for (int i = 0; i < minStart.length; i++) {
			minStart[i] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					if (arr[j] < arr[i]) {
						smallNum = arr[j]; //
					}
				}

			}

		}
*/
		System.out.println(Arrays.toString(arr));
	}

	// 메소드 하나 만듬 석차 구하기 위한 메소드
	private static void printRank(int[] arr) {

		// 내가 작성했떤것은 for문 하나만 작성해서 한바퀴만 돌고 끝난거였음
		// 선생님이 하신 답 :
		// 석차를 저장할 배열의 모든 인덱스를 1로 초기화한다.
		int[] rank = new int[arr.length];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

		// 점수를 비교해 작은 점수의 석차를 증가시킨다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
	}

}
