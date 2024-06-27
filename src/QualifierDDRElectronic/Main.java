package QualifierDDRElectronic;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added:");
		int n=sc.nextInt();
		sc.nextLine();
		
		BatteryMain btr=new BatteryMain();
		
		System.out.println("Enter the battery records(Battery Name:Watt(W)):");
		for(int i=0;i<n;i++)
		{
			String input=sc.nextLine();
			
			String[] details=input.split(":");
			
			String batteryName=details[0].trim();
			int watt=Integer.parseInt(details[1].trim());
			btr.getBatteryNameMap().put(batteryName.toLowerCase(),watt);
		}
		System.out.println("Enter the battery name needs to be searched");
		
		String searchBatteryName=sc.nextLine().trim().toLowerCase();
		float wattPower=btr.findWattPowerBasedOnBatteryName(searchBatteryName);
		if(wattPower!=-1)
		{
			System.out.printf("The watt power of the battery %s is %.1f\n",searchBatteryName,wattPower);
			List<String> highestWattBatteries=btr.findHighestWattBatteries();
			if(!highestWattBatteries.isEmpty())
			{
				System.out.println("Batteries with the highest watt power are:");
				for(String battery:highestWattBatteries)
				{
					System.out.println(battery);
				}
			}
			else
			{
				System.out.println(searchBatteryName+"is an invalid battery name");
			}
		}
		
	}

}
