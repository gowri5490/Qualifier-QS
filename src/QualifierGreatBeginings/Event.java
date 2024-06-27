package QualifierGreatBeginings;
import java.util.Date;
public class Event {
	private String eventId;
	private String eventType;
	private Date dateOfRegistration;
	private Date dateOfEvent;
	private double payment;
	
	public Event()
	{
		
	}
	public Event(String eventId,String eventType,Date dateOfRegistration,Date dateOfEvent,double payment)
	{
		super();
		this.eventId=eventId;
		this.eventType=eventType;
		this.dateOfRegistration=dateOfRegistration;
		this.dateOfEvent=dateOfEvent;
		this.payment=payment;
	}
	public String getEventId()
	{
		return eventId;
	}
	public void setEventId(String eventId)
	{
		this.eventId=eventId;
	}
	public String getEventType()
	{
		return eventType;
	}
	
	public void setEventType(String eventType)
	{
		this.eventType=eventType;
	}
	public Date getDateOfRegistration()
	{
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration)
	{
		this.dateOfRegistration=dateOfRegistration;
	}
	
	public Date getDateOfEvent()
	{
		return dateOfEvent;
	}
	public void setDateOfEvent(Date dateOfEvent)
	{
		this.dateOfEvent=dateOfEvent;
	}
	public double getPayment()
	{
		return payment;
	}
	public void setPayment(double payment)
	{
		this.payment=payment;
	}
	
	public double calculateAmountToBePaid()
	{
		if(payment<=0)
		{
			return -1;
		}
		double amount;
		if(eventType.equalsIgnoreCase("Weddings"))
		{
			amount=payment*0.78;
		}
		else if(eventType.equalsIgnoreCase("Charity"))
		{
			amount=payment*0.81;
		}
		else if(eventType.equalsIgnoreCase("ProductLaunch"))
		{
			amount=payment*0.85;
		}
		else if(eventType.equalsIgnoreCase("Exhibitions"))
		{
			amount=payment*0.95;
		}
		else if(eventType.equalsIgnoreCase("Workshops"))
		{
			amount=payment-(payment*0.93);
		}
		else
		{
			return -1;
		}
		return amount;
	}

}
