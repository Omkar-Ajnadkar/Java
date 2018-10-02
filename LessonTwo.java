import java.util.Scanner;

public class LessonTwo
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Your fav. number: ");
        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);

            int numberEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + "+" + numberEntered + "=" + numberEnteredTimes2);

            System.out.println(numberEntered - 10);
            System.out.println(numberEntered * 10);
            System.out.println(numberEntered /10);
            System.out.println(numberEntered % 10);

            numberEntered += 2;
            numberEntered -= 10;

            numberEntered--;
            numberEntered++;

            int numberABS = Math.abs(numberEntered);

            int bigger = Math.max(5, 7);
            int smaller = Math.min(5, 7);

            double numSqrt = Math.sqrt(5.23);
            
            int numCeiling = (int) Math.ceil(5.23); //6
            int numFloor = (int) Math.floor(5.23); // 5

            int numRound1 = (int) Math.round(5.23); // 5
            int numRound2 = (int) Math.round(5.23); // 5

            int randomNumber = (int) (Math.random() * 10);
            System.out.println(randomNumber);

        } else{
            System.out.println("Enter an integer next time");
        }
    }
} 