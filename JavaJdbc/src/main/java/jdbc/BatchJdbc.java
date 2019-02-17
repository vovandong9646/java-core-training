package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class BatchJdbc {

	public static void main(String[] args) throws SQLException {
		
		// insert bằng batch
		// thực thi 1 lần -> các câu lệnh insert, ... được chạy 1 lần mà không phải chờ 
		
		Statement st = JdbcConnect.getConnect().createStatement();
		
		for(int i=0;i<1000;i++) {
			st.addBatch("insert into person (name) values ('Dong"+i+"')");
		}
		st.executeBatch();
		
//		for(int i=0;i<1000;i++) {
//			st.executeUpdate("insert into person (name) values ('Dong"+i+"')");
//		}
	}
	
}
