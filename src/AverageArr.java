
public class AverageArr {
    public static void main(String args[])
    {

        int arr[][]=new int[][]{
                {4,5,6},
                {5,6,8},
                {8,9,5},
                {5,9,6},
                {8,5,6}};

        for (int i=0;i<3;i++)
        {
            int sum=0;
            for (int j=0;j<5;j++)
            {
                sum=sum+arr[j][i];

            }
            System.out.println("Sum of  "+(i+1)+" column "+sum);
            System.out.println("average of "+(i+1)+" column "+(sum/arr.length));
        }




    }

}
