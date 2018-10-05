import java.util.Scanner;

public class LessonFive{

    static double myPI = 3.14159; //class variable

    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        addThem(1, 2);


        System.out.println(getRandomNumber());
        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult != -1){
            System.out.println("Guess a number between 0 to 50: ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }

    }

    public static int addThem(int a, int b){
        double smallPI = 3.140; //local variable
        int d=5;
        tryToChange(d);
        System.out.println("Main d: " + d);
        return a+b;
    }

    public static void tryToChange(int d) {
        d=d+1;
        System.out.println("tryToChange d = " + d);
    }

    public static int getRandomNumber() {
        randomNumber = (int)(Math.random()*51);
        System.out.println(randomNumber);
        return randomNumber;
    }

    public static int checkGuess(int guess) {
        if(guess == randomNumber){
            return -1;
        }else{
            return guess;
        }
    }
}