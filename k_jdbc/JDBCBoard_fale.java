package k_jdbc;

import k_jdbc.ScanUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class JDBCBoard_fale {
	
	HashMap<String, Object> board;
	ArrayList<HashMap<String, Object>> Board;
	HashMap<String, Object> b;
	
	Date today;
	SimpleDateFormat todaySDF;
	int input;
	String sInput;
	String sInputName;
	String sInputValues;
	int temp;
	int boardNum;
	int boardNumber;
	int tempNum;
	
	public JDBCBoard_fale() {
		board = new HashMap<>();
		Board = new ArrayList<>();
		today = new Date();
		todaySDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		b= null;
		
		boardNum = 1;
		
		tempNum = 0;
	}

	public static void main(String[] args) {
		
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		new JDBCBoard_fale().start();

	}
	
	void start() {
		System.out.println("게시판");
		board.put("번호", boardNum);
		board.put("제목", "안녕하세요");
		board.put("내용", "");
		board.put("작성자", "홍길동");
		board.put("작성일", todaySDF.format(today));
		Board.add(board);
		
//		System.out.println(board);
		boardStart : while(true) {
			System.out.println("게시판에 오신걸 환영합니다.");
			System.out.println("----------------------------------------------------");
			for (int i = 0; i < Board.size(); i++) {
				HashMap<String, Object> b = Board.get(i);
				System.out.print(b.get("번호") + "\t");
				System.out.print(b.get("제목") + "\t");
				System.out.print(b.get("내용") + "\t");
				System.out.print(b.get("작성자") + "\t");
				System.out.print(b.get("작성일") + "\n");
				System.out.println("----------------------------------------------------");
			}
			System.out.println("1.조회\t2.등록\t3.종료");
			System.out.print("입력>");
			input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				boardinquiry(Board); 
				break;
			case 2 : 
				boardCreate(Board);
				break;
			case 3:
				System.out.println("종료");
				System.exit(0); //시스템 종료
				break;
				}
			}
	}

	void boardinquiry(ArrayList<HashMap<String, Object>> Board) {
		System.out.println("조회부분");
	/*	System.out.print("게시글 번호 입력>");
		input = ScanUtil.nextInt();
		HashMap<String, Object> board1 = null;
		for(int i = 0; i < Board.size(); i++){
			HashMap<String, Object> temp = Board.get(i);
			if((Integer)temp.get("NO") == input){
				board1 = temp;
				break;
			}
		}*/
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			System.out.print(b.get("번호") + "\t");
			System.out.print(b.get("제목") + "\t");
			System.out.print(b.get("내용") + "\t");
			System.out.print(b.get("작성자") + "\t");
			System.out.print(b.get("작성일") + "\n");
			System.out.println("----------------------------------------------------");
			
			boardinquiry : while(true) {
				System.out.println("1.수정\t2.삭제\t3.목록");
				System.out.print("입력>");
				input = ScanUtil.nextInt();
				
				switch(input) {
				case 1:
					System.out.println("수정 확인중");
					boardInsert(); 
					break;
				case 2 : 
					System.out.println("삭제 확인중");
//					boardCreate();
					break;
				case 3:
					break boardinquiry;
					}
				}
		}
	}


	void boardCreate(ArrayList<HashMap<String, Object>> Board) {
//		Date today = new Date();
//		board = new HashMap<>();
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			if(tempNum < (Integer)b.get("번호")) {
				tempNum = (Integer)b.get("번호");
			}
			
		}
		tempNum++;
		board.put("번호", tempNum);
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
		
	}
	
	void boardInsert() {
		System.out.println(Board);
		
		System.out.print("수정할 게시판 부분 입력>");
		sInput = ScanUtil.nextLine();
		System.out.print("수정할 게시판 부분에 입력할 입력>");
		sInputValues = ScanUtil.nextLine();
		board.put(sInput, sInputValues);
		
	}


}
















