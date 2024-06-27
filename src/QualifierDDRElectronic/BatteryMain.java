package QualifierDDRElectronic;
import java.util.*;
public class BatteryMain
{
	private Map<String,Integer>batteryNameMap;
	
	public BatteryMain()
	{
		this.batteryNameMap=new HashMap();
	}
	
	public Map<String,Integer>getBatteryNameMap()
	{
		return batteryNameMap;
	}
	public void setBatteryNameMap(Map<String,Integer>batteryNameMap)
	{
		this.batteryNameMap=batteryNameMap;
	}
	public float findWattPowerBasedOnBatteryName(String batteryName)
	{
		String key=batteryName.toLowerCase();
		if(batteryNameMap.containsKey(key))
		{
			return batteryNameMap.get(key);
		}
		else
		{
			return -1;
		}
	}
	public List<String> findHighestWattBatteries()
	{
	List<String> highestWattBatteries=new ArrayList<>();
	
	int maxWatt=Integer.MIN_VALUE;
	
	for(Map.Entry<String,Integer>entry:batteryNameMap.entrySet())
	{
		int currentWatt=entry.getValue();
		
		if(currentWatt>maxWatt)
		{
			highestWattBatteries.clear();
			highestWattBatteries.add(entry.getKey());
			maxWatt=currentWatt;
		}
		else if(currentWatt==maxWatt)
		{
			highestWattBatteries.add(entry.getKey());
		}
		
	}
	return highestWattBatteries;
}
}
