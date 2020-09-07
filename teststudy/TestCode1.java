package teststudy;

public class TestCode1 {

	public static void main(String[] args) {
		//코딩 테스트
		
		//for문등 반복문 사용
		
		//1부터 100까지 짝수의 합을 출력해 주세요.
		int sum =0;
		for(int i = 2; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지의 홀수의 합을 출력
		sum=0;
		for(int i = 1; i<=100; i+=2){
			sum +=i;
		}
		System.out.println(sum);
		

		//구구단 출력
		for(int i=0; i<10; i++){
			for(int j=1; j<10; j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		//구구단 2단부터 9단까지 출력
		for(int i=2; i<10; i++){
			for(int j=1; j<10; j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		//눈에 보기 편하게 구구단 출력하기
		System.out.println("구구단 표 출력");
		for(int i=1; i<10; i++){
			for(int j=2; j<10; j++){
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}

		//a에 2씩 몇번 곱해야 100이상이 되는지 알아봅시다.
		int count=0;
		sum=0;
		int a=1;
		while(a < 100){
			a*=2;
			count++;
			
		}
		System.out.println("횟수 : " + count + " 합 " + a);

		//숫자 맞추기 게임
		int ran = (int)(Math.random() * 10) + 1; //1부터 10출력
		System.out.println(ran);

		//배열 사용하여 문제 풀기
		
		// 배열에 랜덤 숫자 부여

		// 배열에 저장된 모든 값의 합계와 평균을 구하시오.

		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.

		// 배열의 값을 섞어주세요.(랜덤 배열 나오게 해서 섞기)

		// 1부터 10까지 배열이 출력되게 함

		// 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
	}

}
