import java.util.Scanner;

public class EvenOdd
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int compNum=(int)(Math.random()*100);
        System.out.println(compNum);
        while(true)
        {
            System.out.println("Guess the Number:");
            int guessNum=sc.nextInt();
            if(guessNum==compNum)
            {
                System.out.println("Your guess is right");
                break;
            }
            System.out.println("Sorry,your guess was wrong.Try again...");
            if(guessNum<compNum){
                System.out.println("Hint: number is less than actual number");
            }
            else
            {
                System.out.println("Hint: number is greater than the actual number");
            }

        }

    }
}
