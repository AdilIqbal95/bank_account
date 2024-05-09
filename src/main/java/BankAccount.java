import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
//    Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Double getBalance() {
        return this.balance;
    }
//    Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

//    Other methods
    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdrawal(Double amount) {
        this.balance = this.balance - amount;
    }







}
