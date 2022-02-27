import java.util.Scanner;

public class Swap
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();

        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After swapping values:"+" "+"first number= "+a+" Second number is= "+b);
    }

}
