package jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataDemo {
	public static void main(String[] args) throws SQLException {
		
		Statement st = JdbcConnect.getConnect().createStatement();
		
		ResultSet rs = st.executeQuery("select * from person");
		
		// MetaData dùng để lấy thông tin của database
		ResultSetMetaData data = rs.getMetaData();
		System.out.println(data.getCatalogName(2));
		System.out.println(data.getColumnClassName(2));
		System.out.println(data.getPrecision(2));
		System.out.println(data.getScale(1));
		
	}
}
