package BobBobCodeChallenge;

class TextAdvertisement extends Advertisement {
    private int noOfCharacters;
 
    // Constructor
    public TextAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int noOfCharacters) {
        super(advertisementId, priority, noOfDays, clientName);
        this.noOfCharacters = noOfCharacters;
    }
 
    // Getter and Setter methods
    public int getNoOfCharacters() {
        return noOfCharacters;
    }
 
    public void setNoOfCharacters(int noOfCharacters) {
        this.noOfCharacters = noOfCharacters;
    }
 
    // Override method to calculate advertisement charge for TextAdvertisement
    @Override
    public float calculateAdvertisementCharge(float baseCost) {
        float baseAdvertisementCost = baseCost * noOfCharacters * noOfDays;
        float boosterCost = 0; // No booster cost for low priority
        float serviceCost = 200;
        return baseAdvertisementCost + boosterCost + serviceCost;
    }
}
 
 