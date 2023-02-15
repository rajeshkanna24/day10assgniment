package com.bridgelabz.employeewagecomputation;
import java.util.Scanner;
public class main {
    public class Main {

        public static void main(String[] args)
        {
            String comName;
            int wage;
            int wDays;
            int sum = 0;
            int b = 0;

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter How namy companire You have enter");
            int noCom=sc.nextInt();
            for(int a=0;a<noCom;a++) {
                System.out.println("Enter Company Name is ");
                comName=sc.next();
                System.out.println("Enter Wage per Hour ");
                wage=sc.nextInt();
                System.out.println("Enter Days of Working ");
                wDays=sc.nextInt();


                for(int i=0;i<wDays;i++)
                {
                    EmployeWage ew=new EmployeWage();
                    int c=ew.ranValue();  //random value
                    b=b+ew.tWage(wage, c); //calculate wage
                }
                Input in=new Input();
                in.inPut(comName);
                EmployeWage ew1=new EmployeWage();
                ew1.display(b,wage);
            }
        }
}
