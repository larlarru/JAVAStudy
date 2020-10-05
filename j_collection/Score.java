package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> subject = new ArrayList<>();
		ArrayList<Integer> subjectNum = new ArrayList<>();
		ArrayList<ArrayList<Integer>> subjectNum1 = new ArrayList<>();
		
		int sum = 0;
		double avg = 0;
		int subjectSum = 0;
		double subjectAvg = 0;
		int rank = 0;
		
		
		name.add("홍길동");
		name.add("홍길동");
		name.add("홍길동");
		name.add("홍길동");
		name.add("홍길동");
		
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		subject.add("사회");
		subject.add("과학");
		subject.add("Oracle");
		subject.add("Java");

		for (int i = 0; i < name.size(); i++) {
			subjectNum = new ArrayList<>();
			for (int j = 0; j < subject.size(); j++) {
				subjectNum.add((int) (Math.random() * 101));
				subjectNum1.add(subjectNum);
			}
		}
		

		System.out.println(name);
		System.out.println(subject);
		System.out.println(subjectNum);
		System.out.println(subjectNum1);
		
		for (int i = 0; i < name.size(); i++) {
			for (int j = 0; j < subject.size(); j++) {
				sum += subjectNum1.get(i).get(j);
			}
		}
		System.out.println(sum);
//		ArrayList<Integer> integer2 = subjectNum1.get(0);
//		System.out.println(integer2);
		
		
		
	}

}
