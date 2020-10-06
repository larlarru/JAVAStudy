package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class Board {
	
	
	private static HashMap<String, Object> board = new HashMap<>();
	private static ArrayList<HashMap<String, Object>> Board = new ArrayList<>();
	private static Date today = new Date();
	private static SimpleDateFormat today1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
	static int input;
	static String sInput;
	static String sInputName;
	static String sInputValues;
	static int boardNum = 1;
	static int temp;
		
	

	public static void main(String[] args) {
		
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ---
		 * 번호	제목	작성자	작성일
		 * ---
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * ----
		 * 1.조회		2.등록	3.종료
		 * 
		 */
		
//		HashMap<String, Object> board = new HashMap<>();
//		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
		board.put("번호", boardNum);
		board.put("제목", "안녕하세요");
		board.put("내용", "");
		board.put("작성자", "홍길동");
		board.put("작성일", today1.format(today));
//		board.put("작성일", today);
//		board.put("작성일", new Date());
		
//		ArrayList<HashMap<String, Object>> Board = new ArrayList<>();
		Board.add(board);
		
		
		
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			/*Set<String> bKeySet = b.keySet();
			for (String dKey : bKeySet) {
				System.out.println(dKey + " : " + b.get(dKey));
			}*/
			System.out.print(b.get("번호") + "\t");
			System.out.print(b.get("제목") + "\t");
			System.out.print(b.get("내용") + "\t");
			System.out.print(b.get("작성자") + "\t");
			System.out.print(b.get("작성일") + "\n");
			/*
			 *  + b.get("제목") + b.get("내용") + b.get("작성자") + 
							new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(b.get("작성일"))
			 */
			System.out.println("----------------------------------------------------");
		}
//		System.out.println(board);
		boardStart : while(true) {
			System.out.println("1.조회\t2.등록\t3.수정\t4.삭제\t5.종료");
			System.out.print("입력>");
			input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				System.out.println("조회부분");
				System.out.println("----------------------------------------------------");
				for (int i = 0; i < Board.size(); i++) {
					HashMap<String, Object> b = Board.get(i);
					/*Set<String> bKeySet = b.keySet();
					for (String dKey : bKeySet) {
						System.out.println(dKey + " : " + b.get(dKey));
					}*/
					System.out.print(b.get("번호") + "\t");
					System.out.print(b.get("제목") + "\t");
					System.out.print(b.get("내용") + "\t");
					System.out.print(b.get("작성자") + "\t");
					System.out.print(b.get("작성일") + "\n");
					System.out.println("----------------------------------------------------");
				}
				break;
			case 2 : 
				boardCreate();
				/*System.out.print("게시판 등록\n");
				board = new HashMap<>();
				board.put("번호", count+1);
				System.out.print("제목 입력>");
				sInput = ScanUtil.nextLine();
				board.put("제목", sInput);
				System.out.print("작성자 입력>");
				sInput = ScanUtil.nextLine();
				board.put("작성자", sInput);
				board.put("작성일", new Date());
				Board.add(board);*/
//				boardNum+=1;
				break;
			case 3:
				boardChange();
				break;
			case 4:
				System.out.println("삭제부분");
				remove();
				break;
			case 5:
				System.out.println("종료");
				System.exit(0); //시스템 종료
				break;
			}
		}
		
		
		
		
	}
	
	private static void boardCreate() {
//		boardCreateStart: while (true) {
		Date today = new Date();
			board = new HashMap<>();
//			HashMap<String, Object> tempNum = null;
			int tempNum;
			int boardNumber;
			for (int i = 0; i < Board.size(); i++) {
				HashMap<String, Object> b = Board.get(i);
//				boardNumber = boardNum;
//				boardNumber++;
				tempNum = Board.size();
				if(tempNum < Board.size()) {
					board.put("번호", Board.size());
				} else if(tempNum > Board.size()) {
					board.put("번호", tempNum);
				}
				/*if(Board.size() < boardNumber) {
					tempNum = boardNumber;
					board.put("번호", tempNum);
				} else if(Board.size() >= boardNumber) {
					tempNum = Board.size();
					board.put("번호", tempNum);
				}*/
				
			}
			System.out.print("등록할 게시판 제목 입력>");
			sInput = ScanUtil.nextLine();
			board.put("제목", sInput);
			System.out.print("등록할 게시판 내용 입력>");
			sInput = ScanUtil.nextLine();
			board.put("내용", sInput);
			System.out.print("등록할 게시판 작성자 입력>");
			sInput = ScanUtil.nextLine();
			board.put("작성자", sInput);
			board.put("작성일", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(today));
			Board.add(board);

//			if (sInput.equals("exit")) {
//				break boardCreateStart;
//			}
//		}
	}
	
	static void boardChange() {
		System.out.println(Board);
		/*
		System.out.println("게시판 새로 등록");
		board = new HashMap<>();
		board.put("번호", boardNum + 1);
		System.out.print("게시판 제목 입력>");
		sInput = ScanUtil.nextLine();
		board.put("제목", sInput);
		System.out.print("게시판 내용 입력>");
		sInput = ScanUtil.nextLine();
		board.put("내용", sInput);
		System.out.print("게시판 작성자 입력>");
		sInput = ScanUtil.nextLine();
		board.put("작성자", sInput);
		board.put("작성일", new Date());
		Board.add(board);*/
				
		
		System.out.print("수정할 게시판 부분 입력>");
		sInput = ScanUtil.nextLine();
		System.out.print("수정할 게시판 부분에 입력할 입력>");
		sInputValues = ScanUtil.nextLine();
		board.put(sInput, sInputValues);
	}
	
	static void remove() { //제거부분은 구현했으나 그당시등록된?부분만 제거 가능
//		System.out.println(board);
		System.out.println("----------------------------------------------------");
//		Date today = new Date();
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			/*Set<String> bKeySet = b.keySet();
			for (String dKey : bKeySet) {
				System.out.println(dKey + " : " + b.get(dKey));
			}*/
			System.out.println("번호\t" + "제목\t" + "내용\t" + "작성자\t" + "작성일\t");
			System.out.print(b.get("번호") + "\t");
			System.out.print(b.get("제목") + "\t");
			System.out.print(b.get("내용") + "\t");
			System.out.print(b.get("작성자") + "\t");
			System.out.println(b.get("작성일"));
			System.out.println("----------------------------------------------------");
		}
//		System.out.println(board.size());
		System.out.print("지울 게시판 입력(0번부터 시작임)>");
		input = ScanUtil.nextInt();
//		board.remove(sInput); //제거
//		Board.remove(input); //ArrayList에 저장된 인덱스를 입력해서 지움
//		if()
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			if((Integer)b.get("번호") == input) {
				Board.remove(i);
			}
		}
	}
	
	
	

}



















