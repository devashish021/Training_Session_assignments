package practise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.*;

public class UserReservationAddCon {
	public boolean UserAdd(ReservationDeails rd) {
		boolean check = false;
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","BusManagement","Deva@2104");  
			
			
			String query = "insert into ENTEREDDETAILS values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, rd.getName());
			pst.setString(2, rd.getAge());
			pst.setString(3, rd.getMobile());
			pst.setString(4, rd.getBusId());
			
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
