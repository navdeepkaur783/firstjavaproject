package com.company;

public class Strfunc {
    String str="Java Programming is better than python.";
    String str1="CPP is almost similar.";
    public void stringCount()
    {
        int count=str.length();
        System.out.println("String count is"+count);
        String newstr =str.replace("python","pascal");
        System.out.println(newstr.concat(str1));

    }
// Java Programming is better than Pascal. CPP is almost similar
    public static void main(String[] args) {
        Strfunc st=new Strfunc();
        st.stringCount();

    }
}
