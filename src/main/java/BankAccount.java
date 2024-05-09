import java.time.LocalDate;

import static java.lang.Math.round;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber, String accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
        this.overdraft = 0;

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

    public double getBalance() {
        double roundedBalance = round(this.balance);
        return this.balance;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public double getOverdraft() {
        return this.overdraft;
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

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


//    Other methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        if ((this.balance - amount) < this.overdraft) {
            System.out.println("Not enough funds");
        } else {
            this.balance = this.balance - amount;
        }
    }

    public void payInterest() {
        if (this.accountType.equals("Savings")) {
            this.balance = this.balance*1.1;
        } else {
            this.balance = this.balance*1.05;
        }
    }











}
