package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 * 
		 *타입이 같아야한다. 타입이 다르면 안된다.
		 *값을 따로 저장한다. 주소에 변수를 저장한다.
		 *
		 * 인덱스를 사용하는데 변수 이름이 a라면 a[]붙이고 []안에 숫자를 넣는다.
		 * a[0] 의미는 배열 안에 있는 0번째 배열을 의미 즉 첫번째라는 소리이다.
		 * 배열은 1이 아니라 0부터 시작함 그래서 첫번째가 0번째임
		 * 
		 * 새로 배열을 만들어서 길이를 늘리수는 있어도 기존 배열의 길이는 늘릴수가 없다.
		 * 
		 * 저장된 값들의 크기를 알 수가 없기 때문이다.
		 * 만약 첨에 크기를 10개를 저장하고 싶어서 10개를 만들었고 하다보니 부족한데 기존에 만든 10개짜리를 버릴수가 없게된다.
		 * 한번 ㅁ
		 * 메모리에 저장할때 메모리가 사용된부분도 있고 사용안하는 부분도 있음
		 * 만약 배열이 10개짜리면 10개가 비어있는곳에 메모리를 넣는데
		 * 즉 배열 10개짜리자리 앙옆에 데이터가 있기 때문에 배열을 늘리고 싶어도 늘리면 데이터를 침벙하게 되기 때문에 새로 만들어야해서 기존 배열 크기를 늘릴수가 없다.
		*/
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다. 변수는 보통 타입뒤에 [] 붙인다. 참조형 타입은 4바이트 크기로 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. 배열에 5개를 저장하겠다고 크기를 정한거다. []는 인덱스 말고도 배열을 만들때도 사용
		/*현재 위에 int문장의 경우 0이다. 숫자타입 기본값은 다 0이다. boolean는 기본값이 false다.
		 * char기본값 경우 char는 문자인데 컴터는 0과 1만 표현하는데 
		 * 숫자 하나랑 문자 하나를 매칭시켜서 그 문자를 표현하기 위해 숫자로 표현 즉 문자 하나랑 숫자 하나랑 연결되어있다고 보면된다.
		 * char 기본값 문자-숫자 매칭 보고 싶으면 표를 검색해본다.
		 * 그래서 char는 공백이 기본값이다.
		 * 참조형의 기본값은 null이다.
		 * 
		 * 기본값 정리하자면 
		 * 숫자(int, float, double, short, long....) : 0
		 * boolean : false
		 * char : ' '
		 * 참조형 타입(배열, String) : null
		*/
		//배열 초기화시 기본값이 저장된다.
		
		//배열을 만드는 다른 방법 
		array = new int[]{1, 2, 3, 4, 5}; //[]의 배열은 비워두고 뒤에 {}에다가 실제 저장할 값을 넣는다.
		
		//배열을 만드는 다른 방법
//		arrary = {1, 2, 3, 4, 5}; //타입을 생략하고 배열 값을 바로 넣고 이것은 선언과 초기화를 따로 하면 안된다.
		//선언과 초기화를 동시에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5}; //이렇게 선언과 초기화를 동시에 해준다.
		
		System.out.println(array[0]); //변수이름 뒤에 대갈호를 붙이고 0번 이런거 넣어주는데 이 코드 의미는 0번 인덱스를 출력한다는 소리이다.
		//위에 문장 의미는 array[0] 즉 0번 인덱스에 저장되어 있는 1의 값을 출력한다는 소리이다.
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10; //0번 인덱스 즉 첫번째 값에 10이라는 값을 저장한다. 라는 의미이다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//밑에 코드는 for문 사용하여 배열값 합 구하기
		int sum = 0;
		for(int i = 0; i < array.length; i++) { //length는 배열의 길이를 저장하고 있는 변수
			sum += array[i];
		}
		System.out.println("합계 : " + sum);
		
		//자동완성 : Ctrl + Spacebar
		//sysout 작성하고 Ctrl + Spacebar 하면 System.out.println();가 완성된다.
		//한줄복사 : Ctrl + Alt + 방향키 하면  방향키 누른곳으로 복사된다.
		//한줄이동 : Alt + 방향키
		//한줄 삭제 : Ctrl + d 누르면 한줄이 삭제된다.
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] array3 = new int[10]; //이거말고도 위에 다른 2개 방식으로 해도 문제없다.
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해 주세요.
		
