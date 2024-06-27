package QualifierMirajCinemas;

import java.util.Scanner;

public class UserInterface {
	
	public static MovieTickets extractDetails(String movieDetails){
		//Fill the code here
		String[] movie_details=movieDetails.split(":");
		return new MovieTickets(movie_details[0],movie_details[1],Integer.parseInt(movie_details[2]),movie_details[3],movie_details[4],movie_details[5]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter Details");
		String details=sc.nextLine();
		
		MovieTickets mve=extractDetails(details);
		
		if(mve.calculatePrice()!=0)
		{
		    System.out.println("Movie Name: "+mve.getMovieName());
		    System.out.println("ScreenNumber: "+mve.getScreenNumber());
		    System.out.println("Number of tickets: "+mve.getNoOfTickets());
		    System.out.println("Show Timing: "+mve.getTime());
		    System.out.println("Ticket Cost: "+mve.calculatePrice());
		    System.out.println("TicketId: "+mve.generateTicketId());
		    System.out.println("Thank you! Your payment received via Gpay, Your movie tickets are confirmed.");
		}
		else{
		    System.out.println("Invalid movie details");
		}

	}

}
/*Sample Input/Output -1  

Enter the details  

Love Today:S1:15:9958456545:10.00Pm:Gpay  

Ticket Details  

Movie Name: Love Today

Screen Number: S1  

Number of tickets: 15    

Show Timing: 10.00 Pm 

Ticket Cost: 4235.0  

TicketId:  LvS1N15  

Thank you! Your payment received via Gpay, Your movie tickets are confirmed.   



Sample Input/Output -2  

Enter the details  

Frozen:S5:7:9957856545:2.00Pm:PayTM  

Ticket Details  

Movie Name: Frozen  

Number of tickets: 7  

Screen Number: S5  

Show Timing: 2.00PM  

Ticket Cost: 1260.0  

TicketId: FrS5N7  

Thank you! Your payment received via PayTM, Your movie tickets are confirmed.  



Sample Input/Output -3 

Enter the details  

Bigil:S6:12:8545456465:12.00PM:Card  

Invalid movie details




Sample Input / Output -4 

Enter the details  

Bigil:S4:-4:8545456465:12.00PM:Card  

Invalid movie details*/