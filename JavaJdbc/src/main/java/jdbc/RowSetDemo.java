package jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
		jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/test");
		jdbcRowSet.setUsername("root");
		jdbcRowSet.setPassword("");
		
		String sql ="select * from person";
		jdbcRowSet.setCommand(sql);
		jdbcRowSet.execute();
		
		while(jdbcRowSet.next()) {
			System.out.println(jdbcRowSet.getString("name"));
		}
		
	}
}
