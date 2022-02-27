import java.util.Scanner;

public class Student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the English marks");
        double eng=sc.nextDouble();
        System.out.println("Enter the Maths marks");
        double maths=sc.nextDouble();
        System.out.println("Enter the Physics marks");
        double phy=sc.nextDouble();
        System.out.println("Enter the Chemistry marks");
        double chem=sc.nextDouble();
        System.out.println("Enter the Economics marks");
        double eco=sc.nextDouble();

        double total= eng + maths + phy + chem + eco;
        System.out.println("Total Marks:"+" "+total);
        double avg=total/5;
        System.out.println("Average of marks:"+" "+avg);

        if (avg > 80)
        {
            System.out.println("Grade A");
        }
        if (avg >=70 && avg <80)
        {
            System.out.println("Grade B");
        }
        if (avg >=60 && avg <70)
        {
            System.out.println("Grade C");
        }
        if (avg <60)
        {
            System.out.println("Grade D");
        }

    }

}
