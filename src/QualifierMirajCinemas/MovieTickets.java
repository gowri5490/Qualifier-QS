package QualifierMirajCinemas;

public class MovieTickets {
			
	private String movieName;
	private String screenNumber;
	private int noOfTickets;
	private String mobileNumber;
	private String time;
	private String modeOfPayment;
	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public MovieTickets(String movieName, String screenNumber, int noOfTickets, String mobileNumber, String time, String modeOfPayment) {
		super();
		this.movieName = movieName;
		this.screenNumber = screenNumber;
		this.noOfTickets = noOfTickets;
		this.mobileNumber = mobileNumber;
		this.time = time;
		this.modeOfPayment = modeOfPayment;
	}
	
	public MovieTickets() {
		super();
		
	}
		
	public double calculatePrice(){
		if(noOfTickets<=0)
		{
		    return 0;
		}
		double price=0;
		if(screenNumber.equals("S1"))
		{
		    price=noOfTickets*280.0+35.0;
		}
		else if(screenNumber.equals("S2"))
		{
		    price=noOfTickets*250.0+35.0;
		}
		else if(screenNumber.equals("S3"))
		{
		    price=noOfTickets*520.0+35.0;
		}
		else if(screenNumber.equals("S4"))
		{
		    price=noOfTickets*400.0+35.0;
		}
		else if(screenNumber.equals("S5"))
		{
		    price=noOfTickets*180.0+35.0;
		}
		else{
		    return 0;
		}
			
			return price;
	}
	
	public String generateTicketId(){
		//Fill the code here
		String firstConsonants=movieName.replaceAll("[AEIOUaeiou ]","").substring(0,2);
		//char[] arr=firstConsonants.toCharArray();
		//String first=new String()+);
		return firstConsonants+screenNumber+'N'+noOfTickets;
	}
	


}
