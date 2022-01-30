package practise;
import java.util.*;
import java.sql.*;

public class UserReservationShowCon {
	public void showReservation(String mobileno) {
		
	try {
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
		Statement st = con.createStatement();
		
		String query = ("select * from ENTEREDDETAILS where PHONE_NO = '"+mobileno+"'");
		ResultSet rs = st.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getString(1) +" "+ rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
		}
		
		
		con.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}
