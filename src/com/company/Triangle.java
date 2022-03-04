package com.company;

public class Triangle {
    public void displayPattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.displayPattern(6);
    }
}
