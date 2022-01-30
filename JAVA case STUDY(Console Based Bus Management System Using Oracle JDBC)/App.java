package practise;
import java.util.*;
import java.sql.*;


public class App {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		UserSignup usu = new UserSignup();
		UserLogin ul = new UserLogin();
		SignUpCon sc1 = new SignUpCon();
		UserLoginCon ulcon = new UserLoginCon();
		UserLogincheck ulc = new UserLogincheck();
		AdminUser au = new AdminUser();
		AdminLogin al = new AdminLogin();
		AdminLoginCon alc = new AdminLoginCon();
		Bus b1 = new Bus();
		Adminaddcon adcc = new Adminaddcon();
		AdminDeleteCon ADC = new AdminDeleteCon();
		AdminReservationShow ARS = new AdminReservationShow();
		AdminAddBus aab = new AdminAddBus();
		ReservationDeails rd = new ReservationDeails();
		UserReservationAddCon urac = new UserReservationAddCon();
		UserReservationAdd ura = new UserReservationAdd();
		UserShowBuses usb = new UserShowBuses();
		UserreservationCencelCon urcc = new UserreservationCencelCon();
		UserReservationShowCon ursc = new UserReservationShowCon();
		
		System.out.println("Welcome to Deva Travels:");
		Thread.sleep(800);
		System.out.println("Please Select the service below:");
		Thread.sleep(800);
		System.out.println("1.Signup(new User) \n2.UserLogin \n3.Admin Login \n");
		int n = sc.nextInt();
		boolean loop = true;
		
		if(n==1) {
			ul.check_new_user(usu, sc1, ulcon);
		}else if(n==2) {
			ulc.loginCheck(ulcon);
			while(loop) {
				System.out.println("Welcome to Deva Travels:");
				Thread.sleep(800);
				System.out.println("Please Enter the Service you want\n 1.Reservation \n 2.Cancel the Reservation\n 3.reservation details \n 4.Signout");
				int reserve = sc.nextInt();
				switch(reserve) {
				case 1:
					System.out.println("See the Buses available:");
					usb.showBuses();
					sc.nextLine();
					
					while(true) {
						ura.ReservationAdd(rd, urac);
						Thread.sleep(800);
						System.out.println("Reservation successfully completed..\n Press 1 for reservation\n press 0 for come out");
						int no = sc.nextInt();
						if(no!=1) {
							System.out.println("You came out of reservation.. Thank you..!");
							break;
						}
						
					}
				break;
				case 2:
					while(true) {
					sc.nextLine();
					System.out.println("Please Enter the name of person for Reservation cancellation:");
					String naam = sc.nextLine();
					System.out.println("Please provide registered mobile number:");
					String phone = sc.nextLine();
					urcc.cancel_reservation(naam, phone);
					System.out.println("Reservation has been cancelled successfully");
					System.out.println("Print 1 for cancelling another reservation");
					int can = sc.nextInt();
					if(can!=1) {
						System.out.println("You have moved to another page..Thank you..!");
						break;
					}
					}	
				break;
				case 3:
					while(true) {
						sc.nextLine();
						System.out.println("Enter the mobile number:");
						String mob = sc.nextLine();
						ursc.showReservation(mob);
						sc.nextLine();
						System.out.println("Thank you..!");
						break;
					}
					
				break;
				case 4:
					System.out.println("You have signedout successfully..!");
					
				break;
				default:
					System.out.println("You have entered wrong number..!");
				break;
				}
				break;
				
			}
			
		}else if(n==3) {
			al.check_ad_login(alc);
			while(loop) {
				System.out.println("Enter the Number of operations that you want to do:\n 1.To add Bus\n 2.to delete Bus\n 3.view all reservations \n 4.signout");
				int m = sc.nextInt();
				switch(m) {
				case 1:
					while(true) {
						aab.add_new_Bus(b1, adcc);
						System.out.println("You have sucessfully added Bus\n To add more bus press 1:");
						int add = sc.nextInt();
						if(add!=1) {
							System.out.println("you came out of add bus. Thank youu..!");
							break;
						}
						
					}
					break;
				case 2:
					while(true) {
						
						System.out.println("Enter the Bus Number that you want to delete:");
						sc.nextLine();
						String busno = sc.nextLine();
						ADC.delete_bus(busno);
						System.out.println("Bus Has Been Cancelled..!\n To delete more Buses press 1");
						int delno = sc.nextInt();
						if(delno!=1) {
							System.out.println("you have came out of delete. Thank you..!");
							break;
						}
						
					}
				break;
				case 3:
					while(true) {
						System.out.println("Here is Reservation Details:");
						ARS.Reservation();
						System.out.println();
						Thread.sleep(500);
						
						System.out.println("Thank You..!");
						break;
						
					}
				break;
				case 4:
					System.out.println("You have successfully signed out..Thank you..!");
				break;
				default:
					System.out.println("please Entered valid Key..! ");
					System.out.println("Thank you..!");
				break;
				}
				break;
				
			}
			
		}else {
			System.out.println("You have entered wrong number..!");
		}
		

	}

}
