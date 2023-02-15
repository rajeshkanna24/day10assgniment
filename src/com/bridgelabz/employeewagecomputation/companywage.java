package com.bridgelabz.employeewagecomputation;
import java.util.Random;
public class companywage {

    public class CompanyWage {

        private String companyName;
        private int companyWage;
        static int totalPresenti;
        public CompanyWage(String companyName, int companyWage) {
            super();
            this.companyName = companyName;
            this.companyWage = companyWage;

        }

        public String getCompanyName() {
            return companyName;
        }

        public int getCompanyWage() {
            return companyWage;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
        public void setCompanyWage(int companyWage) {
            this.companyWage = companyWage;
        }
        public void calculateWage() {
            int presente;

            for(int i=0;i<31;i++)
            {    Random random=new Random();
                presente=random.nextInt(2);
                if(presente==1)
                    totalPresenti++;
                System.out.println(totalPresenti);
            }
            System.out.println("Total wage of "+getCompanyName()+" Company is "+getCompanyWage()*totalPresenti);
            totalPresenti=0;
        }
}
