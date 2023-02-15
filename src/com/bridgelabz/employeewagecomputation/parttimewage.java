package com.bridgelabz.employeewagecomputation;

import java.util.Random;

public class parttimewage {
    public static  int randomnumber(int a)
    {
        Random random =new Random();
        a=random.nextInt(2);
        return (a);

    }
    public static  int randPartTime(int a)
    {
        Random random =new Random();
        a=random.nextInt(2);
        return (a);

    }
    public static void present(int a,int b) {
        int num=randomnumber(a);
        int num1=randPartTime(b);
        if(num==1 && num1==1)
        {
            System.out.println("Employee is Present And Also Do Part time work");
            System.out.println("Wage of the day is ::"+(20*8)*2);
        }
        else if(num==1 && num1==0)
        {
            System.out.println("Employee is Present ");
            System.out.println("Wage of the day is ::"+(20*8));
        }
        else if(num==0 && num1==1)
        {
            System.out.println("Employee Do Part time work");
            System.out.println("Wage of the day is ::"+(20*8));
        }
        else{
            System.out.println("Employee is Absent");
        }

    }
    public static void main(String[] args) {

        present(randomnumber(0), 0);
    }
}
