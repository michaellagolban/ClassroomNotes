/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroomnotes;

import java.util.Scanner;

/**
 * This program is a loan calculator. User should introduce his name, amount of money that he want to borrow and period
 * of time. As a result the program will show the amount of extra money that should be paid, and monthly rate.
 *
 * @author Michaela
 */
public class SmthInteresting {


    public static void main(String[] args) {
        System.out.print("Enter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter loan amount: ");
        //this is an example how you can read a double number
        double loan = scanner.nextDouble();
        System.out.print("Enter period : ");
//        TODO add sequence of code that will read the period of time (which is an int)
//        int period = ?????;
        int period;

        // so now we have our name, loan amount and period of time, so we can calculate our percentage!
        //The important thing is to specify dot after each number. If you don't put a dot, the compiler will interpret
//        this number as integer and the result of your division will be always 1.
//      you could try this one and print the result to see the difference:   double percentage = 1 + 8 / 100 / 4 * period;
        double percentage = 1. + 8. / 100. / 4. * period;

        // Having the percentage we can calculate our total amount:
        double totalAmount = loan * percentage;
        // Having total amount we can calculate extra interest that we should pay:
        double interest = totalAmount - loan;
        // Also having total amount we can calculate monthly rate:
        double monthlyRate = totalAmount / (period * 12);

        // And the final messages
        System.out.println("user: " + name + " wanna take: " + loan + "$ for " + period + " year(s)");

        //TODO In this format the number will be printed as is, you should change the code in order to print the number
        // with 2 decimal. as example: original monthlyRate=36.666666666666664 should be printed as 36.66$
        System.out.println("Total interest to paid: " + interest + "$");
        System.out.println("Monthly payments rates: " + monthlyRate + "$");

    }

    //TODO when you complete this task i wanna you to change this program in order to accept the rate of loan to be introduced by user
    //TODO now it's fix 8%/year

}
