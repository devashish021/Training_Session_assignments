package practise;
import java.util.*;
import java.sql.*;

public class UserShowBuses {
	public void showBuses() {
		
			boolean check = false;
			try {
				//step1 load the driver class  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				  
				//step2 create  the connection object  
				Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
				Statement st = con.createStatement();
				
				String query = ("select * from BUS");
				ResultSet rs = st.executeQuery(query);
				while(rs.next()) {
					System.out.println(" Bus nnumber : "+rs.getString(1)+"\n Initial Place : "+rs.getString(2)+ " \nDestination Place: "+rs.getString(3)+"\n Timings: "+rs.getString(4)+"\n");  
				
				}
				con.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
		
	}
}


