import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    private int totalAccounts;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public int getNumber(){
        return accountNumber;
    }
    public String getName(){
        return ownerName;
    }
    public double getBalance(){
        return accountBalance;
    }
    public double getInterest(){
        return interestEarned;
    }
    public int getTotalAccounts(){
        return totalAccounts;
    }
    public void setNumber(int num){
        accountNumber = num;
    }
    public void setName(String nam){
        ownerName = nam;
    }
    public void setBalance(double num){
        accountBalance = num;
    }
    public void setInterest(double num){
        interestEarned = num;
    }
}