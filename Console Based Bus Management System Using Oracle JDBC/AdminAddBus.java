package practise;
import java.sql.SQLException;
import java.util.*;
import java.util.*;
public class AdminAddBus {
	Scanner sc = new Scanner(System.in);
	public void add_new_Bus(Bus a1,Adminaddcon adc1) throws InterruptedException, ClassNotFoundException, SQLException {
		sc.nextLine();
		System.out.println("Enter the Bus Number:");
		a1.setBusName(sc.nextLine());
		Thread.sleep(500);
		
		System.out.println("Enter the Initial place of departure:");
		a1.setBusInitial(sc.nextLine());		
		Thread.sleep(500);
		
		System.out.println("Enter the destination of place:");
		a1.setBusDestination(sc.nextLine());
		Thread.sleep(500);
		
		System.out.println("Enter the departure Timings:");
		a1.setBusTimings(sc.nextLine());
		Thread.sleep(500);
		
		boolean check = adc1.Adminadd(a1);
		if(check) {
			System.out.println("You have entered the details");
		}else {
			System.out.println("retry again..!");
		}
	}
	
	

}
