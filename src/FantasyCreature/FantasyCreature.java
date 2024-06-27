package FantasyCreature;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class FantasyCreature {
	
	
	
	private Map<String,Integer> fantasyCreatureMap=new HashMap<>();
	
	public Map<String,Integer> getFantasyCreatureMap()
	{
		return fantasyCreatureMap;
	}
	
	public void setFantasyCreatureMap(Map<String,Integer> fantasyCreatureMap)
	{
		this.fantasyCreatureMap=fantasyCreatureMap;
	}
	
	public int findTheHitPointsForTheGivenCreature(String creature)
	{
		int ans=0;
		for(Map.Entry<String,Integer> entry:fantasyCreatureMap.entrySet())
		{
			String name=(String)entry.getKey();
			if(name.equals(creature))
			{
				ans=entry.getValue();
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
	
	public List<String> findTheCreatureNameBasedOnTheHitpoints()
	{
		List<String> clear=new ArrayList<>();
		for(Map.Entry<String,Integer>entry:fantasyCreatureMap.entrySet())
		{
			if(entry.getValue()>=80)
			{
				clear.add(entry.getKey());
			}
		}
		return clear;
	}
	
	public static void main(String args[])
	{
		FantasyCreature ftc=new FantasyCreature();
		
		List<String> list1=new ArrayList<>();
		
		Map<String,Integer> map=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of creatures to be added");
		
		int n=sc.nextInt();
		
		System.out.println("Enter the creatures (CreatureName: HitPoints");
		
		String[] input=new String[n];
		
		for(int i=0;i<n;i++)
		{
			input[i]=sc.next();
		}
		
		for(int i=0;i<input.length;i++)
		{
			String[] split=input[i].split(":");
			map.put(split[0],Integer.parseInt(split[1]));
			
			ftc.setFantasyCreatureMap(map);
		}
		
		System.out.println("Enter the fantasy creature name");
		
		String search=sc.next();
		
		int count=ftc.findTheHitPointsForTheGivenCreature(search);
		if(count>0)
		{
			System.out.println("The Hit Points for the "+search+" is "+count);
		}
		else
		{
			System.out.println("No fantasy creature were founr");
		}
		
		list1=ftc.findTheCreatureNameBasedOnTheHitpoints();
		
		if(list1.size()>=1)
		{
			System.out.println("Fantasy Creatures based on the condition are ");
			
			for(String s: list1)
			{
				System.out.println(s);
			}
			
		}
		else
		{
			System.out.println("No fansy creature were found for the given condition");
		}
	}

}

//Enter number of creatures to be added
//6
//Enter the creatures (CreatureName: HitPoints
//Ghost:25
//Ghoul:56
//Harpy:69
//Imp:78
//Leprechaun:48
//Naga:72
//Enter the fantasy creature name
//Naga
//The Hit Points for the Naga is 72
//No fansy creature were found for the given condition