package QualifierHamleysLaptopStore;

public class LaptopInfo {
	private String laptopId;
	private String modelName;
	private String brandName;
	private double cost;
	
	public LaptopInfo(String laptopId,String modelName,String brandName,double cost)
	{
		this.laptopId=laptopId;
		this.modelName=modelName;
		this.brandName=brandName;
		this.cost=cost;
	}
	
	public String getLaptopId()
	{
		return laptopId;
	}
	public void setLaptopId(String laptopId)
	{
		this.laptopId=laptopId;
	}
	
	public String getModelname()
	{
		return modelName;
	}
	
	public void setModelName(String modelName)

	{
		this.modelName=modelName;
	}
	public String getBrandName()
	
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	public double getCost()

	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
	}
	
	public double calculatelaptopCost()
	{
		if(cost<=0)
		{
			return -1;
		}
		double price=0;
		if(brandName.equals("Apple"))
		{
			price=cost*0.95;
		}
		else if(brandName.equals("Dell"))
		{
			price=cost*0.90;
		}
		else if(brandName.equals("Samsung"))
		{
			price=cost*0.85;
		}
		else if(brandName.equals("Lenovo"))
		{
			price=cost*0.80;
		}
		else
		{
			return -1;
		}
		return price;
	}
}
