package com.bridgelabz.employeewagecomputation;

import java.util.Random;

public class maxhoursinmonth {
    public static void month(int hr)
    {
        if(hr>100 ) {
            System.out.println("Total Wage in this month of the Employee is "+(hr*20));
        }
        else {
            System.out.println("Employee have not fullfill Day and Hours requirment ");
        }
    }
    public static void main(String[] args) {
        int totalday=0;
        for(int i=0;i<20;i++) {
            Random random =new Random();
            int a=random.nextInt(2);
            System.out.println(a);
            if(a==1) {
                totalday++;
                System.out.println(totalday);
            }
        }
        month(totalday*8);
    }
}