/*		밑에 처럼 하면 5번째인가에서 오류가 남
  		array[0] = (int)(Math.random() * 100) + 1;
		array[1] = (int)(Math.random() * 100) + 1;
		array[2] = (int)(Math.random() * 100) + 1;
		array[3] = (int)(Math.random() * 100) + 1;
		array[4] = (int)(Math.random() * 100) + 1;
		array[5] = (int)(Math.random() * 100) + 1;
		array[6] = (int)(Math.random() * 100) + 1;
		array[7] = (int)(Math.random() * 100) + 1;
		array[8] = (int)(Math.random() * 100) + 1;
		array[9] = (int)(Math.random() * 100) + 1;
*/
		
		//배열에 랜덤 숫자 부여
		for(int i = 0; i <array3.length; i++) {
			array3[i] = (int)(Math.random() * 100) + 1; //랜덤 숫자 부여할때 [i]로 하기 즉 변수 선언 잘 살펴보기
		}
		
		
		//배열에 저장된 모든 값의 합계와 평균을 구하시오.
		for(int i = 0; i < array3.length; i++) { //length는 배열의 길이를 저장하고 있는 변수
			sum += array3[i];
		}
		double avg = (double)sum / array3.length; //sum과 array3.lenght는 둘다 int다
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
/*
		int min=0;
		int max=0;
		do {
			if (array3[0] < array3[1]) {
				min = array3[0];
			} else if (array3[0] < array3[2]) {
				min = array3[0];
			}else if (array3[0] < array3[4]) {
				min = array3[0];
			}else if (array3[0] < array3[5]) {
				min = array3[0];
			}else if (array3[0] < array3[6]) {
				min = array3[0];
			}else if (array3[0] < array3[7]) {
				min = array3[0];
			}else if (array3[0] < array3[8]) {
				min = array3[0];
			}else if (array3[0] < array3[9]) {
				min = array3[0];
			}
			
			if (array3[0] > array3[1]) {
				max = array3[0];
			} else if (array3[0] > array3[2]) {
				max = array3[0];
			}else if (array3[0] > array3[4]) {
				max = array3[0];
			}else if (array3[0] > array3[5]) {
				max = array3[0];
			}else if (array3[0] > array3[6]) {
				max = array3[0];
			}else if (array3[0] > array3[7]) {
				max = array3[0];
			}else if (array3[0] > array3[8]) {
				max = array3[0];
			}else if (array3[0] > array3[9]) {
				max = array3[0];
			}
		} while(min == max && min > max);
			
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
*/
		
		//선생님이 한 배열에 저장된 값들 중 최소값과 최대값을 출력
		int min = array3[0];
		int max = array3[0];
		
		for(int i = 0; i < array3.length; i++){
			if(array3[i] < min) {
				min = array3[i];
			}
			if(array3[i] > max) {
				max = array3[i];
			}	
		}
		System.out.println("min : " + min + " max : " + max);
		
		
		//1부터 10까지 배열이 출력되게 함
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요.(랜덤 배열 나오게 해서 섞기)
		System.out.println("석기전 : ");
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		System.out.println(array3[4]);
		System.out.println(array3[5]);
		System.out.println(array3[6]);
		System.out.println(array3[7]);
		System.out.println(array3[8]);
		System.out.println(array3[9]);
		
		// 1부터 10까지 배열이 출력되게 함
/*		int randomArray = 0;
		do {
			for (int i = 0; i < array3.length; i++) {
				randomArray = (int) (Math.random() * 9) + 1;
				i = randomArray;
				array3[0] = array3[i];
				array3[1] = array3[i];
				array3[2] = array3[i];
				array3[3] = array3[i];
				array3[4] = array3[i];
				array3[5] = array3[i];
				array3[6] = array3[i];
				array3[7] = array3[i];
				array3[8] = array3[i];
				array3[9] = array3[i];
				}
			break;
		} while(i == i);
		System.out.println(Arrays.toString(array3));
		System.out.println("섞은 후");
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		System.out.println(array3[4]);
		System.out.println(array3[5]);
		System.out.println(array3[6]);
		System.out.println(array3[7]);
		System.out.println(array3[8]);
		System.out.println(array3[9]);
*/
		for(int i = 0; i < shuffle.length; i++) {
			int random = (int)(Math.random() * shuffle.length); //+1를 넣으면 배열은 10까지 배정했는데 이 10의 값이 나오게되어 배정된 값을 오바하게 되무로 +1넣으면 안된다.
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println(" 랜덤 배열 출력 : " + Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
/*		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		*/
		
/*		int[] shuffle1 = new int[500];
		int[] count = new int[10]; //10개짜리 배열 추가
		int random = 0;
		for(int i = 0; i < shuffle1.length; i++) {
			random = (int)(Math.random() * 10) + 1; //1부터 10까지 랜덤숫자
			count[random - 1]++;
			
		}*/
		int[] count = new int[10]; //10개짜리 배열 추가
		for(int i = 0; i < 500; i++) {
			int random = (int)(Math.random() * 10) + 1; //1부터 10까지 랜덤숫자
			count[random - 1]++;
			
		}
		
		System.out.println("횟수 : " + Arrays.toString(count));//1~10까지 발생된 숫자 횟수 부여
		
		//과제 : 복습
		
	}

}