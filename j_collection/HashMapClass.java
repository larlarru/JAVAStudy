package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 * 
		 * HashMap은 인덱스가 아니라 키를 만들어서 키에 저장함.
		 * 그래서 키에 저장하면 순서라는 개념이 없다.
		 * 중복되지 않는 값만 저장함
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		//key는 보통 String를 많이 사용함
		
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Date());
		
		System.out.println(map); //b, c, a순으로 출력된다. 
		
		map.put("b", "이순신"); //덮어쓴다.
		
		System.out.println(map);
		
		map.remove("a"); //제거
		
		System.out.println(map);
		
		Object value = map.get("b"); //Object 타입의 변수를 만들어서 b의 key값? 가져옴
		System.out.println(value);
		
		Set<String> keys = map.keySet(); //저장된 모든 키를 가져오는 메서드
//		System.out.println(keys); //이러면 제거된 a를 제외한 b와c를 가져온다.
		
		for (String key : keys) { 
			/* for문은 이것for (String key : keys)처럼 생긴 for문도 있다.
			 * :뒤에 값이 여러개 담겨 있으면 올 수 있다.
			 * keys에 있는 값을 하나씩 꺼내에서 key변수에 저장하고 for문을 실행한다.
			 * keys에 있는 모든 값을 다 꺼낼 때까지 for문을 실행한다.
			 * 
			 * 변수를 만들때 여기서는 String key는 String인데 이는 keys에 저장된 타입이 String 이기 때문이다.
			 * 그러니 타입을 똑같이 맞추어서 해줘야한다. 
			 */			
			System.out.println(key + " : " + map.get(key));			
		}
		
		/*
		 * ArrayList값에 어떤 타입 구별?
		 * 하나는 HashMap
		 * HashMap은 여러가지 값을 키를 지정해 저장하는데 그 키를 lprod_id, lprod_gu, plrod_nm뭐 이렇게 지정해서 저장해서 각각 저장해서 구별
		 * 클래스를 만들어서 클래스 안에 변수 이름이 lprod_id, lprod_gu, plrod_nm뭐 이런식으로 저장
		 * 이렇게 2가지 구별해서 저장하는게 있는데 편한건 HashMap 이용해서 key로 저장하는거다.
		 */
		
		HashMap<String, Object> lprod = new HashMap<>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>(); //HashMap를 ArrayList에 저장 변수 전체 바꾸고 싶을때 변수에 ctrl+1하면된다.
		table.add(lprod); //list에 lprod저장
		
		System.out.println(table);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		
		table.add(lprod);
		
		System.out.println(table); //table에 저장된 lprod값을 출력
		//클래스로 하는 방법은 클래스 하나 만들어서 변수 만들어서 저장후에 하면된다.

		ArrayList<HashMap<String, Object>> deptTable = new ArrayList<>();
		
		HashMap<String, Object> dept = new HashMap<>();
		dept.put("DEPT_DEPTNO", 10);
		dept.put("DEPT_NAME", "ACCOUNTING");
		dept.put("DEPT_LOC", "NEW_YORK");
		
		deptTable.add(dept);
		
		dept = new HashMap<>();
		dept.put("DEPT_DEPTNO", 20);
		dept.put("DEPT_NAME", "RESEARCH");
		dept.put("DEPT_LOC", "DALLAS");
		
		deptTable.add(dept);
		
		dept = new HashMap<>();
		dept.put("DEPT_DEPTNO", 30);
		dept.put("DEPT_NAME", "SALES");
		dept.put("DEPT_LOC", "CHICAGO");
		
		deptTable.add(dept);
		
		dept = new HashMap<>();
		dept.put("DEPT_DEPTNO", 40);
		dept.put("DEPT_NAME", "OPERATIONS");
		dept.put("DEPT_LOC", "BOSTION");
		
		deptTable.add(dept);
		
		
		System.out.println(deptTable);
		
		
		System.out.println("----------------------------------------------------");
		/*ArrayList에 저장된 key값을 꺼내오는법 d라는 Hash맵을 만들어줘서 
		 * ArrayList크기만큼 for문 돌리고
		 * 그 안에 HashMap 새로 하나 만들어서 ArrayList값을 저장해주고
		 * 그밑에 바로 Set key를 선언해줘서 다시 for문 돌려서 값을 출력한다.
		 */
		for (int i = 0; i < deptTable.size(); i++) {
			HashMap<String, Object> d = deptTable.get(i);
			Set<String> dKeySet = d.keySet();
			for (String dKey : dKeySet) {
				System.out.println(dKey + " : " + d.get(dKey));
			}
			System.out.println("----------------------------------------------------");
		}
		
	}
	
	
	
	
}















