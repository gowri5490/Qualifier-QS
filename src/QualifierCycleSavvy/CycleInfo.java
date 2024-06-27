package QualifierCycleSavvy;
public class CycleInfo
{
	private String cycleId;
	private String cycleName;
	private String cycleType;
	private String accessories;
	private double price;
	
	public CycleInfo(String cycleId,String cycleName,String cycleType,String accessories,double  price)
	{
		this.cycleId=cycleId;
		this.cycleName=cycleName;
		this.cycleType=cycleType;
		this.accessories=accessories;
		this.price=price;
	}
	
	public String getCycleId()
	{
		return cycleId;
	}
	public void setCycleId(String cycleId)
	{
		this.cycleId=cycleId;
	}
	
	public String getCycleName()
	{
		return cycleName;
	}
	public void setCycleName(String cycleName)
	{
		this.cycleName=cycleName;
	}
	public String getCycleType()
	{
		return cycleType;
	}
	public void setCycleType(String cycleType)
	{
		this.cycleType=cycleType;
	}
	public String getAccessories()
	{
		return accessories;
	}
	public void setaccessories(String accessories)
	{
		this.accessories=accessories;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public double calculateBillAmount()
	{
		double billAmount=0;
		double accessoriesAmount=0;
		if(price<=0)
		{
			return -1;
		}
		if(accessories.equalsIgnoreCase("yes"))
		{
			accessoriesAmount=1000.0;
		}
		else if(accessories.equalsIgnoreCase("no"))
		{
			accessoriesAmount=0;
		}
		else
		{
			return -1;
		}
		if(cycleType.equals("Road Cycle"))
		{
			billAmount=price+((price*2)/100)+accessoriesAmount;
		}
		else if(cycleType.equals("Mountain Cycle"))
		{
			billAmount=price+((price*5)/100)+accessoriesAmount;
		}
		else if(cycleType.equals("Hybrid Cycle"))
		{
			billAmount=price+((price*6)/100)+accessoriesAmount;
		}
		else if(cycleType.equals("Touring Cycle"))
		{
			billAmount=price+((price*4)/100)+accessoriesAmount;
		}
		else if(cycleType.equals("Electric Cycle"))
		{
			billAmount=price+((price*3)/100)+accessoriesAmount;
		}
		else
		{
			return -1;
		}
		return billAmount;
	}
	
	
}