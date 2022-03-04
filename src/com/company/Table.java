package com.company;

import java.util.Scanner;

public class Table {

    public void showTable(int n,int t)
    {
        for(int i=1;i<=t;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }

    public static void main(String[] args) {
        Table t=new Table();
        t.showTable(5,10);
    }
}
