package practise;
import java.util.*;
import java.sql.*;
public class AdminLogin {
	Scanner sc = new Scanner(System.in);
	public void check_ad_login(AdminLoginCon ad1) {
		sc.nextLine();
		System.out.println("Enter the email id");
		String email = sc.nextLine();
		System.out.println("Enter the Password:");
		String pass = sc.nextLine();
		boolean check = ad1.admin_log_in(email, pass);
		if(check) {
			System.out.println("You have successfully loggedin");
		}else {
			System.out.println("Retry Again:");
		}
		
	}
	

}
