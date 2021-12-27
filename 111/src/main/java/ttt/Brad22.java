package ttt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Brad21")
public class Brad22 extends HttpServlet {
	public Brad22() {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("OK");
			}catch (Exception e) {
				System.out.println(e.toString());
			}		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
			
		}
	
	private void addcust(String cname,String tel,String birthday) {
		Properties properties = new Properties();
		properties.put("user", "root");
		properties.put("password", "root");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eeit36", properties)){
			
			Statement stmtStatement = connection.createStatement();
			ResultSet rs = stmtStatement.executeQuery("show databases");
			while (rs.next()) {
				String dbNameString = rs.getString(1);
				System.out.println(dbNameString);
			}
			
			
	}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
	
	

	
	


