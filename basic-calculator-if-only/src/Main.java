import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please select an operation:\n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication\n" +
                "4 - Division");
        int operation = input.nextInt();

        if(operation>=1 && operation<= 4){
            System.out.println("Please enter the first number:");
            int firstNumber = input.nextInt();
            System.out.println("Please enter the second number:");
            int secondNumber = input.nextInt();

            if (operation == 1) {
                int result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
            }
            else if (operation == 2) {
                int result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
            }
            else if (operation == 3) {
                int result = firstNumber * secondNumber;
                System.out.println("The result is: " + result);
            }
            else if (operation == 4) {
                if(secondNumber==0){
                    System.out.println("Invalid operation ");
                }
                int result = firstNumber / secondNumber;
                System.out.println("The result is: " + result);
            }



        } else{
            System.out.println("Invalid input");
        }


    }
}