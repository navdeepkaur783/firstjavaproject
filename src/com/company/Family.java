package com.company;

public class Family {
    String fatherName;
    String motherName;
    String sonName;
    String daughterName;
    double fatherSalary;
    double motherSalary;
    double sonFee;
    double daughterfee;
    int grocery;

    public Family(String fName,String mName,String sName,String dName,double fSalary,double mSalary,double sFee,double dfee)
    {
        fatherName=fName;
        motherName=mName;
        sonName=sName;
        daughterName=dName;
        fatherSalary=fSalary;
        motherSalary=mSalary;
        sonFee=sFee;
        daughterfee=dfee;
    }
    public void displayName(String fName,String mName,String sName,String dName)
    {
        System.out.println("Father Name is "+fName+" Mother Name is "+mName+" Son's name is "+sName+" Daughter's name is "+dName);

    }
    public double getTotalSalary()
    {
        double totalSalary=fatherSalary+motherSalary;
        return totalSalary;
    }
    public double getTotalFees(){
        double totalFees=sonFee+daughterfee;
        return totalFees;
    }
    public double getSavings()
    {
        double savings=(fatherSalary+motherSalary)-(sonFee+daughterfee)-grocery;
        return savings;
    }
    public void checkSavings()
    {
        double savings=(fatherSalary+motherSalary)-(sonFee+daughterfee)-grocery;
        if (savings>1000)
        {
            System.out.println("Congratulation!! "+fatherName+ " you saved = "+savings);
        }
        else{
            System.out.println("“Dear "+fatherName+ "Please try to save for next month");
        }
    }



    public static void main(String[] args) {
        Family f=new Family("Rohit","Radha","Sam","Ridhi",10000,20000,5000,6000);
        f.getTotalSalary();
        f.getTotalFees();
        f.getSavings();
        f.checkSavings();

    }
}
