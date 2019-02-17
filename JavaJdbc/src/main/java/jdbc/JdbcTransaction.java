package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransaction {

	public static void main(String[] args) throws SQLException {

		Connection conn = JdbcConnect.getConnect();
		
		Statement statement1 = conn.createStatement();
//		Statement statement2 = conn.createStatement();
		
		// set autocommit ban dau la false
		conn.setAutoCommit(false);
		
		String sql1 = "insert into person (id, name) values (1, 'dong')";
		String sql2 = "delete from person where id = 3";
		statement1.executeUpdate(sql2);
		statement1.executeUpdate(sql1);
		
		// nếu không xảy ra lỗi thì chạy vào commit và sẽ thưc thi trong db
		// còn nếu có lỗi ở trên thì không commit vào db
		conn.commit();
	}
}
