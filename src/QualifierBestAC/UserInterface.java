package QualifierBestAC;
import java.util.Scanner;
public class UserInterface {
    
public static ACInfo extractDetails(String acDetails)
{
      String [] details=acDetails.split(":");
      return new ACInfo(details[0],details[1],details[2],details[3],details[4],Integer.parseInt(details[5]));
}

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the AC purchase details");
String input=sc.nextLine();

ACInfo ac=extractDetails(input);

if(ac.calculateACCost()!=-1)
{
    System.out.println("Customer Id : "+ac.getCustomerId());
    System.out.println("Customer Name : "+ac.getCustomerName());
    System.out.println("AC Type : "+ac.getAcType());
    System.out.println("AC Capacity : "+ac.getAcCapacity());
    System.out.println("Cooling Capacity : "+ac.getCoolingCapacity());
    System.out.println("Quantity : "+ac.getQuantity());
    System.out.println("Total cost to be paid : "+ac.calculateACCost());
}
else{
    System.out.println("Invalid AC details");
}

}
}
