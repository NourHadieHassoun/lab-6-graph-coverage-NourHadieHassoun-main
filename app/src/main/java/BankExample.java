import java.util.ArrayList;

// To run this file:
// Right click on the page and
// Select "Run 'BankExample.main()' with Coverage"
// If you got error, Select "Run 'BankExample.main()' with Coverage" again

public class BankExample {

    public static void main(String[] args) {
        // An example:
        // An initial deposit of $1000 for 12 months. With two withdrawals:
        // First withdrawal: $100 in month 3
        // Second withdrawal: $10 in month 6.
        double initialDeposit = 1000.00;
        int duration = 12;
        ArrayList<int[]> withdrawals = new ArrayList<>(); // We assume withdrawals are integers!
        withdrawals.add(new int[]{100, 3});
        withdrawals.add(new int[]{10, 6});

        double totalProfit = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);
        System.out.println("Total Balance Will Be: $" + totalProfit);

    }
}
