package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	
	
	 //싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	//싱글톤 패턴이 다른 클래스에서 생성하지 못하게하고 빌려주게만 하게 한다. 
	
	private JDBCUtil() {
		
	}
	
	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInstance() {
		if (instance == null) {
			instance = new JDBCUtil();
		}
		return instance;
	}
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "larlarru";
	private String password = "java";

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	int input;
	
	/*
	 * 만들어야 할 메서드
	 * Map<String, Object> selectOne(String sql) //row 한개만 조회하겠다는 거다. 여기는 커리안에 ?없는경우
	 * Map<String, Object> selectOne(String sql, List<Object> param) //여기는 커리안에 ?있는 경우 부분 즉 ? 넣을값이 있는 부분이 List<Object> param 여기 arrayList라고 생각하면된다.
	 * List<Map<String, Object>> selectList(String sql) //?없는 경우
	 * List<Map<String, Object>> selectList(String sql, List<Object> param) //?있는 경우
	 * int update(String sql) //?없는거
	 * int update(String sql, List<Object> param) //?있는거 
	 */
	
	public Map<String, Object> selectOne(String sql) {
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			//모든 데이터를 리턴
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			
			while(rs.next()) {
				//한줄씩 조회?하기 때문에 HashMap에 저장된다. 만약 while밖에 있으면 제대로 저장이 안된다. 한줄한줄씩(?)
				Map<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
			}
			
		} catch (Exception e) {
		} finally {
			// 여기 finally에서 실행
			if (rs != null) try { rs.close(); } catch (Exception e) { }
			if (ps != null) try { ps.close(); } catch (Exception e) { }
			if (con != null) try { con.close(); } catch (Exception e) { }
		}
		
		
		
	}
	
	
	
	
	
	List<Map<String, Object>> selectList(String sql, List<Object> param) {
		//param은 ?효과
		
		List<Map<String, Object>> list = new ArrayList<>(); //리턴을 해줘야하기 때문에 여기다가 만듬
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}
			
			rs = ps.executeQuery();
			
			//모든 데이터를 리턴
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			
			while(rs.next()) {
				//한줄씩 조회?하기 때문에 HashMap에 저장된다. 만약 while밖에 있으면 제대로 저장이 안된다. 한줄한줄씩(?)
				Map<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				list.add(row);  //for문이 끝났을때 한줄이 완성되고 그걸 저장
			}
			
		} catch (Exception e) {
		} finally {
			// 여기 finally에서 실행
			if (rs != null) try { rs.close(); } catch (Exception e) { }
			if (ps != null) try { ps.close(); } catch (Exception e) { }
			if (con != null) try { con.close(); } catch (Exception e) { }
		}
		
		return list;
		
	}
	
	
	
	
	

}


















