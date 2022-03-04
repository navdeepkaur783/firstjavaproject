package com.company;

public class Bodymass {
    public double bodyMassIndex(double height,double weight)
    {
        double bmi=weight/(height*height);
        return bmi;
    }


    public static void main(String[] args) {
        Bodymass bm=new Bodymass();
        System.out.println(bm.bodyMassIndex(1.75, 73));

    }
}
