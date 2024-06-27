package QualifierGreatBeginings;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;;

public class UserInterface {
	public static Event extractDetails(String eventDetails)throws ParseException
	{
		String[] details=eventDetails.split(":");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return new Event(details[0],details[1],formatter.parse(details[2]),formatter.parse(details[3]),Double.parseDouble(details[4]));	
}
	public static void main(String args[])throws ParseException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Event Details");
		String input=sc.nextLine();
		
		Event ev=extractDetails(input);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		
		if(ev.calculateAmountToBePaid()!=-1)
		{
			
			System.out.println("Event Id : "+ev.getEventId());
			System.out.println("Event Type : "+ev.getEventType());
			System.out.println("Date Of Registration : "+formatter.format(ev.getDateOfRegistration()));
			System.out.println("Date Of Event : "+formatter.format(ev.getDateOfEvent()));
			System.out.println("Payment : "+ev.getPayment());
			System.out.println("Amount to be paid by the Customer : "+ev.calculateAmountToBePaid());
		}
		else
		{
			System.out.println("Invalid Event Details");
		}
	}
}

//Enetr Event Details
//EVENT7627:Weddings:13/02/2021:04/04/2022:90000
//Event Id : EVENT7627
//Event Type : Weddings
//Date Of Registration : Sat Feb 13 00:00:00 IST 2021
//Date Of Event : Mon Apr 04 00:00:00 IST 2022
//Payment : 90000.0
//Amount to be paid by the Customer : 79200.0
