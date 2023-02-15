package com.bridgelabz.employeewagecomputation;

import java.util.Random;

public class monthwage {
    public static void main(String[] args) {
        int totalday=0;
        for(int i=0;i<20;i++) {
            Random random =new Random();
            int a=random.nextInt(2);
            if(a==1) {
                totalday++;
            }
        }
        System.out.println("Total Wage of the month is "+totalday*8*20);
    }
}
