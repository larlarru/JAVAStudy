package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class CopyOfJDBCBoard_Test1 {
	
	
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
	
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "larlarru";
	static String password = "java";

	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
		
	

	public static void main(String[] args) {
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			//임의의 테이블에 insert 할 수 있는 코드를 작성해주세요.
//			SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD;
			String sql = "insert into dept_test values(?, ?, ?, ?, ?)";
	
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "안녕하세요");
			ps.setString(3, " ");
			ps.setString(4, "홍길동");
			ps.setString(5, "");
//			ps.setDate(5, new Date(new java.sql.Date().getTime()));
//			ps.setDate(3, new Date(new java.util.Date().getTime()));
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "개의 행이 바뀌었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 여기 finally에서 실행
			if (rs != null) try { rs.close(); } catch (Exception e) { }
			if (ps != null) try { ps.close(); } catch (Exception e) { }
			if (con != null) try { con.close(); } catch (Exception e) { }
		}
		
		board.put("번호", boardNum);
		board.put("제목", "안녕하세요");
		board.put("내용", "");
		board.put("작성자", "홍길동");
		board.put("작성일", today1.format(today));
		
		Board.add(board);
		
		
		
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
		boardStart : while(true) {
			System.out.println("1.조회\t2.등록\t3.수정\t4.삭제\t5.종료");
			System.out.print("입력>");
			input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
/*				System.out.println("조회부분");
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
*/				boardinquiry();
				break;
			case 2 : 
				boardCreate();
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
	
	private static void boardinquiry() {
		System.out.println("조회부분");
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
	}

	private static void boardCreate() {
		Date today = new Date();
			board = new HashMap<>();
			int tempNum = 0;
			int boardNumber;
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				//임의의 테이블에 insert 할 수 있는 코드를 작성해주세요.
//				SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD;
				String sql = "select nvl(max(board_no),0) + 1 from TB_jdbc_board";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				tempNum = rs.getInt("BOARD_NO");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 여기 finally에서 실행
				if (rs != null) try { rs.close(); } catch (Exception e) { }
				if (ps != null) try { ps.close(); } catch (Exception e) { }
				if (con != null) try { con.close(); } catch (Exception e) { }
			}
			
			/*for (int i = 0; i < Board.size(); i++) {
				HashMap<String, Object> b = Board.get(i);
				if(tempNum < (Integer)b.get("번호")) {
					tempNum = (Integer)b.get("번호");
				}
				
			}
			tempNum++;*/
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
	
	static void boardChange() {
		System.out.println(Board);
				
		
		System.out.print("수정할 게시판 부분 입력>");
		sInput = ScanUtil.nextLine();
		System.out.print("수정할 게시판 부분에 입력할 입력>");
		sInputValues = ScanUtil.nextLine();
		board.put(sInput, sInputValues);
	}
	
	static void remove() { //제거부분은 구현했으나 그당시등록된?부분만 제거 가능
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			System.out.println("번호\t" + "제목\t" + "내용\t" + "작성자\t" + "작성일\t");
			System.out.print(b.get("번호") + "\t");
			System.out.print(b.get("제목") + "\t");
			System.out.print(b.get("내용") + "\t");
			System.out.print(b.get("작성자") + "\t");
			System.out.println(b.get("작성일"));
			System.out.println("----------------------------------------------------");
		}
		System.out.print("지울 게시판 입력(0번부터 시작임)>");
		input = ScanUtil.nextInt();
		for (int i = 0; i < Board.size(); i++) {
			HashMap<String, Object> b = Board.get(i);
			if((Integer)b.get("번호") == input) {
				Board.remove(i);
			}
		}
	}

}



















