package com.company;

public class Vowel {
    String str="Navdeep";
    public int countVowel()
    {
        int count=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i) =='o'|| str.charAt(i)=='u') {
               count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Vowel v=new Vowel();
        System.out.println(v.countVowel());
    }
}
