import java.util.*;

public class Utilstr
{
    public static int indexOf(int arr[],int b)
    {

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==b);
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int arr[],int b)
    {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==b) {
                return true;
            }
        }
        return false;
    }

    public static int charAt(int arr[],int i)
    {

            return arr[i];
    }



    public static void main(String args[])
    {

        int arr[]={10,20,30,40,50};
        String str=Arrays.toString(arr);
        System.out.println("String is"+ str);
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the index");

        int index=sc.nextInt();
          int in=indexOf(arr,index);
        System.out.println("index of element entered is found at "+in+" index");
        System.out.println("Enter the element to be searched");
        int element=sc.nextInt();
       boolean c= contains(arr,element);
        System.out.println(c);
        int character=charAt(arr,index);
        System.out.println(character +"Char at index "+index+" is "+character);

    }

}
