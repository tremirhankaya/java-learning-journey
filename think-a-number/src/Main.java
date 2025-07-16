import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int attempts=0;
        int randomNumber = rand.nextInt(50) + 1;
        while(true){
            System.out.println("Guess the number (between 1 and 50):");
            int guess = input.nextInt();
            attempts++;
            if(randomNumber == guess){
                break;
            }
            else if(randomNumber > guess){
                System.out.println("Try again with higher number!");
            }else if(randomNumber < guess){
                System.out.println("Try again  with lower number!");
            }

        }
        System.out.println("You guessed it! The number was " + randomNumber +
                " and you found it in " + attempts + " attempts.");


    }
    }
