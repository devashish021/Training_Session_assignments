package practise;
import java.util.*;
import java.sql.*;

public class UserLogincheck {
	Scanner sc = new Scanner(System.in);
	
	public void loginCheck(UserLoginCon l1) {
		sc.nextLine();
		System.out.println("Enter your email:");
		String email = sc.nextLine();
		System.out.println("Enter your password:");
		String pass = sc.nextLine();
		
		boolean check = l1.check_login(email, pass);
		if(check) {
			System.out.println("successfully logged in");
		}else {
			System.out.println("Retry again");
		}
		
	}

}
