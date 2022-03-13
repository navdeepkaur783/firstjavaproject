package com.company;

public class Student {

    public int studentId;
    public String studentName;
    String studentAddress;
    public static final String GRADE="A";
    public String toString()
    {
        return studentId + studentName +studentAddress;
    }

    public Student(int studentId,String studentName,String studentAddress)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }

    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    //instance level
    public void greet()
    {
        System.out.println("Hello World");
    }
    //static variables will be accessed through static methods;
    public static void printGrade()
    {
        System.out.println("Student Grade"+GRADE);
    }


    public static void main(String[] args) {

    }
}
