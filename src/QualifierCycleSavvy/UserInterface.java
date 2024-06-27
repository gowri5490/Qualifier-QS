package QualifierCycleSavvy;
import java.util.Scanner;
public class UserInterface {
	public static CycleInfo extractDetails(String cycledetails)
	{
		String[] details=cycledetails.split(":");
		return new CycleInfo(details[0],details[1],details[2],details[3],Double.parseDouble(details[4]));
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cycle details");
		
		String input=sc.nextLine();
		
		CycleInfo cyc=extractDetails(input);
		
		if(cyc.calculateBillAmount()!=-1)
		{
			System.out.println("Cycle Details");
			System.out.println("Cycle ID :"+cyc.getCycleId());
			System.out.println("Cycle Name :"+cyc.getCycleName());
			System.out.println("Cycle Type :"+cyc.getCycleType());
			System.out.println("Wanted Accessories: "+cyc.getAccessories());
			System.out.println("Cycle Price :"+cyc.getPrice());
			System.out.println("Bill amount to be paid: "+cyc.calculateBillAmount());
		}
		else 
		{
			System.out.println("Invalid Cycle details");
		}
	}

}
//Enter the cycle details
//CYCAS345:Hi-Fast Gangster x89:Road Cycle:yes:24000
//Cycle Details
//Cycle ID :CYCAS345
//Cycle Name :Hi-Fast Gangster x89
//Cycle Type :Road Cycle
//Wanted Accessories: yes
//Cycle Price :24000.0
//Bill amount to be paid: 25480.0

//Enter the cycle details
//CYCEL908:LifeLong Falcon678:Electric Cycle:y:8890
//Invalid Cycle details
//Enter the cycle details
//CYCMO567:FireFox Kreed 27.5D:Mountain Cycle:no:17900
//Cycle Details
//Cycle ID :CYCMO567
//Cycle Name :FireFox Kreed 27.5D
//Cycle Type :Mountain Cycle
//Wanted Accessories: no
//Cycle Price :17900.0
//Bill amount to be paid: 18795.0
