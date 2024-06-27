package BobBobCodeChallenge;
import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        // Input for Advertisement details
        System.out.println("Enter the advertisement id");
        int advertisementId = scanner.nextInt();
        System.out.println("Enter the priority (high / medium / low)");
        String priority = scanner.next();
        System.out.println("Enter the no of days advertisement is published");
        int noOfDays = scanner.nextInt();
        System.out.println("Enter the client name");
        String clientName = scanner.next();
        System.out.println("Enter the type of Advertisement (video/image/text)");
        String adType = scanner.next();
 
        // Object creation based on advertisement type
        Advertisement advertisement;
        if (adType.equalsIgnoreCase("video")) {
            System.out.println("Enter the duration in minutes");
            int duration = scanner.nextInt();
            System.out.println("Enter the base cost");
            float baseCost = scanner.nextFloat();
            advertisement = new VideoAdvertisement(advertisementId, priority, noOfDays, clientName, duration);
            System.out.println("The Advertisement cost is " + advertisement.calculateAdvertisementCharge(baseCost));
        } else if (adType.equalsIgnoreCase("image")) {
            System.out.println("Enter the number of inches");
            int inches = scanner.nextInt();
            System.out.println("Enter the base cost");
            float baseCost = scanner.nextFloat();
            advertisement = new ImageAdvertisement(advertisementId, priority, noOfDays, clientName, inches);
            System.out.println("The Advertisement cost is " + advertisement.calculateAdvertisementCharge(baseCost));
        } else if (adType.equalsIgnoreCase("text")) {
            System.out.println("Enter the number of characters");
            int noOfCharacters = scanner.nextInt();
            System.out.println("Enter the base cost");
            float baseCost = scanner.nextFloat();
            advertisement = new TextAdvertisement(advertisementId, priority, noOfDays, clientName, noOfCharacters);
            System.out.println("The Advertisement cost is " + advertisement.calculateAdvertisementCharge(baseCost));
        } else {
            System.out.println("Invalid Advertisement Type");
        }
 
        scanner.close();
    }
}