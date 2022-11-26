import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    private static int count = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @BeforeEach
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0.0001);
    }

    @Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @Test
    void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0.0001);
    }

    @Test
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0.0001);
    }

    @Test
    public void isChecking_true() {
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Count = " + count++);
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("This executes after all the test cases have run. Count = " + count++);
    }
}