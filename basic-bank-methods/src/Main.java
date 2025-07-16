import java.util.Scanner;

public class Main {
    static double balance = 1000;
    static int choice = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (choice == 1) {

            System.out.println("Select an operation:");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Show Balance");
            System.out.println("0 - Exit");
            choice = input.nextInt();


            switch (choice) {
                case 0:
                    System.out.println("Exiting program...");
                    return;

                case 1:
                    System.out.println("Enter amount:");
                    double amount = input.nextDouble();
                    Deposit(amount);
                    System.out.println("Balance: " + GetBalance());
                    break;
                case 2:
                    System.out.println("Enter amount:");
                    double amount2 = input.nextDouble();
                    Withdraw(amount2);
                    System.out.println("Balance: " + GetBalance());
                    break;
                case 3:
                    System.out.println(GetBalance());
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? Press 1 for Yes, any number for No:");
            choice = input.nextInt();

        }


    }

    public static void Deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount can't be negative");
        } else {
            balance += amount;
            System.out.println("Deposited " + amount);
        }
    }

    public static void Withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Non-Possible request");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        }
    }

    public static double GetBalance() {
        return balance;
    }


}