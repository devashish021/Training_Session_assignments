package practise;
import java.util.*;
import java.sql.*;

public class AdminDeleteCon {
	
	public boolean delete_bus(String BusNumber) {
		boolean check = false;
		
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
			
			String query ="DELETE FROM BUS WHERE BUSNAME='"+BusNumber+"'";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.executeUpdate();
			con.close();
			pst.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return check;
		
	}

}
