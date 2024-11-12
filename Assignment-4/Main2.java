//Create an abstract class Accounts with the following
// Data members:
// a. Balance
// b. AccountNo
// c. HoldersName

// Methods:
// a. withdraw()
// b. deposit()
// c. display()

// Create a subclass SavingsAccount of Accounts class and add the following
// details:
// Data member:
// a. rate_of_interest
// Methods:
// a. calculateAmount()
// b. display(), to show rate of interest along with account balance.

// Create another sub class CurrentAccount of Accounts class with the
// following details:
// Data member:
// a. overDraftLimit
// Method:
// a. display()- to show overdraft amount.
// Create object of these classes and call their methods.

abstract class Accounts {
    protected double balance;
    protected String accountNo;
    protected String holdersName;

    public Accounts(double balance, String accountNo, String holdersName) {
        this.balance = balance;
        this.accountNo = accountNo;
        this.holdersName = holdersName;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void display();
}

class SavingsAccount extends Accounts {
    private double rate_of_interest;

    public SavingsAccount(double balance, String accountNo, String holdersName, double rate_of_interest) {
        super(balance, accountNo, holdersName);
        this.rate_of_interest = rate_of_interest;
    }

    public double calcAmount() {
        return balance + (balance * rate_of_interest / 100);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    public void display() {
        System.out.println("Savings Account Holder Name: " + holdersName);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rate_of_interest + "%");
        System.out.println("Total amount with interest: " + calcAmount());
    }
}

class CurrentAccount extends Accounts {
    private double overDraftLimit;

    public CurrentAccount(double balance, String accountNo, String holdersName, double overDraftLimit) {
        super(balance, accountNo, holdersName);
        this.overDraftLimit = overDraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        } else {
            System.out.println("Exceeded OverDraftLimit");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    public void display() {
        System.out.println("Current Account Holder Name: " + holdersName);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("OverDraftLimit: " + overDraftLimit);
    }
}

public class Main2 {
    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount(5000, "SA1234", "Roy", 5.0);
        System.out.println("Savings Accounts Details");
        save.deposit(2000);
        save.withdraw(1500);
        save.display();

        System.out.println();

        CurrentAccount curr = new CurrentAccount(3000, "CA4567", "Don", 1000);
        System.out.println("Current Account Details");
        curr.deposit(1000);
        curr.withdraw(3500);
        curr.display();
    }
}
