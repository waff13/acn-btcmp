package Day02;

public class Task04 {

    /*4) update your solution:
        * Encapsulate the balance property so it is private
        * add vo "withdraw" method, so it would be impossible to withdraw more money than exists in bank account.
            If there is an attempt to withdraw more money than exialidation tsts in bank account,
            output message: "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more money from the other account
            than it's balance. For example, if bank account A has 50 units and bank account B has 25 units
            and we try to transfer 30 units from B to A, then it should output:
            "Transfer cancelled. You are trying to transfer 30 units, but only 25 are available."
        * add limit for depositing money. If the deposit is greater than 5000, then it should not do the deposit
            and output message: "Transaction cancelled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
        * write a code which tries to withdraw more money than there is in bank account
        * write a code which tries to deposit more than max limit
        * write a code which tries to transfer more money from one account to another account than possible*/

    public static class BankAccount{

        private double balance;

        public BankAccount(){
            // empty default constructor
        }

        public BankAccount(double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {
            if ((amount > 0) && (amount <= 5000)) {
                this.balance += amount;
            } else {
                System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
            }
        }

        boolean withdraw(double amount) {
            if (amount > this.balance) {
                System.out.println("Not enough funds!");
                return false;
            } else {
                this.balance -= amount;
                return true;
            }
        }

        void printBalance() {
            System.out.println("Current balance is " + this.balance);
        }

        public void transfer(BankAccount destinationAccount, double amount) {
            if (withdraw(amount)) {
                destinationAccount.balance += amount;
            } else {
                System.out.println("Transfer cancelled. You try to transfer " + amount + " units while account has " + this.balance + " units");
            }
        }
    }

    public static void main(String[] args) {

        BankAccount one;
        BankAccount two = new BankAccount(100);
        BankAccount three = new BankAccount(50);

        System.out.println("\nAccount balance before the deposit: " + two.balance);
        two.deposit(900);
        System.out.println("900 was deposited");
        two.printBalance();
        System.out.println("\nTrying to deposit more than allowed (5001)");
        two.deposit(5001);
        two.printBalance();

        System.out.println("\nAccount balance before the withdrawal: " + three.balance);
        three.withdraw(18);
        System.out.println("18 was withdrawn");
        three.printBalance();
        System.out.println("\nTrying to withdraw more than there is (150)");
        three.withdraw(150);
        three.printBalance();

        System.out.println("\nAccounts balances before the transfer: " + two.balance + " and " + three.balance);
        two.transfer(three, 100);
        two.printBalance();
        three.printBalance();

        System.out.println("\nTransfer more than there is (10000)");
        two.transfer(three, 10000);
        two.printBalance();
        three.printBalance();
    }
}
