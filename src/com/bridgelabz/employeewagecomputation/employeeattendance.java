package com.bridgelabz.employeewagecomputation;

import java.util.Random;

public class employeeattendance {
    public static  int randomnumber(int a)
    {
        Random random =new Random();
        a=random.nextInt(2);
        return a;

    }
    public static void present(int a) {
        int num=randomnumber(a);
        if(num==1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
    public static void main(String[] args) {

        System.out.println("WelCome In Employee Wage Computation");
        present(randomnumber(0));
    }

}
