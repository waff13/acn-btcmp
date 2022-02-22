package Day02;

public class Task03 {

    /*3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
       which allows user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
       (decimal number) which allows user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another*/


    public static class BankAccount{

        double balance;

        public BankAccount(){
            // empty default constructor
        }

        public BankAccount(double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {
            this.balance += amount;
        }

        void withdraw(double amount) {
            this.balance -= amount;
        }

        void printBalance() {
            System.out.println("Current balance is " + this.balance);
        }

        public void transfer(BankAccount destinationAccount) {
            destinationAccount.balance += this.balance;
            this.balance = 0;
            System.out.println("All funds were transfered, your balance is " + this.balance + " and destination account's balance is " + destinationAccount.balance);
        }
    }

    public static void main(String[] args) {

        BankAccount one;
        BankAccount two = new BankAccount (100);
        BankAccount three = new BankAccount(50);

        System.out.println("Account balance before the deposit: " + two.balance);
        two.deposit(33);
        two.printBalance();

        System.out.println("Account balance before the withdrawal: " + three.balance);
        three.withdraw(18);
        three.printBalance();

        System.out.println("Accounts balances before the transfer: " + two.balance + " and " + three.balance);
        two.transfer(three);
        two.printBalance();
        three.printBalance();
    }
}
