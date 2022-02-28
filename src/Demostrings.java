import java.util.Locale;
import java.util.*;

public class Demostrings {
    public static void main(String args[])
    {

        System.out.println("Navdeep Code");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String s=sc.next();
        System.out.println("enter the index i");
        int i=sc.nextInt();
        System.out.println("Enter the index j");
        int j=sc.nextInt();
        swap(s,i,j);


    }
    public static void swap(String s,int i,int j)
    {
        char arr[]=s.toCharArray();
        System.out.println("Original String"+Arrays.toString(arr));
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.println("After swapping"+Arrays.toString(arr));
    }

}
