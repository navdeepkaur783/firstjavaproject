package com.company;

public class Reversestr {
    public void reverseArray()
    {
        String  reverse="";
        String str="ASSIGNMENT";
        System.out.println(str.toCharArray());
        char ch[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        System.out.println("Char Array is " );
        for(char c:ch)
        {
            System.out.print(" " +c);
        }
        for(int j=ch.length-1;j>=0;j--)
        {
            reverse=reverse+ch[j];
        }

        System.out.println("\n Reversed Array is "+reverse);
    }
    public static void main(String[] args) {
        Reversestr rv=new Reversestr();
        rv.reverseArray();
    }
}
