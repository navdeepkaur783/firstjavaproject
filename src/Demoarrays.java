public class Demoarrays {
    public static void main(String[] args) {
      /*  int a[][]={{3,4,5},{5,6,7}};
        int b[][]={{8,4,5},{3,5,2}};
        int c[][]=new int[2][3];
        for (int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
*/
        System.out.println("Hello");
        int []arr={45,69,89};
        int carr[]=new int[3];
        System.arraycopy(arr,0,carr,0,3);
        for (int i:carr) {
            System.out.println(i);

        }
        System.out.println(arr==carr);
    }
}