package QualifierMalgudiVoyage;

import java.util.Scanner;
public class UserInterface {
	public static TicketInfo extractDetails(String ticketDetails)
	{
		//Fill the code here
		String[] details=ticketDetails.split(":");
		return new TicketInfo(details[0],Integer.parseInt(details[1]),details[2],details[3],details[4]);
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the passenger details");
		String input=sc.nextLine();
		
		TicketInfo irtc=extractDetails(input);
		
		if(irtc.calculateTicketCost()!=-1&&irtc.calculateTotalBookingCost()!=-1)
		{
			System.out.println("Passenger Name: "+irtc.getName());
			System.out.println("Number of Tickets: "+irtc.getNoOfTickets());
			System.out.println("Coach: "+irtc.getCoach());
			System.out.println("Mobile Number: "+irtc.getMobileNumber());
			System.out.println("Insurance Required: "+irtc.getInsurance());
			System.out.println("Total Booking Charge: Rs. "+(int)irtc.calculateTotalBookingCost());
		}
		else
		{
			System.out.println("Innalid Passenger details");
		}
	}

}


//Sample Input / Output 1:  
//
//Enter the passenger details
//
//Alex:2:FirstAC:8879678456:yes
//
//Passenger Details
//
//Passenger Name: Alex
//
//Number of Tickets: 2
//
//Coach: FirstAC
//
//Mobile Number: 8879678456
//
//Insurance Required: yes
//
//Total Booking Charge: Rs. 4916
//
//
//
//Sample Input / Output 2:  
//
//Enter the passenger details
//
//Mary:2:unreserve:8879789656:no
//
//Passenger Details
//
//Passenger Name: Mary
//
//Number of Tickets: 2
//
//Coach: unreserve
//
//Mobile Number: 8879789656
//
//Insurance Required: no
//
//Total Booking Charge: Rs. 400
//
//
//
//Sample Input / Output 3:  
//
//Enter the passenger details
//
//Leena:4:TwoTierAC:8890567890:yes
//
//Invalid Passenger details
//
//
//
//Sample Input / Output 4:  
//
//Enter the passenger details
//
//David:5:unreserve:9884455661:y
//
//Invalid Passenger details