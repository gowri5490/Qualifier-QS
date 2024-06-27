package QualifierAC;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
 
 public class AirConditioner { 
    private String model; 
    private int coolingCapacity; // in BTUs 
    private double energyEfficiency; // EER or SEER rating 
    private double price; // in dollars 
 
    public AirConditioner(String model, int coolingCapacity, double energyEfficiency, double price) { 
        this.model = model; 
        this.coolingCapacity = coolingCapacity; 
        this.energyEfficiency = energyEfficiency; 
        this.price = price; 
    } 
 
    public String getModel() { 
        return model; 
    } 
 
    public int getCoolingCapacity() { 
        return coolingCapacity; 
    } 
 
    public double getEnergyEfficiency() { 
        return energyEfficiency; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
} 
 
