import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("John", "Smith", LocalDate.of(1980,1,1), "12345678", "Savings");
    }
//    Testing getters
    @Test
    public void canGetFirstName() {
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("John");
    }

    @Test
    public void canGetLastName() {
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Smith");
    }

    @Test
    public void canGetDateOfBirth() {
        LocalDate result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo(LocalDate.of(1980, 1, 1));
    }

    @Test
    public void canGetAccountNumber() {
        String result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo("12345678");
    }

    @Test
    public void canGetBalance() {
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void canGetAccountType() {
        String result = bankAccount.getAccountType();
        assertThat(result).isEqualTo("Savings");
    }

    @Test
    public void canGetOverdraft() {
        double result = bankAccount.getOverdraft();
        assertThat(result).isEqualTo(0);
    }

//    Testing setters
    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Jane");
        String result = bankAccount.getFirstName();
        assertThat(result).isEqualTo("Jane");
    }

    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Doe");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Doe");
    }

    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth(LocalDate.of(1970,2,2));
        LocalDate result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo(LocalDate.of(1970, 2, 2));
    }

    @Test
    public void canSetAccountNumber() {
        bankAccount.setAccountNumber("87654321");
        String result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo("87654321");
    }

    @Test
    public void canSetAccountType() {
        bankAccount.setAccountType("Current");
        String result = bankAccount.getAccountType();
        assertThat(result).isEqualTo("Current");
    }

    @Test
    public void canDepositMoney() {
        bankAccount.deposit(100.0);
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void canWithdrawMoney() {
        bankAccount.deposit(100.0);
        bankAccount.withdrawal(50.0);
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(50.0);
    }

    @Test
    public void canPayInterest() {
        bankAccount.deposit(100.0);
        bankAccount.payInterest();
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(110.00000000000001);
    }

    @Test
    public void canPayInterestForCurrent() {
        bankAccount.setAccountType("Current");
        bankAccount.deposit(100.0);
        bankAccount.payInterest();
        double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(105.0);
    }

    @Test
    public void testForOverdraft() {
        bankAccount.withdrawal(100);
        String result = "Not enough funds";
        assertThat(result).isEqualTo("Not enough funds");
    }























}
