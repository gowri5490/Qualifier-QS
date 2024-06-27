package QualifierMalgudiVoyage;
public class TicketInfo {
	private static final String Ticket_cost = null;
	private String name;
	private int noOfTickets;
	private String coach;
	private String mobileNumber;
	private String insurance;
	public TicketInfo()
	{
		super();
	}

	public TicketInfo(String name, int noOfTickets, String coach, String mobileNumber, String insurance) {
		super();
		this.name = name;
		this.noOfTickets = noOfTickets;
		this.coach = coach;
		this.mobileNumber = mobileNumber;
		this.insurance = insurance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}


//	public double calculateTicketCost()
//	{
//	double Ticket_cost=0;
//	if(coach.equalsIgnoreCase("FirstAc"))
//	{
//		Ticket_cost=(2200.0+(2200.0*0.5)+(2200.0*0.045));
//	}
//	else if(coach.equalsIgnoreCase("SecondAc"))
//	{
//		Ticket_cost=(1700.0+(1700.0*0.05)+(1700.0*0.045));
//	}
//	else if(coach.equalsIgnoreCase("ThirdAc"))
//	{
//		Ticket_cost=(1200.0+(1200.0*0.04)+(1700.0*0.045));
//	}
//	else if(coach.equalsIgnoreCase("Sleeper"))
//	{
//		Ticket_cost=(520.0+(520.0*0.02)+(520.0*0.045));
//	}
//	else if(coach.equalsIgnoreCase("Unreserve"))
//	{
//		Ticket_cost=200.0;
//	}
//	else 
//	{
//		return -1;
//		
//	}
	public double calculateTicketCost()
	{
		double cost;
        double gst;
        double service;
        switch (coach.toLowerCase()) {
            case "firstac":
                cost = 2200;
                gst = 0.05;
                service=0.045;
                break;
            case "secondac":
                cost = 1700;
                gst = 0.05;
                service=0.045;
                break;
            case "thirdac":
                cost = 1200;
                gst = 0.04;
                service=0.045;
                break;
            case "sleeper":
                cost = 520;
                gst = 0.02;
                service=0.045;
                break;
            case "unreserve":
                cost = 200;
                gst = 0;
                service=0;
                break;
            default:
                return -1;
        }
        return noOfTickets * (cost + (cost * gst) + (cost * service));
	
	}

	public double calculateTotalBookingCost()
	{
		double Ticket_cost=calculateTicketCost();
		if(coach.equalsIgnoreCase("Unreserve"))
		{
			Ticket_cost=Ticket_cost;
		}
		else if(insurance.equalsIgnoreCase("yes"))
		{
			Ticket_cost=Ticket_cost+(noOfTickets*49);
		}
		else if(insurance.equalsIgnoreCase("no"))
		{
			 Ticket_cost=Ticket_cost;
		}
		else
		{
			return -1;
		}
		return Ticket_cost;
	
	}

}











