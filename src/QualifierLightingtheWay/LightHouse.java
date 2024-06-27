package QualifierLightingtheWay;

public class LightHouse {
	private String location;
	private int height;
	private String lightType;
	private int hours;
	
	
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	
	public String getLightType()
	{
		return lightType;
	}
	public void setLightType(String lightType)
	{
		this.lightType=lightType;
	}
	
	public int getHours()
	{
		return hours;
	}
	public void setHours(int hours)
	{
		this.hours=hours;
	}
	public LightHouse(String location,int height,String lightType,int hours)
	{
		super();
		this.location=location;
		this.height=height;
		this.lightType=lightType;
		this.hours=hours;
	}
	public int calculateFlashesForGivenHours()
	{
		int flashes;
		if(hours>0&&height>0)
		{
			flashes=(hours*60*60)/72;
			return flashes;
		}
		else
		{
			return -1;
		}
		
	}
}
