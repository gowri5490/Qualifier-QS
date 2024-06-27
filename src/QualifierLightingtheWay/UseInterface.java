package QualifierLightingtheWay;
import java.util.Scanner;
public class UseInterface {
	public static LightHouse extractDetails(String lightHouseDetails)
	{
		String[] word=lightHouseDetails.split(":");
		return new LightHouse(word[0],Integer.parseInt(word[1]),word[2],Integer.parseInt(word[3]));
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		String input=sc.next();
		LightHouse lh=extractDetails(input);
		
		if(lh.calculateFlashesForGivenHours()!=-1)
		{
			System.out.println("LightHouse Location: "+lh.getLocation());
			System.out.println("Height: "+lh.getHeight());
			System.out.println("Light Type: "+lh.getLightType());
			System.out.println("Hour: "+lh.getHours());
			System.out.println("Flashes: "+lh.calculateFlashesForGivenHours());
		}
		else
		{
			System.out.println("Invalid light house details");
		}
	}

}
//Enter the details
//Genoa:247:SpecialBeam:10
//LightHouse Location: Genoa
//Height: 247
//Light Type: SpecialBeam
//Hour: 10
//Flashes: 500

//Enter the details
//Vasto:307:StrongIntensity:-15
//Invalid light house details
