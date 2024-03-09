import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class BankBalanceCalculatorTest {

    @Test
    public void TestExample() {


        double initialDeposit = 1000.00;
        int duration = 12;
        ArrayList<int[]> withdrawals = new ArrayList<>();
        withdrawals.add(new int[]{200, 2});
        withdrawals.add(new int[]{300, 5});
        withdrawals.add(new int[]{400, 8});

        // Balance after deductions: $132.73
        double expectedBalance = 132.73;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }

    // Write more test cases considering Node Coverage, Edge Coverage, and Edge-Pair Coverage

    @Test
    public void TestNode() {


        double initialDeposit = 3000.00;
        int duration = 1;
        ArrayList<int[]> withdrawals = new ArrayList<>();
        withdrawals.add(new int[]{200, 1});

        double expectedBalance = 2815.00;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }

    @Test
    public void TestEdge() {


        double initialDeposit = 1000.00;
        int duration = 1;
        ArrayList<int[]> withdrawals = new ArrayList<>();
        withdrawals.add(new int[]{200, 5});
        withdrawals.add(new int[]{500, 1});


        double expectedBalance = 505.00;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }

    @Test
    public void TestEdge_Pair1() {


        double initialDeposit = 4000.00;
        int duration = -2;
        ArrayList<int[]> withdrawals = new ArrayList<>();
        withdrawals.add(new int[]{200, 1});
        withdrawals.add(new int[]{300, 2});
        withdrawals.add(new int[]{400, 3});


        double expectedBalance = 4000.00;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }

    @Test
    public void TestEdge_Pair2() {


        double initialDeposit = 1000.00;
        int duration = 4;
        ArrayList<int[]> withdrawals = new ArrayList<>();


        double expectedBalance = 1020.1505;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }

    @Test
    public void TestEdge_Pair3() {


        double initialDeposit = 3000.00;
        int duration = 1;
        ArrayList<int[]> withdrawals = new ArrayList<>();
        withdrawals.add(new int[]{200, 5});
        withdrawals.add(new int[]{400, 3});


        double expectedBalance = 3015.00;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }

    @Test
    public void TestEdge_Pair4() {


        double initialDeposit = 1000.00;
        int duration = 1;
        ArrayList<int[]> withdrawals = new ArrayList<>();
        withdrawals.add(new int[]{200, 5});
        withdrawals.add(new int[]{400, 1});


        double expectedBalance = 605.00;

        // Calculate actual balance using the method
        double actualBalance = BankBalanceCalculator.calculateBalance(initialDeposit, duration, withdrawals);

        // Assert expected and actual balances are equal
        assertEquals(expectedBalance, actualBalance, 0.01); // Allow for small differences due to rounding
    }
}