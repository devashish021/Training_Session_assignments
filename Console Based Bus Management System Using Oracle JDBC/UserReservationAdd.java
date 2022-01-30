package practise;
import java.util.*;
import java.sql.*;
public class UserReservationAdd {
	Scanner sc= new Scanner(System.in);
	
	public void ReservationAdd(ReservationDeails rds,UserReservationAddCon urdc ) throws InterruptedException {
		sc.nextLine();
		System.out.println("Enter the Name:");
		rds.setName(sc.nextLine());
		Thread.sleep(500);
		
		System.out.println("Enter the Age:");
		rds.setAge(sc.nextLine());
		Thread.sleep(500);
		
		System.out.println("Enter the mobileNo:");
		rds.setMobile(sc.nextLine());
		Thread.sleep(500);
		
		System.out.println("Enter the BusNumber:");
		rds.setBusId(sc.nextLine());
		Thread.sleep(500);
		
		boolean check = urdc.UserAdd(rds);
		if(check) {
		 System.out.println("You have entered details successfully..! Thank you..!");
		}else {
			System.out.println("Please try again..!");
		}
			
	}

}
