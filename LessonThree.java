import java.util.Scanner;

public class LessonThree {

    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 50);

        //relational operators
        if (randomNumber < 25)
        {
            System.out.println("Less than 25");
        }
        else if (randomNumber >= 40)
        {
            System.out.println("Not greater than 40");
        }
        else if (randomNumber != 18) {
            System.out.println("It's not 18");
        }
        else{
            System.out.println("Nothing worked!!!");
        }
        System.out.println("Number :" + randomNumber);

        //logical operators
        if (!(false)) //NOT
        {
            System.out.println("Turned false into true");
        }        
        if ((true) && (true)) //AND
        {
            System.out.println("Both are true");
        }
        if ((false) || (true)) //OR
        {
            System.out.println("Both are true");
        }
        if ((false) ^ (true)) //XOR
        {
            System.out.println("Both are true");
        }

        //ternary operator
        int valOne = 1;
        int valTwo = 2;

        int biggestVal = (valOne > valTwo) ? valOne : valTwo;
        System.out.println(biggestVal);

        //switch

        char theGrade = 'B';
        switch (theGrade) {
            case 'A':
            case 'a':
                System.out.println("Great Job");
                break;
            
            case 'B':
            case 'b':
                System.out.println("Good job");
        
            default:
                System.out.println("It's OK");
                break;
        }
    }
}