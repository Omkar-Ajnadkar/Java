import java.util.*;

import javax.print.DocFlavor.STRING;

import java.io.*;

public class LessonSix{

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Arithmatic Exceptions
        divideByZero(2);
        System.out.println("How old are you?");
        int age = checkValidAge();

        // IO Exceptions
        if(age != 0){
            System.out.println("You are " + age + " yeras old!");
        }
        
        // File Exceptions
        getAFile("./a.txt");

        //Catching Exceptions in main method
        try {
            getAFile1("./om.txt");
        } catch (IOException e) {
            System.out.println("An IO Error Ocuured");
        }

    }

    public static void divideByZero(int a){
        try {
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("You can't do that....");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static int checkValidAge() {
        try{
            return userInput.nextInt();
        } catch(InputMismatchException e){
            userInput.next();
            System.out.println("That is not a whole number...");
            return 0;
        }
    }

    public static void getAFile(String filename) {
        try {
            FileInputStream file = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry can't find a file...");
        } catch (IOException e){
            System.out.println("Unknown IO Error");
        } catch (Exception e){
            System.out.println("Some error occured...");
        } finally{
            System.out.println("");
        }
    }

        public static void getAFile1(String filename) throws IOException, FileNotFoundException{
            FileInputStream file = new FileInputStream(filename);
        }
}