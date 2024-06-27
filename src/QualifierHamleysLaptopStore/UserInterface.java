package QualifierHamleysLaptopStore;
import java.util.*;
public class UserInterface {
	
	public static LaptopInfo extractDetails(String laptopDetails)
	{
		String[] details_lap=laptopDetails.split(":");
		return new LaptopInfo(details_lap[0],details_lap[1],details_lap[2],Double.parseDouble(details_lap[3]));
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the laptop details");
		String lap_details=sc.next();
		
		LaptopInfo lap=extractDetails(lap_details);
		
		if(lap.calculatelaptopCost()!=-1)
		{
			System.out.println("Laptop Id: "+lap.getLaptopId());
			System.out.println("Model Name: "+lap.getModelname());
			System.out.println("Brand Name: "+lap.getBrandName());
			System.out.println("Laptop cost: "+lap.calculatelaptopCost());
		}
		else
		{
			System.out.println("Invalid laptop details");
		}
	}
	

}
