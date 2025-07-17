import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("Welcome to the Loan Calculator!");
        System.out.println("Which loan do you want? Enter 1 for Personal Loan, 2 for Car Loan:");
        int choice = sc.nextInt();
        if (choice == 1) {
            BaseLoanManager baseLoanManager = new BaseLoanManager();

            System.out.println("You chose Personal Loan.");
            System.out.print("Please enter principal amount: ");
            double principalAmount = sc.nextInt();
            baseLoanManager.setPrincipal(principalAmount);
            System.out.println("Please enter term months:");
            int termMonths = sc.nextInt();
            baseLoanManager.setTermMonths(termMonths);
            System.out.println("Enter your ID number:");
            String idNumber = sc.next();
            baseLoanManager.setRate(rand.nextDouble(0.1, 0.2));
            baseLoanManager.showLoanDetails();
        } else if (choice == 2) {
            CarLoanManager carLoanManager = new CarLoanManager();
            System.out.println("You chose Car Loan.");
            System.out.print("Please enter principal amount: ");
            double principalAmount = sc.nextDouble();
            carLoanManager.setPrincipal(principalAmount);
            System.out.println("Please enter term months:");
            int termMonths = sc.nextInt();
            carLoanManager.setTermMonths(termMonths);
            System.out.println("Select insurance type:");
            System.out.println("1 - Basic (1000 TL)");
            System.out.println("2 - Standard (2000 TL)");
            System.out.println("3 - Premium (3500 TL)");
            int insuranceChoice = sc.nextInt();
            double insurancefee = 3;
            if (insuranceChoice == 1) {
                insurancefee = 1000;
            } else if (insuranceChoice == 2) {
                insurancefee = 2000;
            } else {
                insurancefee = 3500;
            }
            carLoanManager.setInsuranceFee(insurancefee);

            System.out.println("Enter your ID number:");
            String idNumber = sc.next();
            carLoanManager.setRate(rand.nextDouble(0.1, 0.2));
            carLoanManager.showLoanDetails();
            double totalWithInsurance = carLoanManager.calculateTotalPayment() + carLoanManager.getInsuranceFee();
            System.out.printf("Total payment including insurance fee: %.2f\n", totalWithInsurance);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}