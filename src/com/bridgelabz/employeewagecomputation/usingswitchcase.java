package com.bridgelabz.employeewagecomputation;

import java.util.Random;

public class usingswitchcase {
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
    public static void present(int a) {
        int num=randomnumber(a);
        switch(num) {
            case 1: System.out.println("Employee Present");
                System.out.println("Wage of Employee is "+(20*8));
                break;
            case 0:System.out.println("Employe are Absent");
                System.out.println("Wage of Employee is "+0);
        }


    }
    public static void main(String[] args) {
        present(randomnumber(0));
    }
}
