package k_jdbc;

import java.util.List;
import java.util.Map;

public class test {
	

	public static void main(String[] args) {
		
//		JDBCUtil jdbc = JDBCUtil.getInstance();
		JDBCUtil_teacher jdbc_teacher = JDBCUtil_teacher.getInstance(); 

		String sql = "SELECT * FROM dept";
		
//		jdbc.selectOne(sql);
		Map<String, Object> selectOne = jdbc_teacher.selectOne(sql);
//		List<Map<String, Object>> selectList(String sql, List<Object> param)
		List<Map<String, Object>> selectList = jdbc_teacher.selectOne(sql, temp);

//		jdbc.selectList(sql, param);
	}

}
