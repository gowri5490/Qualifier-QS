package QualifierRealChamp;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Participant {
	private Map<String,Integer> participantMap;
	
	public Map<String,Integer> getParticipantMap()
	{
		return participantMap;
	}
	public void setParticipantMap(Map<String,Integer> participantMap)
	{
		this.participantMap=participantMap;
	}
	
	public int findTheTimeTakenByTheParticipant(String participantName)
	{
		int ans=0;
		for(Map.Entry<String,Integer>entry:participantMap.entrySet())
		{
			String name=(String)entry.getKey();
			if(name.equalsIgnoreCase(participantName.toLowerCase()))
			{
				ans=entry.getValue();
				break;
			}
		}
		if(ans==0)
		{
			return -1;
		}
		else
		{
			return ans;
		}
	}
	public List<String> findTheParticipantWithTheShortestTime()
	{
		List<String> winners=new ArrayList<>();
		
		int min=Collections.min(participantMap.values());
		
		for(Map.Entry<String,Integer> entry:participantMap.entrySet())
		{
			if(entry.getValue().equals(min))
			{
				winners.add(entry.getKey());
			}
		}
		return winners;
	}
	
	public static void main(String args[])
	{
		Participant part=new Participant();
		
		List<String> list1=new ArrayList<>();
		Map<String,Integer>map=new HashMap<String,Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of records to be added:");
		int n=sc.nextInt();
		
		System.out.println("Enter the participant records(Participant Name: TimeTaken in seconds):");
		
		String[] input=new String[n];
		
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextLine();
		}
		for(int i=0;i<input.length;i++)
		{
			String[] split=input[i].split(":");
			map.put(split[0],Integer.parseInt(split[1]));
			
			part.setParticipantMap(map);
		}
		System.out.println("Enter the participant name to be searched");
		String search=sc.nextLine();
		
		int val=part.findTheTimeTakenByTheParticipant(search);
		
		if(val>0)
		{
			System.out.println(val);
		}
		else
		{
			System.out.println(search+" is an invalid participant name");
		}
		
		list1=part.findTheParticipantWithTheShortestTime();
		System.out.println("Participant name with the shortest time taken: ");
		
		for(String s:list1)
		{
			System.out.println(s);
		}
	}

}
//Enter the number of records to be added:
//4
//Enter the participant records(Participant Name: TimeTaken in seconds):
//Minu:138
//Tiny:125
//Stew:125
//Dane:128
//Enter the participant name to be searched
//Jin
//Jin is an invalid participant name
//Participant name with the shortest time taken: 
//Stew
//Tiny
