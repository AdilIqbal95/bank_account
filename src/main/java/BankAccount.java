import java.time.LocalDate;

public class BankAccount {

    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String accountNumber;
    double balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }



}
