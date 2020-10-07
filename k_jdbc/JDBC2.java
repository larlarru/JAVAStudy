package k_jdbc;

import java.sql.Connection;
import java.sql.Date;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "larlarru";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from cart where cart_member = ?";
			ps = con.prepareStatement(sql); //prepareStatement는 위에  select문에서 값대신 ?넣고 그 값을 따로 셋팅할수 있
			ps.setString(1, "a001"); //첫번째 ?에 a001이라는 값을 넣겠다라는 의미이다.
//			ps.setInt(2, 10);
//			ps.setDate(3, new Date(new java.util.Date().getTime())); //date는 반드시 이렇게 해줘야한다.
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			//예시 : 몇개의 컬럼이 있는지 이런거에 대한거
			
			int columnCount = md.getColumnCount(); // 컬럼수
			
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					Object value = rs.getObject(i); //부모클래스?라서 타입 상관없디 다 받아온다.
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
			//임의의 테이블에 insert 할 수 있는 코드를 작성해주세요.
			sql = "insert into dept_test values(?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 99);
			ps.setString(2, "test");
			ps.setString(3, "test");
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "개의 행이 바뀌었습니다.");
			
//			rs = ps.executeQuery();
			

			sql = "select * from dept_test";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
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
			// 여기 finally에서 실행
			if (rs != null) try { rs.close(); } catch (Exception e) { }
			if (ps != null) try { ps.close(); } catch (Exception e) { }
			if (con != null) try { con.close(); } catch (Exception e) { }
		}
		
		
	}
	
	
	
	
	

}




















