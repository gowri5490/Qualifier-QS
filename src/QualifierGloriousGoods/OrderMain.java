package QualifierGloriousGoods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class OrderMain {
 
private Map<String,String> orderMap=new HashMap<String,String>();

public Map<String, String> getOrderMap() {
return orderMap;
}
 
public void setOrderMap(Map<String, String> orderMap) {
this.orderMap = orderMap;
}
 
public int findTheCountOfOrderIdsBasedOnTheProductType(String productType) {

int count = 0;
for (String type : orderMap.values()) {
if (type.equalsIgnoreCase(productType)) {
count++;
}
}
return count > 0 ? count : -1;
}
 
public List<String> findOrderIdsBasedOnTheProductType(String productType){
        //Fill the code
List<String> orderIds = new ArrayList<>();
for (Map.Entry<String, String> entry : orderMap.entrySet()) {
if (entry.getValue().equalsIgnoreCase(productType)) {
orderIds.add(entry.getKey());
}
}
return orderIds;
 
}
 
public static void main(String args[]) {
//You are provided with the main method as code template and it is excluded from evaluation
OrderMain main=new OrderMain();
List<String> list=new ArrayList<String>();
Map<String, String> map=new HashMap<String,String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of records to be added");
int n=sc.nextInt();
System.out.println("Enter the records (Order Id: Product Type)");
String [] recordDetails = new String[n];
for(int i=0;i<n;i++) {
recordDetails[i] = sc.next();
}
 
for(int i=0;i<recordDetails.length;i++) {
String[] a = recordDetails[i].split(":");
 
map.put(a[0], (a[1]));
 
main.setOrderMap(map);
}
 
 
System.out.println("Enter the Product type to be searched");
String searchType=sc.next();

int count=main.findTheCountOfOrderIdsBasedOnTheProductType(searchType);
if(count>0)
{
System.out.println("The Order Ids based on "+searchType+" are "+count);
}
else
{
System.out.println("No Order Ids were found for "+searchType);
}
 
System.out.println("Enter the Product type to identify the Order Ids");
String productType=sc.next();

list=main.findOrderIdsBasedOnTheProductType(productType);
 
 
if(list.size()>=1) {
System.out.println("Order Ids based on the "+productType+" are ");
for(String s:list)
{
System.out.println(s);
}
}
else
System.out.println("No Order Ids were found for the "+productType);
}
 
}

