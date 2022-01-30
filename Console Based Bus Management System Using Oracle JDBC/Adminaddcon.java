package practise;
import java.util.*;
import java.sql.*;
public class Adminaddcon {
	
	public boolean Adminadd(Bus a) throws ClassNotFoundException, SQLException {
		boolean check = false;
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
			
			
			String query = "insert into BUS values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, a.getBusName());
			pst.setString(2, a.getBusInitial());
			pst.setString(3, a.getBusDestination());
			pst.setString(4, a.getBusDestination());
			
			check = true;
			pst.executeUpdate();
			con.close();
			pst.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return check;
		
		
	}

}
