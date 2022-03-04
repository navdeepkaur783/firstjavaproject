import java.util.Scanner;

public class SumMultiple
{

    int sum=0;
    public int multiple(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumMultiple sm=new SumMultiple();
        System.out.println(sm.multiple(20));
    }
}
