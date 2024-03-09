import java.util.ArrayList;

public class BankBalanceCalculator {

    public static double calculateBalance(double initialDeposit, int duration, ArrayList<int[]> withdrawals) {
        double balance = initialDeposit;

        // Calculate profit for each month
        for (int month = 1; month <= duration; month++) {
            double monthlyProfit = balance * 0.005;
            balance += monthlyProfit;

            // Deduct withdrawals made in this month
            for (int[] withdrawal : withdrawals) {
                if (withdrawal[1] == month) {
                    balance -= withdrawal[0];
                }
            }
        }

        return Math.round(balance * 100.0) / 100.0; // Rounding to 2 decimal places
    }
}