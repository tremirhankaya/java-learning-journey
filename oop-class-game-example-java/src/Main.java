import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your player name!");
        String name = input.nextLine();
        System.out.println("Enter a enemy name!");
        String enemyName = input.nextLine();
        System.out.println(name + " is attacking to " + enemyName);
        character.CreateCharacter(name);
        character.Attack(enemyName, character);


    }
}