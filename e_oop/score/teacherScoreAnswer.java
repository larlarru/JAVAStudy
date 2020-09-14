package e_oop.score;

public class teacherScoreAnswer {

	public static void main(String[] args) {
		Student[] students = new Student[10]; // 기본값이 null 10개가 들어있다. //같은 패지키에 있는 Student이다. import 하지 않으면 같은 패지키에 있는 Student이다.

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			/*
			 * 이 객체생성이 for문안에 있어야한다. 만약 for문 밖에 있게 된다면 for문 밖에서 객체가 하나 만들어 진다.
			 * 그리고 하나의 객체안에 10개의 배열이 들어가게 된다. 그래서 for문 안에 객체 생성하면 하나의 객체에 배열 하나
			 * 들어가게 되어 총 10명의 정보가 들어가게 된다.
			 */
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);

			students[i] = student;
		}
		
		//성적 프로그램
		for(int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = (int)Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}
		
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].rank < students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t"
					+ students[i].kor + "\t"
					+ students[i].eng + "\t"
					+ students[i].math + "\t"
					+ students[i].sum + "\t"
					+ students[i].avg + "\t"
					+ students[i].rank + "\t"
					);
		}
		
		int[] sums = new int[3];
		for(int i = 0; i < students.length; i++) {
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
		}
		
		double[] avgs = new double[sums.length];
		for(int i = 0; i < 3; i++) {
			avgs[i] += Math.round(sums[i] / (double)students.length * 100) / 100.0;
		}
		
		System.out.print("과목 합계");
		for(int i = 0; i < sums.length; i++) {
			System.out.print("\t" + sums[i]);
		}
		System.out.println();
		System.out.print("과목 평균");
		for(int i = 0; i < sums.length; i++) {
			System.out.print("\t" + avgs[i]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
