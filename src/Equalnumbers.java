import java.util.Scanner;

public class Equalnumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter First number");
        int a=sc.nextInt();
        System.out.println("enter Second number");
        int b=sc.nextInt();
        System.out.println("enter Third number");
        int c=sc.nextInt();

        if (a==b && b==c)
        {
            System.out.println("Numbers are equal");
        }
    }

}
