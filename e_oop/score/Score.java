package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10]; //기본값이 null 10개가 들어있다. //같은 패지키에 있는 Student이다. import 하지 않으면 같은 패지키에 있는 Student이다.
		
		for(int i =0; i < students.length; i++) {
			Student student = new Student(); 
			/*이 객체생성이 for문안에 있어야한다. 만약 for문 밖에 있게 된다면 for문 밖에서 객체가 하나 만들어 진다. 
			 * 그리고 하나의 객체안에 10개의 배열이 들어가게 된다. 
			 * 그래서 for문 안에 객체 생성하면 하나의 객체에 배열 하나 들어가게 되어 총 10명의 정보가 들어가게 된다.*/
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
			student.subSum = 0;
			student.subAvg = 0;
			
			
			students[i] = student;
		}
		
		//성적관리 프로그램 완성하기
		
		//학생 성적 합계 구하기
		for(int i = 0; i < students.length; i++) {
			students[i].sum= students[i].kor + students[i].eng + students[i].math;
		}
		//평균 구하기
		for(int i = 0; i < students.length; i++) {
			students[i].avg = Math.round((double)students[i].sum / 3 * 100) / 100d;
		}
		
		//과목 합계
		for (int i = 0; i < students.length; i++) {
			students[0].subSum += students[i].kor;
			students[1].subSum += students[i].eng;
			students[2].subSum += students[i].math;
		}
		//과목 평균
		for (int i = 0; i < 3; i++) {
			students[i].subAvg = Math.round((double)students[i].subSum / students.length * 100) / 100d;
		}
		
		
		//석차 구하기
		for (int i = 0; i < students.length; i++) {
			students[i].rank = 1;
			for (int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		//석차 정렬 //이거 좀더 공부하기
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].rank < students[min].rank) {
					min = j;
				}
			}
			int temp = students[i].rank;
			students[i].rank = students[min].rank;
			students[min].rank = temp;
		}
				
		System.out.println("이름" + "\t" + "국어" + "\t" + "영어"
		+ "\t" + "수학" + "\t" + "합계" + "\t" + "평균" + "\t" + "석차");
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t"); 
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].sum + "\t");
			System.out.print(students[i].avg + "\t");
			System.out.print(students[i].rank + "\n");
		}
		System.out.print("과목 합계 : ");
		for (int i = 0; i < 3; i++) {
			System.out.print(students[i].subSum + "\t");
		}
		System.out.print("\n" + "과목 평균 : ");
		for (int i = 0; i < 3; i++) {
			System.out.print(students[i].subAvg + "\t");
		}
		System.out.println();
		
	}

}
