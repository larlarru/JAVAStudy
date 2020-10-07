package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;
import java.util.Set;

import oracle.sql.DATE;

public class JDBCBoard_Test {
	
	
	private static HashMap<String, Object> board = new HashMap<>();
	private static ArrayList<HashMap<String, Object>> Board = new ArrayList<>();
	private static Date today = new Date(new java.util.Date().getTime());
	private static SimpleDateFormat today1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
	static int input;
	static String sInput;
	static String sInputName;
	static String sInputValues;
	static int boardNum = 1;
	static int temp;
	static int tempNum = 0;
	
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "larlarru";
	static String password = "java";

/*	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
*/	
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	
	static String col;
	static String colVal;
	static int board_no_NUM;
	

	public static void main(String[] args) {
		
		con = null;
		ps = null;
		rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			
			//나중에 con.commit();해주기이거는 con.close();전에 해주면된다.
			
			//게시판 시작하면 바로 눈에 뜰 수 있게 게시판 등록
//			SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD;
			String sql = "INSERT INTO TB_JDBC_BOARD (board_no, title, content, user_id, reg_date) VALUES(?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "안녕하세요");
			ps.setString(3, " ");
			ps.setString(4, "홍길동");
			ps.setDate(5, new Date(new java.util.Date().getTime()));
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "개의 행이 추가되었습니다.");
			
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
				boardinquiry();
				break;
			case 2 : 
				boardCreate();
				break;
			case 3:
				boardUpdate();
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
	
