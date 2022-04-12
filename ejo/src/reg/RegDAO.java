package reg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login.LoginDAO;

public class RegDAO extends LoginDAO{
	
	public void insert(RegDTO reg) {
	      //INSERT INTO fx_concept VALUES(이름, 아이디, 비번, 이메일, 전화번호, 비밀번호 질문, 비밀번호 답, 가입일);
	      String sql = "INSERT INTO USERINFO VALUES(?,?,?,?,?,?,?,?)";
	      Connection con = getCon();
	      PreparedStatement ps = null;
	      
	      try {
	         ps = con.prepareStatement(sql);
	         ps.setString(1, reg.getName());
	         ps.setString(2, reg.getId());
	         ps.setString(3, reg.getPw());
	         ps.setString(4, reg.getEmail());
	         ps.setString(5, reg.getPhone());
	         ps.setString(6, reg.getPwQuestion());
	         ps.setString(7, reg.getPwAnswer());
	         ps.setString(8, " ");
	         ps.executeUpdate();
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(ps != null) ps.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	

}
