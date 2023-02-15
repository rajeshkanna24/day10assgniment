package com.bridgelabz.employeewagecomputation;
import java.util.Random;
import java.util.Scanner;

public class multipilecompanies {

    public class EmployeWage{
        private int employeeId;
        private CompanyWage[] companyWage;
        public EmployeWage(int employeeId, CompanyWage[] companyWage) {
            super();
            this.employeeId = employeeId;
            this.companyWage = companyWage;
        }
        EmployeWage()
        {

        }
        public int getEmployeeId() {
            return employeeId;
        }
        public CompanyWage[] getCompanyWage() {
            return companyWage;
        }
        public void printInfo()
        {
            System.out.println("Employee Id is :: "+employeeId);
            System.out.println();
            for(CompanyWage cw:companyWage)
            {      System.out.println("Company Name is :: "+cw.getCompanyName());
                cw.calculateWage();
                System.out.println();
            }
        }

}
