package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = JdbcConnect.getConnect();
		
		// Dùng để gọi procedure hay function trong sqlserver hay oracle
		CallableStatement callableStatement = conn.prepareCall("{call findPerson(?)}");
		callableStatement.setString(1, "A");
		ResultSet rs = callableStatement.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
		
	}
}
