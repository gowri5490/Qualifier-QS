package BobBobCodeChallenge;

class ImageAdvertisement extends Advertisement {
    private int inches;
 
    // Constructor
    public ImageAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int inches) {
        super(advertisementId, priority, noOfDays, clientName);
        this.inches = inches;
    }
 
    // Getter and Setter methods
    public int getInches() {
        return inches;
    }
 
    public void setInches(int inches) {
        this.inches = inches;
    }
 
    // Override method to calculate advertisement charge for ImageAdvertisement
    @Override
    public float calculateAdvertisementCharge(float baseCost) {
        float baseAdvertisementCost = baseCost * inches * noOfDays;
        float boosterCost = (baseAdvertisementCost * 7) / 100;
        float serviceCost = 700;
        return baseAdvertisementCost + boosterCost + serviceCost;
    }
}
 