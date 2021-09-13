/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;



public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");


        System.out.print("What is the order amount? ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("What is the state? ");
        String state = scanner.nextLine();

        System.out.print("The subtotal is $" + df.format(amount)+".");


        //if state is WI
        if (state.equalsIgnoreCase("wi")) {


            double tax = amount * 0.055;
            System.out.print("\nThe Tax is $" + tax+".");


            amount = amount + tax;
            System.out.print("\nThe total is $" + df.format(amount)+".");


        }
    }
}
