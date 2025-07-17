import java.util.Random;

public class GameCharacter {
    String name;

    java.util.Random rand = new java.util.Random();

    public void CreateCharacter(String name) {
        this.name = name;
    }

    public void Attack(String enemyName, GameCharacter character) {
        int enemyAttackPower = rand.nextInt(100);
        int characterAttackPower = rand.nextInt(100);

        if (enemyAttackPower == characterAttackPower) {
            System.out.println("You offered a flower to " + enemyName + ", and you both made peace.");
        } else if (enemyAttackPower > characterAttackPower) {
            int damageTaken = enemyAttackPower - characterAttackPower;
            System.out.println("You took " + damageTaken + " damage from " + enemyName + ".");
            System.out.println("You have been defeated!");
        } else {
            int damageDealt = characterAttackPower - enemyAttackPower;
            System.out.println("You dealt " + damageDealt + " damage to " + enemyName + ".");
            System.out.println(enemyName + " has been defeated by you.");
        }
    }
}
