package com.bridgelabz.employeewagecomputation;
import java.util.Scanner;
import java.util.Random;

public class totalwageandworkinghours {
    class Input {
        void inPut(String comName) {
            System.out.println("The Company name is " + comName);
        }
    }

    class EmployeWage {
        int sum;
        int wdays;

        int tWage(int wags, int present) {
            sum = (wags * 8 * present);
            return sum;
        }

        int ranValue() {
            Random r = new Random();
            int random = r.nextInt(2);
            return random;
        }

        void display(int a, int wage) {
            System.out.println("Total wage is " + a);
            System.out.println("Total working days " + a / (wage * 8));
            System.out.println();
        }
    }
}
