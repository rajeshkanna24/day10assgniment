package com.bridgelabz.employeewagecomputation;

import java.util.Random;
import java.util.Scanner;

public class multipilecompamies {
    static int totalday=0;
    public static int Company(String name, int days, int wage) {
        int a;
        System.out.println("Name Of Company is : "+name);
        System.out.println("Working Days in Month is : "+days);
        System.out.println("Wage per hour is : "+wage);
        for(int i=0;i<days;i++)
        {
            Random random =new Random();
            a=random.nextInt(2);
            if(a==1)
            {
                totalday++;
            }
        }
        return totalday;
    }
    public static void month(int totalday,int wage)
    {
        System.out.println("Total Wage of the month is :: "+totalday*wage*8);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Company Name :-");
        String Name=sc.next();
        System.out.println("Enter Monthly Days of Working :-");
        int Days=sc.nextInt();
        System.out.println("Enter Wage Per Hours :-");
        int Hour=sc.nextInt();
        int totaldays= Company(Name,Days,Hour);
        month(totaldays,Hour);
    }
}
