/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalclassroomnotes;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alexandr.capatina
 */
public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Yout name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter loan amount: ");
        double loan = scanner.nextDouble();
        
        System.out.print("Enter period: ");
        int period = scanner.nextInt();
          
        double percentage = 1.+ 8./100./4. * period;
        double totalAmount = loan * percentage;
        double interest = totalAmount - loan;
        double mounthlyRate = totalAmount / (period * 12);
        
        DecimalFormat df2 = new DecimalFormat(".##");
        
        System.out.println("user: " + name +" wanna take " + loan + " $ for " + period + " years. ");
        System.out.println("Total interest to paid: " + interest + "$");
        System.out.println("Total amount to paid: " + totalAmount + "$");
        System.out.println("Mounthly payments rates: " + df2.format(mounthlyRate) + " $");
    }
}