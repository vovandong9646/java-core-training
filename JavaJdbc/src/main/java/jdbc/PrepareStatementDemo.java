package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementDemo {
	public static void main(String[] args) {

		PrepareStatementDemo ds = new PrepareStatementDemo();
//		ds.findById(2);
//		ds.insert("DongVoVan123123");
//		ds.update(5, "VoVanDong");
//		ds.delete(5);
//		ds.findAll();

	}

	public void findById(int id) {
		try {
			String sql = "select * from person where id= ?";
			PreparedStatement ps = JdbcConnect.getConnect().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void findAll() {
		try {
			String sql = "select * from person";
			PreparedStatement ps = JdbcConnect.getConnect().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(String name) {
		try {
			String sql = "insert into person (name) values (?)";
			PreparedStatement st = JdbcConnect.getConnect().prepareStatement(sql);
			st.setString(1, name);
			int result = st.executeUpdate();
			if (result != 0) {
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
			String sql = "update person set name=? where id=?";
			PreparedStatement st = JdbcConnect.getConnect().prepareStatement(sql);
			st.setString(1, name);
			st.setInt(2, id);
			int result = st.executeUpdate();
			if (result != 0) {
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
			String sql = "delete from person where id=?";
			PreparedStatement st = JdbcConnect.getConnect().prepareStatement(sql);
			st.setInt(1, id);
			int result = st.executeUpdate();
			if (result != 0) {
				System.out.println("insert success, last Id: " + result);
			} else {
				System.out.println("insert fail");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
