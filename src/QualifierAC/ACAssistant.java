package QualifierAC;
import java.util.*;
public class ACAssistant { 
    private static List<AirConditioner> acList = new ArrayList<>(); 
 
    public static void main(String[] args) { 
        initializeACs(); 
 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Welcome to the AC Purchase Assistant!"); 
 
        System.out.print("Enter your cooling capacity requirement (in BTUs): "); 
        int requiredCoolingCapacity = scanner.nextInt(); 
 
        System.out.print("Enter your desired energy efficiency rating: "); 
        double requiredEnergyEfficiency = scanner.nextDouble(); 
 
        System.out.print("Enter your budget (in dollars): "); 
        double budget = scanner.nextDouble(); 
 
        System.out.println("\nRecommended Air Conditioners:"); 
 
        for (AirConditioner ac : acList) { 
            if (ac.getCoolingCapacity() >= requiredCoolingCapacity && 
                ac.getEnergyEfficiency() >= requiredEnergyEfficiency && 
                ac.getPrice() <= budget) { 
                System.out.println("Model: " + ac.getModel()); 
                System.out.println("Cooling Capacity: " + ac.getCoolingCapacity() + " BTUs"); 
                System.out.println("Energy Efficiency: " + ac.getEnergyEfficiency()); 
                System.out.println("Price: $" + ac.getPrice() + "\n"); 
            } 
        } 
    } 
 
    private static void initializeACs() { 
        acList.add(new AirConditioner("AC-1000", 12000, 12.5, 400.0)); 
        acList.add(new AirConditioner("AC-2000", 18000, 14.0, 600.0)); 
        acList.add(new AirConditioner("AC-3000", 24000, 15.0, 800.0)); 
    } 
} 
