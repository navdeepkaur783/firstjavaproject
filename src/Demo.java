import java.util.Scanner;

public class Demo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month=sc.nextInt();
        monthNumber(month);

    }

    public static void monthNumber(int month)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Month has 31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Month has 30 days");
        } else {
            System.out.println("Month is February");
        }
    }
}