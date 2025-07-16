import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int suma=0;
        int sumb=0;

        for (int i = 1; i < a; i++) {
            if (a% i == 0) {
                suma += i;
            }
        }
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                sumb += i;
            }
        }
        if (suma == b && sumb == a) {
            System.out.println("Friendly Number");
        }else{
            System.out.println("Not Friendly Number");
        }

    }
}