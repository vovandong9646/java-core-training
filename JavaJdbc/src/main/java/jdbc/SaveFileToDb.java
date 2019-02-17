package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Statement;

public class SaveFileToDb {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("test.txt");
		FileInputStream fis = new FileInputStream(file);
		Statement st = JdbcConnect.getConnect().createStatement();
		
		int rs = st.executeUpdate("insert into file (name, file) values ('test.txt','"+fis+"')");
		if(rs != 0) {
			System.out.println("them thanh cong");
		}
	}
	
}
