import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size");
        int[] numbers = new int[sc.nextInt()];
        int index=0;
        int sum=0;

        while(true){
            if(index==numbers.length){
                break;
            }
            System.out.println("Enter a number");
            numbers[index] = sc.nextInt();

            index++;
        }

        for(int n:numbers){
            sum+=n;
        }
        double average= (double) sum/numbers.length;
        System.out.println("Sorted Array "+Arrays.toString(numbers));
        System.out.println("Average "+average);
        }


    }
