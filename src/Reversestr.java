public class Reversestr {
    public static void main(String args[])
    {
        String name="MADAM";
        char arr[]=name.toCharArray();
        char  []reverse=new char[name.length()];
        int length=arr.length;
        int lastindex=length-1;
        System.out.println(lastindex);
        for(int i=0;i<=lastindex;i++)
        {
            reverse[lastindex-i]=arr[i];
        }
        String rev=new String(reverse);
        System.out.println(reverse);
        if (rev.equals(name))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }

}
