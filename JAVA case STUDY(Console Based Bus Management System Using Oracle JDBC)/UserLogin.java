package practise;
import java.util.*;
import java.sql.*;

public class UserLogin {
	Scanner sc = new Scanner(System.in);
	UserLogincheck lvl1 = new UserLogincheck();
	
	public void check_new_user(UserSignup u1,SignUpCon a1,UserLoginCon l1) throws InterruptedException {
		sc.nextLine();
		System.out.println("Enter your name:");
		u1.setName(sc.nextLine());
		Thread.sleep(500);
		System.out.println("Enter your email:");
		u1.setEmailid(sc.nextLine());
		Thread.sleep(500);
		System.out.println("Enter your Mobile Number:");
		u1.setMobileno(sc.nextLine());
		Thread.sleep(500);
		System.out.println("Enter the password: ");
		u1.setPassword(sc.nextLine());
		
		boolean check = a1.add_user(u1);
		if(check) {
			System.out.println("You have successfully signed up");
		}else {
			System.out.println("Retry again");
		}
		Thread.sleep(500);
		System.out.println("Move to Login Page/n please 1 if you want to login");
		int n = sc.nextInt();
		if(n==1) {
			lvl1.loginCheck(l1);
		}else {
			System.out.println("Please select 1 (Option)");
		}
	}

}
