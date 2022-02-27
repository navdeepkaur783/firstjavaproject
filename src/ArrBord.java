public class ArrBord {

        public static void main(String args[])
        {

            int arr[][]=new int[][]{
                    {4,5,6},
                    {5,6,8},
                    {8,9,5},
                    {5,9,6},
                    {8,5,6}};

            for(int i=0;i<arr.length;i++)
            {
                for (int j=0;j<arr[i].length;j++)
                {
                    if (i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1)
                    {
                        System.out.print(arr[i][j]+"\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }




        }

    }


