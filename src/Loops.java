import javax.swing.*;
import java.util.Scanner;

public class Loops
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int compNumber=(int)(Math.random()*100);
        System.out.println(compNumber);

        while (true)
        {
            System.out.println("Guess the Number");
            int userInput=sc.nextInt();
            if (userInput==compNumber)
            {
                System.out.println("You guessed it right");
                break;
            }

                System.out.println("Try again");
                if (userInput>compNumber)
                {
                    System.out.println("Hint: this number is greater than actual number ");
            }
                else
                {
                    System.out.println("Hint: this number is less than actual number");
                }

        }
    }

}
