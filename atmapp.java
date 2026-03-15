import java.util.Scanner;

class ATM {

    String accountHolderName;
    int accountNumber;
    double balance;

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) {
        System.out.println("Amount Deposited: " + amount);
        balance=balance+amount;
        System.out.println("current balance"+balance);
    }

    void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class atmapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM user = new ATM();

        System.out.println("Enter Account Holder Name:");
        user.accountHolderName = sc.nextLine();

        System.out.println("Enter Account Number:");
        user.accountNumber = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        user.balance = sc.nextDouble();

        int choice;

            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            if(choice == 1) {
                user.checkBalance();
            }
            else if(choice == 2) {
                System.out.println("Enter amount to deposit:");
                double amount = sc.nextDouble();
                user.deposit(amount);
            }
            else if(choice == 3) {
                System.out.println("Enter amount to withdraw:");
                double amount = sc.nextDouble();
                user.withdraw(amount);
            }
            else{
                System.out.println("sorry out of range");
            }

        System.out.println("Thank you for using ATM");
    }
}