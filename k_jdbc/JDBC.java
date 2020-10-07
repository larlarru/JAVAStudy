package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC --이건 따로 받아서 자바에 집어넣어야한다.
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성
		 * 2. Statement 생성(쿼리)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 * 
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "larlarru";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			con = DriverManager.getConnection(url, user, password);
			//getConnection에서 드라이버 자동 로드
			
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery();
			
			//insert, update, delete
//			int result = ps.executeUpdate();
			
			while(rs.next()) {
				/*
				 * next()가 실행되면 첫번째줄을 바라봄 그다음에 또 실행하면 그다음줄 바라보고 이렇게 반복된다.
				 * 그다음줄이 있는지 없는지 확인하면서 바라본다.
				 * 계속그러다가 다음줄이 없으면 while문에 false가 오면서 while문이 종료된다.
				 * row 갯수만큼 실행한다.
				 */
				
				//db에 저장된 데이터 형태에따라 String int date뭐 이런식으로 달라진다.
				String memId = rs.getString(1); //1번째에 있는 컬럼을 가져오겠다는거다
				String memPass = rs.getString("MEM_PASS"); //위에 컬럼순서 말고도 이렇게 이름을 적어서 하는 방법도 있다.
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
				
//				rs.getInt(1);
//				rs.getDate(1);
				
			}
			
			/* 쿼리 하나 더 만들고 싶으면 try문에 있는 
			 * String sql = "select * from member";
			 * 여기서부터 시작하면된다.
			 */
			//임의의 테이블 하나를 조회해서 테이블의 모든 내용을 출력해주세요.
			sql = "select * from dept";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery();
			System.out.println("\nDEPT 테이블 내용 :\n");
			while(rs.next()) {
				//db에 저장된 데이터 형태에따라 String int date뭐 이런식으로 달라진다. date받아올고면 DATE 변수 이렇게 해주면된다.
				int deptNo = rs.getInt("DEPTNO"); //숫자로 한다면1
				String dName = rs.getString("DNAME");//숫자로 한다면2
				String loc = rs.getString("LOC");//숫자로 한다면3
				System.out.println("DEPTNO : " + deptNo + " // DNAME : " + dName + " // LOC : " + loc);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//여기 finally에서 실행
			if (rs != null) try { rs.close();} catch (Exception e) {}
			if (ps != null) try { ps.close();} catch (Exception e) {}
			if (con != null) try { con.close();} catch (Exception e) {}
		}
		
		
		
		
	}
	
	
	
	

}

















