package jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadFileFromDb {

	public static void main(String[] args) throws Exception{
		
		Statement st = JdbcConnect.getConnect().createStatement();
		ResultSet rs =st.executeQuery("select * from file");
		while(rs.next()) {
			String name = rs.getString("name");
			Blob file = rs.getBlob("file");
			
			// ghi data from db to file
			byte[] b = file.getBytes(1, (int)file.length());
			FileOutputStream fos = new FileOutputStream(name);
			fos.write(b);
			fos.close();
		}
	}
}
