package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import reg.RegDTO;


public class LoginDAO {
	private Connection con;
	private PreparedStatement ps;
	
	
	public Connection getCon() {
		return con;
	}
	
	public LoginDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String pass = "oracle";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public RegDTO selectId(String id) {
		
		PreparedStatement ps= null;
		ResultSet rs= null;
		RegDTO login = null;
		String sql = "SELECT * FROM USERINFO WHERE id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				login = new RegDTO();
				login.setId(rs.getString("id"));
				login.setPw(rs.getString("pw"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return login;
	}
}

