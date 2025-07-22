import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    getFileInfo();
    writeFile();
    readFile();

    }
    public static void createFile(){
        File file = new File("C:\\Users\\ekaya\\Desktop\\JavaLearning\\Files\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\ekaya\\Desktop\\JavaLearning\\Files\\students.txt");
        if(file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Can read: " + file.canRead());
            System.out.println("File size(byte): " + file.length());
        }
    }
    public static void readFile(){
        File file = new File("C:\\Users\\ekaya\\Desktop\\JavaLearning\\Files\\students.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ekaya\\Desktop\\JavaLearning\\Files\\students.txt",true));
            writer.newLine();
            writer.append("İlayda");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}