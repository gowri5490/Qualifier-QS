package BobBobCodeChallenge;

class VideoAdvertisement extends Advertisement {
    private int duration;
 
    // Constructor
    public VideoAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int duration) {
        super(advertisementId, priority, noOfDays, clientName);
        this.duration = duration;
    }
 
    // Getter and Setter methods
 
    // Override method to calculate advertisement charge for VideoAdvertisement
    @Override
    public float calculateAdvertisementCharge(float baseCost) {
        float baseAdvertisementCost = baseCost * duration * noOfDays;
        float boosterCost = (baseAdvertisementCost * 10) / 100;
        float serviceCost = 1000;
        return baseAdvertisementCost + boosterCost + serviceCost;
    }
}
 