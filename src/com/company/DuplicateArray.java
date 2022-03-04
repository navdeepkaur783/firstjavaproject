package com.company;

public class DuplicateArray {
    int arr[]={1, 2, 5, 5, 6, 6, 7, 2};
    public void duplicateValue()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate array"+arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicateArray da=new DuplicateArray();
        da.duplicateValue();
    }
}
