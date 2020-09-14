package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다.(변수 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		*/
		
		//변수(1개의 변수에는 1개의 데이터만 저장)
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//배열(같은 타입의 데이터를 여러개 저장)
		int[] scores;
		int sum2;
		double avg2;
		String name2;
		
		Student student; //Student클래스의 변수 선언, 그래서 student는 Student라는 클래스를 가진 참조형 변수이다.
		student = new Student(); //객체 생성(인스턴스화), 객체 생성을 해야 클래스를 사용할 수 있다.
		student.kor = 80; //이런식으로 값을 저장할 수 있다.
		student.eng = 90;
		student.math = 60;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student.sum);
		System.out.println(student.avg);
		
		//패키지에 .을 찍고 만들면 하위 패키지가 됨, 예를들어 e_oop패키지에다가 e_oop.score를 하면 하위 패키지 만들어진다.
		
		
		
		
		
		
		
		
		
		
	}

}

//클래스 하나 추가
//이름이 학생인데 어떻게 만들겠다 라는 설계도를 만든거다., 객체생성이란 이 내용(class Student)를 메모리에 올리는걸 말한다.
class Student {
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}


































