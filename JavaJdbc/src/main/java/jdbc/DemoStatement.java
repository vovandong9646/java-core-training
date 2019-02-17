package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoStatement {

	public static void main(String[] args) {
		
		DemoStatement ds = new DemoStatement();
//		ds.findAll();
//		ds.findById(2);
//		ds.insert("DongVoVan");
//		ds.update(2, "VoVanDong");
//		ds.delete(4);
		
	}
	
	public void findById(int id) {
		try {
			Statement st = JdbcConnect.getConnect().createStatement();
			ResultSet rs = st.executeQuery("select * from person where id="+id);
			while(rs.next()) {
				System.out.println(rs.getInt("id") +" - "+ rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void findAll() {
		try {
			Statement st = JdbcConnect.getConnect().createStatement();
			ResultSet rs = st.executeQuery("select * from person");
			while(rs.next()) {
				System.out.println(rs.getInt("id") +" - "+ rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String name) {
		try {
			Statement st = JdbcConnect.getConnect().createStatement();
			int result = st.executeUpdate("insert into person (name) values ('"+name+"')");
			if(result != 0) {
				System.out.println("insert success, last Id: " + result);
			} else {
				System.out.println("insert fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(int id, String name) {
		try {
			Statement st = JdbcConnect.getConnect().createStatement();
			int result = st.executeUpdate("update person set name='"+name+"' where id="+id);
			if(result != 0) {
				System.out.println("insert success, last Id: " + result);
			} else {
				System.out.println("insert fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			Statement st = JdbcConnect.getConnect().createStatement();
			int result = st.executeUpdate("delete from person where id="+id);
			if(result != 0) {
				System.out.println("insert success, last Id: " + result);
			} else {
				System.out.println("insert fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
