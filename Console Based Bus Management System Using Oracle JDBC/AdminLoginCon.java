package practise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.*;

public class AdminLoginCon {
	
	public boolean admin_log_in(String email, String pass) {
		boolean check =false;
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
			
			Statement st = con.createStatement();
			
			String query = ("select PASSWORD1 from ADMINUSER where USERNAME = '"+email+"'");
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			String pas = rs.getString(1);
			con.close();
			if(pas.equals(pass)) {
				return true;
			}
					}catch(Exception e) {
			System.out.println(e);
		}
		return check;
	}

}
