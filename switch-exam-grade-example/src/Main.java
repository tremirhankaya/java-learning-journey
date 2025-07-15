import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Great!");
                break;
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("Fine");
            case 'D':
                System.out.println("Failed");
            case 'F':
                System.out.println("Disaster");
            default:
                System.out.println("Unknown");
        }

    }
}
