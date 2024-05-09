import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("John", "Smith", LocalDate.of(1980,1,1), "12345678");
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
        Double result = bankAccount.getBalance();
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
    public void canDepositMoney() {
        bankAccount.deposit(100.0);
        Double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void canWithdrawMoney() {
        bankAccount.deposit(100.0);
        bankAccount.withdrawal(50.0);
        Double result = bankAccount.getBalance();
        assertThat(result).isEqualTo(50.0);
    }















}
