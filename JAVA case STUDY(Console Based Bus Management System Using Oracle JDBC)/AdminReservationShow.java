package practise;
import java.util.*;
import java.sql.*;


public class AdminReservationShow {
	
	public boolean Reservation() {
		boolean check = false;
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104"); 
			
			//step3 create the statement object  
			Statement st=con.createStatement();  
			
			String query ="SELECT * FROM RESERVATION";
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			
			con.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return check;
	}

}
