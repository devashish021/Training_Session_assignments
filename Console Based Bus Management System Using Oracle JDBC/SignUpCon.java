package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SignUpCon {
	
	public boolean add_user(UserSignup a) {
		boolean check = false;
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
			  
			
			
			String query = "insert into usersignup values(?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			
			st.setString(1, a.getName());
			st.setString(2, a.getEmailid());
			st.setString(3, a.getMobileno());
			st.setString(4, a.getPassword());
			check = true;
			
			st.executeUpdate();
			st.close();
			con.close();
			
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return check;
		
	}

}
