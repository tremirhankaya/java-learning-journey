import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        String reverseWord="";
        for (int i =word.length()-1 ; i >= 0; i--) {
            reverseWord += word.charAt(i);

        }
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.println("The word is palindrome");}
        else {
            System.out.println("The word is not palindrome");
        }

    }
}