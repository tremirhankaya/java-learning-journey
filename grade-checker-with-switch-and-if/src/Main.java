import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your midterm score");
        int midtermScore = input.nextInt();
        System.out.println("Enter your midterm weight %");
        int midtermWeight = input.nextInt();
        System.out.println("Enter your final score");
        int finalScore = input.nextInt();
        float score = (float) (midtermScore * (midtermWeight / 100f) + finalScore * ((100 - midtermWeight) / 100f));
        char grade = 'F';
        if (score > 100 || score < 0) {
            System.out.println("Invalid score");
        }else if(finalScore<50){
            grade = 'N';
        } else if (score > 90) {
            grade = 'A';
        } else if (score < 90 && score >= 80) {
            grade = 'B';
        } else if (score < 80 && score >= 60) {
            grade = 'C';
        } else if (score < 60 && score >= 50) {
            grade = 'D';
        } else if (score < 50) {
            grade = 'F';

        }
        switch (grade) {
            case 'A':
                System.out.println("Score:" +score+" Grade:" +grade+" Excellent performance! Congratulations!");
                break;
            case 'B':
                System.out.println("Score:" +score+" Grade:" +grade+" Great job! Keep it up.");
                break;
            case 'C':
                System.out.println("Score:" +score+" Grade:" +grade+" Good effort, but there’s room for improvement.");
                break;
            case 'D':
                System.out.println("Score:" +score+" Grade:" +grade+" You passed, but try to study more next time");
                break;
            case 'F':
                System.out.println("Score:" +score+" Grade:" +grade+" You failed the course.");
                break;
            case 'N':
                System.out.println("Score:" +score+" Grade:" +grade+" You failed because your final score is below 50.");
                break;
            default:
                System.out.println("Invalid grade");
                break;


        }

    }
}

