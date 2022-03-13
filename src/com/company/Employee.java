package com.company;

public class Employee
{
    double hourlyRate;
    double bonus;
    int hourWorked;
    int overTimeHours;
    // implement overload method to calculate wage with overtime
    // bonus and normal hours
    public double calWages(){
        return hourWorked*hourlyRate;
    }
    public double calWages(int hourWorked,int overTimeHours,double hourlyRate)
    {
        return calWages()+(overTimeHours*1.5*hourlyRate);
    }
    public double calWages(int bonus)
    {
        return calWages(hourWorked,overTimeHours,hourlyRate)+ bonus;
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp.calWages(20, 5, 15.85));
        System.out.println(emp.calWages(200));
    }
}


