import java.util.Scanner;

public class Demo2 {
    public static void main(String args[])
    {

        fibonacci(15);
    }
    public static void fibonacci(int n){
        int i=0,n1=0,n2=1;



        while(i<n)
        {
            System.out.print(n1+" ");
            int fib=n1+n2;
            n1=n2;
            n2=fib;
            i++;

        }
    }

}
