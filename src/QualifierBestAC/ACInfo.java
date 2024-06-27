package QualifierBestAC;
public class ACInfo {
private String customerId;
private String customerName;
private String acType;
private String acCapacity;
private String coolingCapacity;
private int quantity;

public String getCustomerId() {
return customerId;
}
public void setCustomerId(String customerId) {
this.customerId = customerId;
}
public String getCustomerName() {
return customerName;
}
public void setCustomerName(String customerName) {
this.customerName = customerName;
}
public String getAcType() {
return acType;
}
public void setAcType(String acType) {
this.acType = acType;
}
public String getAcCapacity() {
return acCapacity;
}
public void setAcCapacity(String acCapacity) {
this.acCapacity = acCapacity;
}
public String getCoolingCapacity() {
return coolingCapacity;
}
public void setCoolingCapacity(String coolingCapacity) {
this.coolingCapacity = coolingCapacity;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
public ACInfo()
{
    
}

public ACInfo(String customerId, String customerName, String acType, String acCapacity, String coolingCapacity,
int quantity) {
super();
this.customerId = customerId;
this.customerName = customerName;
this.acType = acType;
this.acCapacity = acCapacity;
this.coolingCapacity = coolingCapacity;
this.quantity = quantity;
}

public double calculateACCost()
{
    double ac_cost=0;
    if(quantity<=0)
    {
        return -1;
    }
    if(acType.equalsIgnoreCase("SplitAc"))
    {
        if(acCapacity.equalsIgnoreCase("1Ton")&&coolingCapacity.equalsIgnoreCase("3450W"))
        {
            ac_cost=(double)quantity*25000.0;
        }
        else if(acCapacity.equalsIgnoreCase("1.5Ton")&&coolingCapacity.equalsIgnoreCase("5100W"))
        {
            ac_cost=(double)quantity*30000.0;
        }
        else if(acCapacity.equalsIgnoreCase("1.5Ton")&&coolingCapacity.equalsIgnoreCase("5280W"))
        {
            ac_cost=(double)quantity*35000.0;
        }
        else{
            return -1;
        }
        
    }
    else if(acType.equalsIgnoreCase("WindowAc"))
    {
        if(acCapacity.equalsIgnoreCase("1Ton")&&coolingCapacity.equalsIgnoreCase("3400W"))
        {
            ac_cost=(double)quantity*20000.0;
        }
        else if(acCapacity.equalsIgnoreCase("1.5Ton")&&coolingCapacity.equalsIgnoreCase("5000W"))
        {
            ac_cost=(double)quantity*25000.0;
        }
        else if(acCapacity.equalsIgnoreCase("1.5Ton")&&coolingCapacity.equalsIgnoreCase("5050W"))
        {
            ac_cost=(double)quantity*30000.0;
        }
        else{
            return -1;
        }
    }
    else{
        return -1;
    }
    return ac_cost;
}

}
