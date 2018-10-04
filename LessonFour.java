import java.util.Scanner;

public class LessonFour{

    static Scanner userINput = new Scanner(System.in);

    public static void main(String[] args) {
        
        //while loop and continue, break statements
        int i=1;
        while(i <= 20){
            if(i==3){
                i += 2;
                continue;
            }
            System.out.println(i);
            i++;

            if((i%2 == 0)){
                i++;
            }

            if(i>10){
                break;
            }
        }

        //calculate value of PI
        double myPi = 4.0;
        double j = 3.0;
        while(j < 10){
            myPi = myPi - (4/j) + (4/(j+2));
            j += 4;
            System.out.println(myPi);
        }
        System.out.println(myPi);


        //stop while loop by user input
        String contYorN = "Y";
        int h=1;
        while(contYorN.equalsIgnoreCase(("y"))){
            System.out.println(h);
            System.out.println("Continue Y or N");
            contYorN = userINput.nextLine();
            h++;
        }

        //do..while
        int k=100;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);

        //for loop
        for (int l = 10; l >= 1; l--) {
            System.out.println(l);
        }

        int m,n;
        for (m=1, n=2; m <= 9; m+=2, n+=2) {
            System.out.println(m + "\n" + n);
        }
    }
}