	/*private*/ static void boardinquiry() {
		System.out.println("조회부분");
		
		//sql에 등록된 게시판 내용 조회
		con = null;
		ps = null;
		rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			input=0;
			
			
			//임의의 테이블에 insert 할 수 있는 코드를 작성해주세요.
//			SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD;
			String sql = "select * from tb_jdbc_board";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				//db에 저장된 데이터 형태에따라 String int date뭐 이런식으로 달라진다. date받아올고면 DATE 변수 이렇게 해주면된다.
				int BOARD_NO = rs.getInt(1);
				String TITLE = rs.getString(2);
				String CONTENT = rs.getString(3);
				String USER_ID = rs.getString(4);
				Date REG_DATE = rs.getDate(5);
				System.out.println("번호 : " + BOARD_NO + 
						" // 제목 : " + TITLE + 
						" // 내용 : " + CONTENT +
						" // 작성자 : " + USER_ID +  
						" // 작성일 : " + REG_DATE);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 여기 finally에서 실행
			if (rs != null) try { rs.close(); } catch (Exception e) { }
			if (ps != null) try { ps.close(); } catch (Exception e) { }
			if (con != null) try { con.close(); } catch (Exception e) { }
		}
	}

	/*private*/ static void boardCreate() {
//		Date today = new Date();
			board = new HashMap<>();
//			int tempNum = 0;
			int boardNumber;
			
			con = null;
			ps = null;
			rs = null;
			
			//게시판 내용 등록을 sql에 등록시켜주는 부분
			try {
				con = DriverManager.getConnection(url, user, password);
				
				//sql에 테이블 조회해서 행?을 조회후에 +1해서 게시판 번호 찾아서 부여하는 부분
//				SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD;
				String sql = "SELECT NVL(MAX(board_no),0) + 1 board_no FROM TB_JDBC_BOARD";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					tempNum = rs.getInt("BOARD_NO");
					board.put("번호", tempNum);
				}
				//게시판 번호 sql에 등록
				sql = "INSERT INTO TB_JDBC_BOARD (board_no, title, content, user_id, reg_date) VALUES(?, ?, ?, ?, ?)";
				ps = con.prepareStatement(sql);
				ps.setInt(1, tempNum);
				board.put("번호", tempNum);
				
				//게시판 제목 sql에 등록
				System.out.print("등록할 게시판 제목 입력>");
				sInput = ScanUtil.nextLine();
				ps.setString(2, sInput);
				board.put("제목", sInput);
				
				//게시판 내용 sql에 등록
				System.out.print("등록할 게시판 내용 입력>");
				sInput = ScanUtil.nextLine();
				ps.setString(3, sInput);
				board.put("내용", sInput);
				
				//게시판 작성자 sql에 등록
				System.out.print("등록할 게시판 작성자 입력>");
				sInput = ScanUtil.nextLine();
				ps.setString(4, sInput);
				board.put("작성자", sInput);
				
				//게시판 작성일 sql에 등록 
				ps.setDate(5, new Date(new java.util.Date().getTime()));
				board.put("작성일", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(today));
				
				//게시판 등록되면 메세지 뜸
				int result = ps.executeUpdate();
				System.out.println(result + "개의 행이 추가되었습니다.");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 여기 finally에서 실행
				if (rs != null) try { rs.close(); } catch (Exception e) { }
				if (ps != null) try { ps.close(); } catch (Exception e) { }
				if (con != null) try { con.close(); } catch (Exception e) { }
			}
			
	}
	
	//게시판 수정
	static void boardUpdate() {
		
		//게시판 수정 시작 부분
		update : while(true) {
			try {
				//게시판 조회부분
				con = DriverManager.getConnection(url, user, password);
				input=0;
				String sql = "select * from tb_jdbc_board";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					int BOARD_NO = rs.getInt(1);
					String TITLE = rs.getString(2);
					String CONTENT = rs.getString(3);
					String USER_ID = rs.getString(4);
					Date REG_DATE = rs.getDate(5);
					System.out.println("번호 : " + BOARD_NO + " 제목 : " + TITLE + 
							" 내용 : " + CONTENT + " 작성자 : " + USER_ID + " 작성일 : " + REG_DATE);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 여기 finally에서 실행
				if (rs != null) try { rs.close(); } catch (Exception e) { }
				if (ps != null) try { ps.close(); } catch (Exception e) { }
				if (con != null) try { con.close(); } catch (Exception e) { }
			}
			
			//게시판 수정 부분
			con = null;
			ps = null;
			rs = null;
			try {
				con = DriverManager.getConnection(url, user, password);
				
				//UPDATE TB_JDBC_BOARD SET content = 'a'  WHERE board_no = 1;
				//col, colVal, board_no_NUM
				String sql = "UPDATE TB_JDBC_BOARD SET board_no = ?, title = ?, content = ? , user_id = ? , /*reg_date = ?*/ WHERE board_no = ?";
				ps = con.prepareStatement(sql);
//				System.out.print("수정할 게시판 부분 입력>");
//				sInput = ScanUtil.nextLine();
//				ps.setString(3, sInput);
				System.out.print("수정할 게시판 번호 입력>");
				input = ScanUtil.nextInt();
				ps.setInt(1, input);
				System.out.print("수정할 게시판 내용 입력>");
				sInput = ScanUtil.nextLine();
				ps.setString(2, sInput);
				System.out.print("수정할 게시판 내용 입력>");
				sInput = ScanUtil.nextLine();
				ps.setString(3, sInput);
				System.out.print("수정할 게시판 내용 입력>");
				sInput = ScanUtil.nextLine();
				ps.setString(4, sInput);
//				System.out.print("수정할 게시판 내용 입력>");
//				sInput = ScanUtil.nextLine();
//				ps.setDate(5, new Date(new java.util.Date().getTime()));
				System.out.print("수정할 게시판 번호 입력>");
				input = ScanUtil.nextInt();
				ps.setInt(5, input);
//				System.out.println("개의 행이 수정 되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 여기 finally에서 실행
				if (rs != null) try {  rs.close(); } catch (Exception e) { }
				if (ps != null) try { ps.close(); } catch (Exception e) { }
				if (con != null) try { con.close(); } catch (Exception e) { }
			}
			
			break update;
		}
	}
	
	//게시판 삭제 총괄하는 부분
	static void remove() { 
		//삭제 시작 부분
		delete : while(true) {
		System.out.print("0번 목록 이동\t1.삭제>");
		input = ScanUtil.nextInt();
		if (1 == input) {
			//sql에 등록된 게시판 내용 조회
			con = null;
			ps = null;
			rs = null;
			
			try {
				//게시판 조회부분
				con = DriverManager.getConnection(url, user, password);
				input=0;
				String sql = "select * from tb_jdbc_board";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					int BOARD_NO = rs.getInt(1);
					String TITLE = rs.getString(2);
					String CONTENT = rs.getString(3);
					String USER_ID = rs.getString(4);
					Date REG_DATE = rs.getDate(5);
					System.out.println("번호 : " + BOARD_NO + " 제목 : " + TITLE + 
							" 내용 : " + CONTENT + " 작성자 : " + USER_ID + " 작성일 : " + REG_DATE);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 여기 finally에서 실행
				if (rs != null) try { rs.close(); } catch (Exception e) { }
				if (ps != null) try { ps.close(); } catch (Exception e) { }
				if (con != null) try { con.close(); } catch (Exception e) { }
			}


		System.out.print("삭제할 게시판 번호 입력>");
		input = ScanUtil.nextInt();
		con = null;
		ps = null;
		rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			//게시판 삭제부분
			String sql = "DELETE TB_JDBC_BOARD WHERE board_no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, input);
			int result = ps.executeUpdate();
			System.out.println(result + "개의 행이 삭제 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 여기 finally에서 실행
			if (rs != null) try { rs.close(); } catch (Exception e) { }
			if (ps != null) try { ps.close(); } catch (Exception e) { }
			if (con != null) try { con.close(); } catch (Exception e) { }
		}
		
		break delete;
		
	} else if (0 == input) {
		break delete;
	} else System.out.println("잘못입력하셨습니다.");
		
		}
	}

}



















