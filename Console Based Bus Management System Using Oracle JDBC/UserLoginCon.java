package practise;
import java.sql.*;

public class UserLoginCon {
	
	public boolean check_login(String email, String pass) {
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");
			//step3 create the statement object  
			Statement st=con.createStatement();  
			
			String query =" select PASSWORD1 from USERSIGNUP where EMAILID ='"+email+"'";
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			String pas = rs.getString(1);
			if(pas.equals(pass)) {
				return true;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	

}
