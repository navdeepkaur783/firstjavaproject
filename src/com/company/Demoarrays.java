package com.company;

import java.util.Arrays;

public class Demoarrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,4,2,8};
        int newarr[]=new int[arr.length];
        int vis=-1;

        for (int i=0;i< arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j< arr.length;j++) {
                if (arr[i] == arr[j]) ;
                {
                    count++;
                    newarr[j] = vis;
                }
            }
                if(newarr[i]!=vis)
                {
                    newarr[i]=count;
                }


            //System.out.println();
        }
        for(int i=0;i< newarr.length;i++)
        {
            if(newarr[i]!=vis)
            {
                System.out.println(arr[i]+ "  "+newarr[i]);
            }
        }


    }
}
