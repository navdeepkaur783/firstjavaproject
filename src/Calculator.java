import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        System.out.println("Operation to be performed");
        char operation=sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Addition of two numbers is"+(a+b));
                break;
            case '-':
                System.out.println("Difference of two numbers is"+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is"+(a*b));
                break;
            case '/':
                System.out.println("Division of two numbers is"+(a/b));
                break;
            case '%':
                System.out.println("Modulus of two numbers is"+(a%b));
                break;
            default:
                System.out.println("Wrong input");
                break;

        }
    }
}
