package j_collection;

import java.util.ArrayList;


public class ArrayListClass {

	public static void main(String[] args) {
		
		/*
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다.
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 * 
		 * 
		 * add는 인덱스 지정해서 그 사이에 저장할 수 있다.
		 * 한칸씩 밀고 그 사이에 들어가서 저장한다고 보면된다.
		 * 
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new ArrayList());
		
		/* 
		 * 제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 어렵다.
		 * 따라서 제네릭의 사용이 권장된다.
		 */
		ArrayList<Integer> list = new ArrayList<>(); // 제네릭으로 Integer로 지정해서 Integer만 저장할 수 있다.
		
		list.add(10);
//		list.add("abc"); //컴파일 에러 발생
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list); //저장된 값 출력
		
		list.add(1, 40); //1번 인덱스로부터 뒤로 밀고 값을 저장한다.
		System.out.println(list); //그러면 2번 인덱스부터 저장된다.
		
		Integer before = list.set(2, 50); //2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2); //list[2]
		System.out.println(integer); //2번 인덱스값 출력
		
/*		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
			
			 * 제거가 안되는데 일단 0번 인덱스 제거하고 1번인덱스가 2번 인덱스가 된다. 그래서 길이가 4에서 3으로 줄어들고 
			 * 그다음에 1번 인덱스를 제거해하는데 기존 2번 인덱스가 1번 인덱스가 됬으니 그걸 제거하고 다시 자리 체움
			 * 그다음에 2번 인덱스를 제거해야하는데 list.size()도 길이가 2가 되고 조건식을 만족 못하니 for문이 끝남
			 
		}
		System.out.println(list);
*/		
		//값을 제거 할때는 뒤에서부터 제거해야한다.
		for (int i = list.size() - 1; 0 <= i; i--) {
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list); //list다음에 .toString()은 자동으로 있다고 보면된다.
		
		//list에 1~100사이의 랜덤값을 10개 저장해 주세요.
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 101));
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구하기
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		avg = (double)sum/list.size();
		System.out.println(sum);
		System.out.println(avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		//선생님이 하신 답
		
		int min = list.get(0);
		int max = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(list);
		
/*		int min = 0;
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if(list.get(j) > list.get(i)) {
					min = list.get(i);
					list.get(i) = list.get(j);
					list.get(j) = min;
				}
			}
		}
		System.out.println(min);
		System.out.println(list);
*/
		//list를 오름차순으로 정렬해주세요.
		for (int i = 0; i < list.size() - 1; i++) {
			min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(min)) {
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		
		
		System.out.println(list);
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for (int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> li = list2.get(i);
			for (int j = 0; j < li.size(); j++) {
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		Integer integer2 = list2.get(0).get(1); //list2.get(0)이만큼이 ArrayList라 .찍고 또 get를 호출 할 수 있다.
		//하나만 꺼내오는거다. 또 꺼내올거면 또 지정하면된다.
		//40이랑 50 꺼내얼고면 Integer integer2 = list2.get(1).get(1); 이런식으로 인덱스만 꺼내오면된다.
		//없는 인덱스를 호출하면 에러가 난다.
		//10	20	30 들어간건 0번 인덱스 40	50 들어간것은 2번 인덱스
		
		System.out.println(integer2);
		
	}
	
	
	
	
	

}














