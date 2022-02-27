import java.util.Scanner;

public class Arraydemo
{
    public static void main(String args[])
    {
        float arr[]=new float[10];
        float sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 decimal numbers");
        for (int i=0;i<10;i++)
        {
            arr[i]=sc.nextFloat();
        }
        for(int j=0;j<10;j++) {
            sum=sum+arr[j];
        }
        System.out.println("Sum of first 10 decimal numbers is = "+sum);

    }
}
