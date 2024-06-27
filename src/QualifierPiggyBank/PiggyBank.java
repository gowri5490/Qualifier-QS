package QualifierPiggyBank;
import java.util.*;

public class PiggyBank {
    private Map<Integer, Integer> moneyMap;

    public PiggyBank() {
        this.moneyMap = new HashMap<>();
    }

    public Map<Integer, Integer> getMoneyMap() {
        return moneyMap;
    }

    public void setMoneyMap(Map<Integer, Integer> moneyMap) {
        this.moneyMap = moneyMap;
    }

    public double calculateMoneyAvailable() {
        double total = 0;
        for (Map.Entry<Integer, Integer> entry : moneyMap.entrySet()) {
            total += entry.getKey() * entry.getValue();
        }
        return total == 0 ? -1 : total;
    }

    public List<Integer> retrieveCurrencyDenominations() {
        List<Integer> denominations = new ArrayList<>(moneyMap.keySet());
        Collections.sort(denominations);
        return denominations;
    }

    public double calculateMoneyBasedOnDenomination(int denomination) {
        if (moneyMap.containsKey(denomination)) {
            return denomination * moneyMap.get(denomination);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PiggyBank piggyBank = new PiggyBank();

        System.out.println("Enter the total number of money to added");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter your piggy bank entries (denomination: count)");

        for (int i = 0; i < n; i++) {
            
            String[] input = scanner.nextLine().split(":");
            piggyBank.getMoneyMap().put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        double totalMoney = piggyBank.calculateMoneyAvailable();
        if (totalMoney == -1) {
            System.out.println("No money available");
        } else {
            System.out.println("Total money in the Piggy bank: " + totalMoney);
        }

        System.out.println("Available Denominations:");
        for (Integer denomination : piggyBank.retrieveCurrencyDenominations()) {
            System.out.println(denomination);
        }

        System.out.println("Enter the denomination");
        int denomination = scanner.nextInt();
        double totalDenomination = piggyBank.calculateMoneyBasedOnDenomination(denomination);
        if (totalDenomination == -1) {
            System.out.println("Invalid denomination");
        } else {
            System.out.println("Total amount of the denomination " + denomination + " is " + totalDenomination);
        }
    }
}
