package com.company;

import java.util.Arrays;

public class Midcharacter {
    String str="123546";
    public String calculateMid()
    {
        int position, l;
            if(str.length() % 2==0)
            {
                position =(str.length()/2)-1;
                l=2;
            }
            else {
                position= str.length()/2;
                l=1;
            }
            return str.substring(position,position+l);
    }

    public static void main(String[] args) {
        Midcharacter m=new Midcharacter();
        System.out.println(m.calculateMid());
    }
}
